import java.awt.*;

public class Score extends Rectangle{

    // Define static variables to store the game screen dimensions
    static int GAME_WIDTH;
    static int GAME_HEIGHT;

    // Declare instance variables for player scores
    int player1;
    int player2;

    // Constructor for the Score class
    Score(int GAME_WIDTH, int GAME_HEIGHT){
        // Assign the provided game screen dimensions to the static variables
        Score.GAME_WIDTH = GAME_WIDTH;
        Score.GAME_HEIGHT = GAME_HEIGHT;
    }

    // Draws the score on the screen
    public void draw(Graphics g) {
        g.setColor(Color.white);
        g.setFont(new Font("Consolas",Font.PLAIN,60));

        // Draw a vertical line in the middle of the screen
        g.drawLine(GAME_WIDTH/2, 0, GAME_WIDTH/2, GAME_HEIGHT);

        // Draw the player 1 score on the left side of the line
        g.drawString(String.valueOf(player1/10)+String.valueOf(player1%10), (GAME_WIDTH/2)-85, 50);

        // Draw the player 2 score on the right side of the line
        g.drawString(String.valueOf(player2/10)+String.valueOf(player2%10), (GAME_WIDTH/2)+20, 50);
    }
}