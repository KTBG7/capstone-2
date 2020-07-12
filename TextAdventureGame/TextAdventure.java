package TextAdventureGame;

import java.util.Scanner;
import java.io.File;

public class TextAdventure {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        getData data = (filename) -> {
            Scanner file = null;
            try {
                file = new Scanner(new File(filename));
            } catch (java.io.IOException e) {
                System.err.println("Can't open '" + filename + "'.");
                System.exit(1);
            }
            int numchoices = file.nextInt();
            Choice[] choices = new Choice[numchoices];

            int choiceNum = 0;
            while (file.hasNext()) {
                Choice c = getChoice(file);

                if (c.choiceNumber != choiceNum) {
                    System.err.println("Just read choice # " + c.choiceNumber);
                    System.err.println(", but " + choiceNum + " was expected.");
                    System.exit(2);
                }
                choices[choiceNum] = c;
                choiceNum++;
            }
            file.close();
            return choices;
        };
        Choice[] choices = data.loadchoicesFromFile("data.txt");

        int currentchoice = 0;
        String ans;
        while (currentchoice >= 0) {
            Choice cur = choices[currentchoice];
            System.out.println(cur.description);
            System.out.println("================================ ");
            ans = userInput.nextLine();
            // this is used to check if any of the choice's that are typed matches
            boolean found = false;
            for (int i = 0; i < cur.numExits; i++) {
                if (cur.exits[i].equals(ans)) {
                    // if they match it'll change the next choice to that choice's number
                    System.out.println("================================");
                    currentchoice = cur.destinations[i];
                    found = true;
                }
            }
            if (!found) {
                System.out.println("That wasn't a choice!");
            }
        }
        userInput.close();
    }

    public static void showAllchoices(Choice[] choices) {
        for (Choice c : choices) {
            String exitString = "";
            for (int i = 0; i < c.numExits; i++) {
                exitString += "\t" + c.exits[i] + " (" + c.destinations[i] + ")";
                System.out.println(c.choiceNumber + ") " + c.choiceName);
                System.out.println(exitString);
            }
        }
    }

    public static Choice getChoice(Scanner f) {
        if (!f.hasNextInt()) {
            return null;
        }
        Choice c = new Choice();
        String line;

        // this will read the choice number to check for errors
        c.choiceNumber = f.nextInt();
        f.nextLine();

        c.choiceName = f.nextLine();

        c.description = "";
        while (true) {
            line = f.nextLine();
            if (line.equals("%%")) {
                break;
            }
            c.description += line + "\n";
        }

        int i = 0;
        while (true) {
            line = f.nextLine();
            if (line.equals("%%")) {
                break;
            }
            String[] parts = line.split(":");
            c.exits[i] = parts[0];
            c.destinations[i] = Integer.parseInt(parts[1]);
            i++;
        }
        c.numExits = i;
        return c;
    }

}

interface getData {
    public Choice[] loadchoicesFromFile(String filename);
}