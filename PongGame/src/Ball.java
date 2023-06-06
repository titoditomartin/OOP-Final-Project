import java.awt.*;

public class Ball extends GameObject {
    protected int xVelocity; // Velocity in the x-axis direction
    protected int yVelocity; // Velocity in the y-axis direction
    private int initialSpeed = 2; // Initial speed of the ball

    public Ball(int x, int y, int width, int height) {
        super(x, y, width, height); // Call the constructor of the GameObject superclass
        setRandomDirection(); // Set a random direction for the ball
    }

    private void setRandomDirection() {
        // Generate random directions for x and y velocities
        xVelocity = (Math.random() < 0.5) ? -initialSpeed : initialSpeed;
        yVelocity = (Math.random() < 0.5) ? -initialSpeed : initialSpeed;
    }

    public void setXDirection(int xDirection) {
        xVelocity = xDirection; // Set the x velocity to the given direction
    }

    public void setYDirection(int yDirection) {
        yVelocity = yDirection; // Set the y velocity to the given direction
    }

    public void move() {
        x += xVelocity; // Move the ball horizontally based on the x velocity
        y += yVelocity; // Move the ball vertically based on the y velocity
    }

    public void draw(Graphics g) {
        g.setColor(Color.white); // Set the color of the ball to white
        g.fillOval(x, y, width, height); // Draw a filled oval representing the ball
    }

    public boolean intersects(Paddle paddle) {
        return getBounds().intersects(paddle.getBounds()); // Check if the ball intersects with the paddle
    }
}
