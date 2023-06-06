import java.awt.*;

// Abstract class representing a game object
public abstract class GameObject {
    protected int x;         // X-coordinate of the object's position
    protected int y;         // Y-coordinate of the object's position
    protected int width;     // Width of the object
    protected int height;    // Height of the object

    // Constructor for creating a game object with specified position, width, and height
    public GameObject(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Abstract method for moving the game object
    public abstract void move();

    // Abstract method for drawing the game object using Graphics object
    public abstract void draw(Graphics g);

    // Method to retrieve the bounding rectangle of the game object
    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }
}
