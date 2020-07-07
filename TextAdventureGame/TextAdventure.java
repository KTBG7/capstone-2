package TextAdventureGame;

import java.util.Scanner;

class Room {
    int roomNumber;
    String roomName;
    String description;
    int numExits;
    String[] exits = new String[10];
    int[] destinations = new int[10];
}

public class TextAdventure {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        Room[] rooms = loadRoomsFromFile("text-adventure-rooms.txt");

        int currentRoom = 0;
        String ans;
        while (currentRoom >= 0) {
            Room cur = rooms[currentRoom];
            System.out.println(cur.description);
            System.out.println("> ");
            ans = userInput.nextLine();
            // this is used to check if any of the exits that are type matches
            boolean found = false;
            for (int i = 0; i < cur.numExits; i++) {
                if (cur.exits[i].equals(ans)) {
                    // if they match it'll change the next room to that exits number
                    currentRoom = cur.destinations[i];
                    found = true;
                }
            }
            if (!found) {
                System.out.println("Sorry, that room was not found");
            }
        }
    }

    public static Room[] loadRoomsFromFile(String filename) {
        Scanner file = null;
        try {
            file = new Scanner(new java.io.File(filename));
        } catch (java.io.IOException e) {
            System.err.println("Can't open '" + filename + "' for reading.");
            System.exit(1);
        }
        int numRooms = file.nextInt();
        Room[] rooms = new Room[numRooms];

        int roomNum = 0;
        while (file.hasNext()) {
            Room r = getRoom(file);

            if (r.roomNumber != roomNum) {
                System.err.println("Just read room # " + r.roomNumber);
                System.err.println(", but " + roomNum + " was expected.");
                System.exit(2);
            }
            rooms[roomNum] = r;
            roomNum++;
        }
        file.close();
        return rooms;
    }

    public static void showAllRooms(Room[] rooms) {
        for (Room r : rooms) {
            String exitString = "";
            for (int i = 0; i < r.numExits; i++) {
                exitString += "\t" + r.exits[i] + " (" + r.destinations[i] + ")";
                System.out.println(r.roomNumber + ") " + r.roomName);
                System.out.println(exitString);
            }
        }
    }

    public static Room getRoom(Scanner f) {
        if (!f.hasNextInt()) {
            return null;
        }
        Room r = new Room();
        String line;

        // this will read the room number to check for errors
        r.roomNumber = f.nextInt();
        f.nextLine();

        r.roomName = f.nextLine();

        r.description = "";
        while (true) {
            line = f.nextLine();
            if (line.equals("%%")) {
                break;
            }
            r.description += line + "\n";
        }

        int i = 0;
        while (true) {
            line = f.nextLine();
            if (line.equals("%%")) {
                break;
            }
            String[] parts = line.split(":");
            r.exits[i] = parts[0];
            r.destinations[i] = Integer.parseInt(parts[1]);
            i++;
        }
        r.numExits = i;
        return r;
    }
}