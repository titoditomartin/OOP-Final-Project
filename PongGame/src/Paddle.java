import java.awt.*;
import java.awt.event.KeyEvent;

public class Paddle extends GameObject {
    private int id; // Identifier for the paddle (player 1 or player 2)
    private int yVelocity; // Velocity of the paddle in the y-axis direction
    private int speed = 10; // Speed at which the paddle moves

    public Paddle(int x, int y, int width, int height, int id) {
        super(x, y, width, height); // Call the constructor of the GameObject superclass
        this.id = id; // Set the paddle's identifier
    }

    public void keyPressed(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W) {
                    setYDirection(-speed); // Set the y velocity to move the paddle upward
                }
                if (e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(speed); // Set the y velocity to move the paddle downward
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    setYDirection(-speed); // Set the y velocity to move the paddle upward
                }
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(speed); // Set the y velocity to move the paddle downward
                }
                break;
        }
    }

    public void keyReleased(KeyEvent e) {
        switch (id) {
            case 1:
                if (e.getKeyCode() == KeyEvent.VK_W || e.getKeyCode() == KeyEvent.VK_S) {
                    setYDirection(0); // Set the y velocity to 0 to stop the paddle's movement
                }
                break;
            case 2:
                if (e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_DOWN) {
                    setYDirection(0); // Set the y velocity to 0 to stop the paddle's movement
                }
                break;
        }
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection; // Set the y velocity to the given direction
    }

    public void move() {
        y = y + yVelocity; // Move the paddle vertically based on the y velocity
    }

    public void draw(Graphics g) {
        if (id == 1)
            g.setColor(Color.blue); // Set the color of the paddle to blue for player 1
        else
            g.setColor(Color.red); // Set the color of the paddle to red for player 2
        g.fillRect(x, y, width, height); // Draw a filled rectangle representing the paddle
    }
}
