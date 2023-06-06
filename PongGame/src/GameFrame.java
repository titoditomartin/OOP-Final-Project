import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {
    GamePanel panel; // The game panel that will be added to the frame

    GameFrame() {
        panel = new GamePanel(); // Create a new instance of the game panel
        this.add(panel); // Add the game panel to the frame

        this.setTitle("Pong Game"); // Set the title of the frame
        this.setResizable(false); // Set the frame to be non-resizable
        this.setBackground(Color.black); // Set the background color of the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set the close operation when the frame is closed
        this.pack(); // Pack the frame to fit the preferred size of its components
        this.setVisible(true); // Set the frame to be visible
        this.setLocationRelativeTo(null); // Center the frame on the screen
    }
}
