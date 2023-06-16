# Pong Game (OOP Finale)
- Febrian Martin Herdito
- 2602200483
- L2BC

# Brief Description
Pong is a classic arcade game where two players control paddles on opposite sides of the screen. The goal is to hit the ball with the paddles, trying to make the ball pass the opponent's paddle. Each time the ball passes a paddle, the opposing player earns a point. The game continues until one player reaches a predetermined score or until the players decide to end the game.

# UML Class Diagram
![WhatsApp Image 2023-06-06 at 10 44 07](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/b64706fd-f47d-478f-9cb4-456e9aed6985)
![WhatsApp Image 2023-06-06 at 10 16 35](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/3640add8-88c1-4bb8-b7f1-077f6b6513f9)
![WhatsApp Image 2023-06-06 at 10 44 03](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/9849a335-33fa-4272-849e-652d8a86bf08)
![WhatsApp Image 2023-06-06 at 10 44 07](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/0fdc6a43-bb71-424b-a8ca-13d21b31e18e)
![WhatsApp Image 2023-06-06 at 10 15 45](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/86640462-2603-4ad3-8321-56a32c12e041)
![WhatsApp Image 2023-06-06 at 10 16 05](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/b151ff10-bdfa-431d-a09a-39b149b57114)
![WhatsApp Image 2023-06-06 at 10 16 20](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/31d99e0e-a14a-4c29-9a01-e98bd4243b3f)
![WhatsApp Image 2023-06-06 at 10 49 59](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/19d16c32-9606-492b-878e-88ea4361ed1f)

# Implementation in the Code
For a short explanation, the code implements a basic version of the Pong game using Java and Swing library. The game follows a basic game loop structure where the game state is updated, collisions are checked, and objects are rendered on the screen. The loop runs at approximately 60 frames per second, ensuring smooth animation. The paddles are controlled by player input through keyboard events, allowing them to move up and down. The ball moves in a random direction initially and bounces off the paddles and the top/bottom edges of the window. The score is incremented when the ball goes past the paddles, and new paddles and ball are created. The score is displayed on the screen, with player 1 on the left and player 2 on the right.

For a more detailed information regarding the codes, 

PongGame class:

This serves as the entry point of the game. It creates an instance of the GameFrame class and sets it as the main frame for the game.
GameFrame class:

Extends the JFrame class to create the main window for the game.
It creates a GamePanel instance and adds it to the frame.
Configures various properties of the frame such as the title, size, background color, close operation, visibility, and position on the screen.
GamePanel class:

Extends the JPanel class and implements the Runnable interface for the game logic and rendering.
Initializes the game objects, including paddles, ball, and score.
Overrides the paint method to draw the game objects on the panel using double buffering.
Implements the game loop in the run method, where it continuously updates the game state, checks for collisions, and repaints the panel.
Handles keyboard input through the AL (Action Listener) class, which listens for key presses and releases and updates the paddle movement accordingly.
GameObject class:

Represents an abstract game object with common properties and behaviors.
Contains position (x, y), width, and height attributes.
Provides abstract methods for moving the object and drawing it on the screen.
Defines the getBounds method to retrieve the bounding rectangle of the object.
Ball class:

Extends the GameObject class and represents the game ball.
Includes attributes for x and y velocity and an initial speed.
Provides methods to set the ball's direction, move it, and check for intersection with paddles.
Overrides the draw method to render the ball as a filled oval.
Paddle class:

Extends the GameObject class and represents a paddle controlled by a player.
Includes an identifier (1 or 2) to distinguish between player 1 and player 2.
Handles key presses and releases to update the paddle's y velocity and stop its movement.
Overrides the draw method to render the paddle as a filled rectangle.
Score class:

Represents the score display on the screen.
Inherits from the Rectangle class to define the position and dimensions of the score display area.
Contains attributes for player 1 and player 2 scores.
Implements the draw method to render the scores using a specific font and color.


# Screenshots of the App
![WhatsApp Image 2023-06-16 at 21 02 49](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/cc6a0600-d37f-4569-9014-85d15c0732f1)
![WhatsApp Image 2023-06-16 at 20 59 04](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/38ff0bff-a115-4ef3-a27e-6e9de510d44e)
![WhatsApp Image 2023-06-16 at 21 03 05](https://github.com/titoditomartin/OOP-Final-Project/assets/114073725/9839bcc3-7283-4948-b849-79d149b2336c)

