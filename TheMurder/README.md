# Capstone 2 - Java Based Terminal Game

1. There is a file <code>OOP.md</code> in the root level of this repository.  Please answer the questions in that file.

2. Create a terminal based, 2D game.  Written in Java.  Following are the game ideas:
* [Space Invaders](https://www.andoverpatio.co.uk/21/space-invaders/)
* [Asteriods](https://arcade.ly/games/asteroids/)
* [Pac Man](https://pacman.live/play.html)
* [Chess](https://cardgames.io/chess/)
* [Checkers](https://www.247checkers.com/)
* [connect four](https://www.mathsisfun.com/games/connect4.html)
* [Pong](https://playpong.net/)
* [Hungry Snake](https://www.mathsisfun.com/games/snake.html)
* [Asc Dungeon](https://www.youtube.com/watch?v=MSxYgPZyNdM)
* [Hangman](https://hangmanwordgame.com/?fca=1&success=0#/)
* [Sudoko](https://sudoku.game/)
* [Minesweeper](https://cardgames.io/minesweeper/)
* [Connect Four](https://www.mathsisfun.com/games/connect4.html)
* [CRT Racer](https://kronbits.itch.io/crt-racer) 
* [CRT Racer++](https://www.ultimateracing2d.com/) 
* [2048-cli](https://play2048.co/)
* [ascii-jump](https://delightlylinux.wordpress.com/2015/04/06/asciijump-the-ski-jumping-terminal-game/)
* [bombadier](https://www.youtube.com/watch?v=ybTfXN9ywNM)
* [lode runner](http://loderunnerwebgame.com/game/)
* [tank wars](https://playclassic.games/games/strategy-dos-games-online/play-tank-wars-online/play/)
* [Flappy Bird](https://flappybird.io/)
* [Pong](https://pong-2.com/)
* [Tetris ](https://tetris.com/games-content/sanrio01/index-mobile.php)
  
Take a look at the screenshots of these games in the <code>game-ideas</code> folder.  You will notice that there are some sample <code>gui</code> games as well, for those who want to go for the Bonus points.  **What is required though, is to make a purely ascii-based game that can be run in the terminal.**

It is **highly recommended** to choose a game from the above list, but if your heart :yellow_heart: is completely set on something else, you can create a game that is not on the above list.  Realize though, that you may get asked about your decision on why you decided to create a game that wasn't on the above list.

Please check out the sample screenshots of a few game ideas.  The screenshots can be found in the <code>./game-ideas</code> folder in this Github repository.  

This project is designed to showcase your knowledge of object-oriented programming and design.

***************************************************************

As with any project or complicated problem, it's important to step back and think through the process for tackling the project.  We will use Polya's Problem Solving Framework to guide us through that process once again.  Don't forget the famous saying, 

<code><i>"If you fail to plan, you plan to fail."</i></code>

In the root of this repository, you will find a a pdf file outlining a methodology to approaching & solving any problem.  The file is called : <code>"Polya's Problem Solving Framework.pdf"</code>  Feel free to research and learn more about the framework online, or stick to the .pdf file as a primary reference.

Before you dive into the coding, be sure to follow the steps of the Prolem Solving framework.  Please do not underestimate the importance of this step!  Be clear and specific about what the problem is.  It is not sufficient to simply say, 

<i>"The problem is to build a terminal game in java."</i>

That definitely is the core assignment, but it is not specific.  The above statement does not clearly spell out the exact problems that you as the developer are faced with when tackling this project.  The problem needs to cater towards you **specifically**, where you clearly identify what are the issues, blockers, and challenges that lie ahead of you on the path to reach the end goal.  

Clearly defining the problem is often times the most overlooked and vital step to any complicated project.  Get in the habit of contemplating and documenting what the problem is <code><strong>before</strong></code> you start writing code.  

Step 2 of UPER is <strong>Planning</strong>.  After you have brainstormed and thought about the problems facing you as the developer of this java based game, you should clearly map <strong>each</strong> problem to a clear action item.  These action item steps will go in the plan section of the <code>UPER.md</code> document.  

Realize that even Step 2 - Plan, of the Problem Solving framework should also be primarily done <strong>before</strong> you start coding.  

Document all the steps you will be taking for this project in the <code>UPER.md</code> file.  

Also, for step 2 of U<strong>P</strong>ER, you will need to use some OOP design tools to set up your Architecture.  These tools are called <code>Class Diagrams</code>, part of a graphical language known as <code>UML</code>.  You can learn about <code>UML</code> at the following url:

[UML Class Diagram Tutorial](https://www.lucidchart.com/pages/uml-class-diagram#discovery__top)

There are several UML modeling tools you could use to creat your Class Diagrams and/or State Diagrams.  Below are a few options : 

- [GenMyModel](https://app.genmymodel.com/) (highly recommended)
- [Creately](https://creately.com/diagram-type/class-diagram) (great option)
- [Visual Paradigm (VP) Online](https://online.visual-paradigm.com/diagrams/solutions/free-class-diagram-tool/)
- [Lucidchart](https://www.lucidchart.com/)
- MS Visio

To help kickstart your "Understanding the Problem / Planning phases of the project, take a look at the following article:

- [How to create a Text Based Game](https://levelskip.com/classic/Make-a-Text-Based-Game)

Everything specified above should give you enough guidance and direction for how to approach the project.  

A final point to note, as you code the project, you will most likely need to go back to the UPER.md document to add & modify it incrementally.  Such are the ways of the Agile Dev Ninja. 
![Agile Dev Ninja](./assets/ninja%20cat.png)


This will be especially applicable to  Step 4 of UPER - **Reflection / Refactoring**

***************************************************************
<h2>Core Requirements :</h2> 

<h3>Your Java game must:</h3>

- Be functional and playable by a user
- Instructions for how to play the game must be built into the game as well as available as a separate file.  The file name should be called : <code>instructions.md</code>

- Include elements of the game using Java classes that adhere to the four pillars of Object Oriented Programming: 
  
  1.  Encapsulation
  2.  Inheritance
  3.  Abstraction
  4.  Polymorphism 

- Each "game object" or "entity" of your game must be modelled using a Java Class
- Implement at least 1 Interface
- Implement at least 1 Abstract class
- Implement at least 1 lambda expression
- Implement at least 1 stream.
- Have an organized and logical project structure with at least 1 package
- Have some type of error handling for bad user input (incorrect key press, etc.)


****************************************************************
* <h2>Bonus ⭐️ ⭐️ ⭐️ ⭐️ ⭐️</h2>
* Incorporate at least 2 SOLID principles of Object Oriented Design into your project.  

  * Single Responsibility Principle
  * Open Closed Principle
  * Liskov Substitution Principle
  * Interface Segregation Principle
  * Dependency Inversion Principle

* Incorporate at least 2 Object Oriented Design Patterns into your project.  There are many patterns, but here are a few examples:
  
  * Singleton
  * Decorator
  * Facade
  * Observer
  * Chain of Responsibility

For the OOD Principles and OOD Patterns, you should be able to explain them clearly and demonstrate how you used them in your code to earn the full bonus points on these categories.
  
* Implement a 3rd party Java library to aid you in Java Game Development.  A few examples:
  * [Slick2D](http://slick.ninjacave.com/)
  * [LWJGL](https://www.lwjgl.org/)
  * [libGDX](https://libgdx.badlogicgames.com/)
  * [LITIENGINE](https://litiengine.com/)
  * [Java Swing](https://docs.oracle.com/javase/tutorial/uiswing/)

* Create a landing page built in HTML / CSS or in React to showcase the features, functionality, and instructions for how to play your game.  Host the landing page with an online deployment tool, such as : 
  - [netlify](https://www.netlify.com/)
  - [surge.sh](https://surge.sh/)
  - [github pages](https://pages.github.com/)
  - [Vercel (Zeit Now)](https://vercel.com/)
  - [Amazon Web Services S3](https://aws.amazon.com/)
  - [Digital Ocean](https://try.digitalocean.com/developerbrand/?_dkitrig=Cloud)

* Develop a front end UI for the game in React.js.  Wire it up with your Java Model.**
  
* Note may be interesting to see how you can integrate the Java libraries with React.  You may not need to; it could be an either or situation, but look and see if this is possible.  Looking forward to hear about your findings.


## ********************************************************
## Git Instructions

- [ ] Create a template copy of this repository by clicking : "Use this template"
- [ ] Name the repository the same name as the master template repository.  
- [ ] Add your TA as collaborator
- [ ] Clone YOUR repo to your local computer
- [ ] Create a new branch: <code>git checkout -b `<firstName-lastName>`</code>.
- [ ] Implement the project on your newly created `<firstName-lastName>` branch, committing changes regularly.
- [ ] Push all of your commits: <code>git push origin `<firstName-lastName>`</code>.
- [ ] When ready for your TA to review, open a Pull Request (PR) and add your TA as a collaborator.

## ********************************************************
## TEKacademy Submission

<h3>When you're finished completing the App and are done presenting:</h3>

- [ ] Submit the exercise or the presentation feedback sheet provided by your TA in the [TEKacademy portal](https://bit.ly/TEKacademy)
  
- [ ] Download & Complete the [Exercise Evaluation Form](https://bit.ly/TEKacademy)
  
- [ ] Upload the form in [TEKacademy](https://bit.ly/TEKacademy)
  