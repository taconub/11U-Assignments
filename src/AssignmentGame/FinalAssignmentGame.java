 /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

/**
 *
 * @author nagra2700
 */
public class FinalAssignmentGame extends JComponent {

    // Height and Width of our game
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    //Title of the window
    String title = "Leapy Frog";
    // sets the framerate and delay for our game
    // you just need to select an approproate framerate
    long desiredFPS = 60;
    long desiredTime = (1000) / desiredFPS;
    // YOUR GAME VARIABLES WOULD GO HERE
    //setting the coordinates for a box that will be used to move by the user
    Rectangle player = new Rectangle(50, 400, 20, 50);
    //creating an integer for an objects horizantal direction
    int playerDX = 0;
    //creating an integer for an objects vertical direction
    int playerDY = 0;
    //creating an integer for gravity that way an object can jump and fall back to the ground
    int gravity = 1;
    //creating a boolean for when the object is jumnping
    boolean jump = false;
    //creating a boolean for when the object is on the ground
    boolean onGround = true;
    //creating a boolean that is true when the object is moving left
    boolean left = false;
    //creating a boolean that is true when the object is moving right
    boolean right = false;
    //creating an array that will consist of rectangles
    Rectangle[] blocks = new Rectangle[21];
    //creating different sized fonts
    Font smallFont = new Font("Arial", Font.BOLD, 12);
    Font bigFont = new Font("Arial", Font.BOLD, 22);
    Font biggerFont = new Font("Arial", Font.BOLD, 70);
    int score = 0;
    //setting the rectangle speed for the rectangles in the "blocks" array
    int block1speed = 2;
    int block2speed = 4;
    int block3speed = 1;
    int block4speed = 5;
    int block5speed = 3;
    int block6speed = 2;
    int block7speed = 5;
    int block8speed = 3;
    int block10speed = 5;
    int block11speed = 4;
    int block12speed = 2;
    int block13speed = 5;
    int block14speed = 4;
    int block15speed = 2;
    int block16speed = 6;
    int block17speed = 2;
    //creating an integer for the "blocks" horizantal direction
    int blockxdir = 1;
    //creating coordinates for rectangles that will act as buttons 
    Rectangle button = new Rectangle(10, 200, 100, 50);
    Rectangle button1 = new Rectangle(WIDTH - 110, 200, 100, 50);
    //creating integers for the mouse's horizantal and vertical location
    int mouseX, mouseY;
    //creating a boolean for when a button has a mouse inside of it's coordinates
    boolean covered = false;
    // GAME VARIABLES END HERE   

    // Constructor to create the Frame and place the panel in
    // You will learn more about this in Grade 12 :)
    public FinalAssignmentGame() {
        // creates a windows to show my game
        JFrame frame = new JFrame(title);

        // sets the size of my game
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        // adds the game to the window
        frame.add(this);

        // sets some options and size of the window automatically
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        // shows the window to the user
        frame.setVisible(true);

        // add listeners for keyboard and mouse
        frame.addKeyListener(new Keyboard());
        Mouse m = new Mouse();

        this.addMouseMotionListener(m);
        this.addMouseWheelListener(m);
        this.addMouseListener(m);
    }

    // drawing of the game happens in here
    // we use the Graphics object, g, to perform the drawing
    // NOTE: This is already double bufferd!(helps with framerate/speed)
    @Override
    public void paintComponent(Graphics g) {
        // always clear the screen first!
        g.clearRect(0, 0, WIDTH, HEIGHT);
        // GAME DRAWING GOES HERE
        //setting the color to blue
        g.setColor(Color.blue);
        //creating a blue rectangle that will act as a background for the game
        g.fillRect(0, 0, WIDTH, HEIGHT);
        //setting the color to green
        g.setColor(Color.GREEN);
        //creating a rectangle to act as a box for the user to move and control using the coordinates from the rectangle "player" 
        g.fillRect(player.x, player.y, player.width, player.height);
        //setting the color to black
        g.setColor(Color.BLACK);
        //creating a for statement for the purpose of making the rectangles in the "blocks" array
        for (int i = 0; i < blocks.length; i++) {
            //setting the coordinates for the rectangles that will be in the "blocks" array
            g.fillRect(blocks[i].x, blocks[i].y, blocks[i].width, blocks[i].height);
            //setting the color to magenta
            g.setColor(Color.MAGENTA);
            //setting the font to "bigfont"
            g.setFont(bigFont);
            //drawing a string to shouw the users score
            g.drawString("" + score, WIDTH - 100, 50);
            //setting the color to orange
            g.setColor(Color.ORANGE);
            //setting the font to "biggerfont"
            g.setFont(biggerFont);
            //if the players x is lower than 0, or the player hits the left side of the screen
            if (player.x < 0) {
                //drawing a string for when the game is over
                g.drawString("GAME OVER", 10, 100);
            }
            //if the players x is greater than 0, or the player is to the right of the left side of the screen
            if (player.x > 0) {
                //drawing a string to put the title of the game on the screen
                g.drawString("LEAPY FROG", 10, 100);
            }
            //setting the color to red
            g.setColor(Color.red);
            //setting the font to "big font"
            g.setFont(smallFont);
            //output the messages in the if statement only if the player hasn't hit the left side of the screen
            if (player.x > 0) {
                //messages explaining what each button those
                g.drawString("COVER THE BLOCK FOR HARD MODE", 10, 190);
                g.drawString("COVER THE BLOCK FOR EASY MODE", 590, 190);
            }
            //setting the color to dark gray
            g.setColor(Color.darkGray);
            //setting the font to "big font"
            g.setFont(bigFont);
            //if the score is between those numbers and the player is hasn't hit the left wall output a message
            if (score > 2000 && score < 2100 && player.x > 0) {
                //outputting a messge telling the user the block speed has increased
                g.drawString("The block speed has increased", 10, 150);
            }
            //if the score is between those numbers and the player is hasn't hit the left wall output a message
            if (score > 4000 && score < 4100 && player.x > 0) {
                //outputting a messge telling the user the block speed has increased
                g.drawString("The block speed has increased for the last time", 10, 150);
            }
            //setting the color to black
            g.setColor(Color.black);
            //if the hard mode button has the mouse inside of it
            if (button.contains(mouseX, mouseY)) {
                blocks[9] = new Rectangle(WIDTH - 400, 275, 15, HEIGHT);
                //creating a box to obstruct the users visions
                blocks[19] = new Rectangle(WIDTH - 500, 275, WIDTH, 300);
                //creating a roof next to the box
                blocks[20] = new Rectangle(0, 275, WIDTH - 500, 15);
            } else {
                //reverting the blocks that had their coordinates changed prior in this loop back int their original coordinates
                blocks[19] = new Rectangle(0, 0, 0, 0);
                blocks[20] = new Rectangle(0, 0, 0, 0);
                blocks[9] = new Rectangle(WIDTH - 600, 275, 15, HEIGHT);
            }
            //setting the color to red
            g.setColor(Color.red);
            //if the player has not hit the left wall of the screen
            if (player.x > 0) {
                //creating blocks to act as buttons using pre setup coordinates
                g.fillRect(button.x, button.y, button.width, button.height);
                g.fillRect(button1.x, button1.y, button1.width, button1.height);
            }
            //setting the color to black
            g.setColor(Color.BLACK);
        }
        //save for hard mode
        //g.fillRect(WIDTH / 2 - 3, 0, WIDTH / 4 + 3, HEIGHT);
        // GAME DRAWING ENDS HERE
    }

    // This method is used to do any pre-setup you might need to do
    // This is run before the game loop begins!
    public void preSetup() {
        // Any of your pre setup before the loop starts should go here
        //creating blocks to either act as projectiles or barriers for the player
        blocks[0] = new Rectangle(0, 475, WIDTH, HEIGHT);
        blocks[1] = new Rectangle(750, 400, 50, 10);
        blocks[2] = new Rectangle(750, 425, 50, 10);
        blocks[3] = new Rectangle(750, 380, 50, 10);
        blocks[4] = new Rectangle(900, 350, 50, 10);
        blocks[5] = new Rectangle(850, 450, 50, 10);
        blocks[6] = new Rectangle(1000, 425, 50, 10);
        blocks[7] = new Rectangle(775, 385, 50, 10);
        blocks[8] = new Rectangle(1100, 350, 50, 10);
        blocks[9] = new Rectangle(WIDTH - 600, 275, 15, HEIGHT);
        blocks[10] = new Rectangle(0, 475, WIDTH, HEIGHT);
        blocks[11] = new Rectangle(850, 450, 50, 10);
        blocks[12] = new Rectangle(1200, 425, 50, 10);
        blocks[13] = new Rectangle(1500, 385, 50, 10);
        blocks[14] = new Rectangle(1700, 350, 50, 10);
        blocks[15] = new Rectangle(1500, 450, 50, 10);
        blocks[16] = new Rectangle(1500, 400, 50, 10);
        blocks[17] = new Rectangle(850, 385, 50, 10);
        blocks[18] = new Rectangle(0, 275, 200, 10);
        blocks[19] = new Rectangle(0, 0, 0, 0);
        blocks[20] = new Rectangle(0, 0, 0, 0);
    }

    // The main game loop
    // In here is where all the logic for my game will go
    public void run() {
        // Used to keep track of time used to draw and update the game
        // This is used to limit the framerate later on
        long startTime;
        long deltaTime;

        preSetup();

        // the main game loop section
        // game will end if you set done = false;
        boolean done = false;
        while (!done) {
            // determines when we started so we can keep a framerate
            startTime = System.currentTimeMillis();

            // all your game rules and move is done in here
            // GAME LOGIC STARTS HERE 
            //if the help button contains the mouse
            if (button1.contains(mouseX, mouseY)) {
                //pausing the blocks movement
                blocks[1].x = blocks[1].x;
                blocks[2].x = blocks[2].x;
                blocks[3].x = blocks[3].x;
                blocks[4].x = blocks[4].x;
                blocks[5].x = blocks[5].x;
                blocks[6].x = blocks[6].x;
                blocks[7].x = blocks[7].x;
                blocks[8].x = blocks[8].x;
                blocks[10].x = blocks[10].x;
                blocks[11].x = blocks[11].x;
                blocks[12].x = blocks[12].x;
                blocks[13].x = blocks[13].x;
                blocks[14].x = blocks[14].x;
                blocks[15].x = blocks[15].x;
                blocks[16].x = blocks[16].x;
                blocks[17].x = blocks[17].x;
                //pausing the score
                score = score - 1;
            } else {
                //reverting the blocks movement back to it's orginal state
                blocks[1].x = blocks[1].x + blockxdir * block1speed * -1;
                blocks[2].x = blocks[2].x + blockxdir * block2speed * -1;
                blocks[3].x = blocks[3].x + blockxdir * block3speed * -1;
                blocks[4].x = blocks[4].x + blockxdir * block4speed * -1;
                blocks[5].x = blocks[5].x + blockxdir * block5speed * -1;
                blocks[6].x = blocks[6].x + blockxdir * block6speed * -1;
                blocks[7].x = blocks[7].x + blockxdir * block7speed * -1;
                blocks[8].x = blocks[8].x + blockxdir * block8speed * -1;
                blocks[10].x = blocks[10].x + blockxdir * block10speed * -1;
                blocks[11].x = blocks[11].x + blockxdir * block11speed * -1;
                blocks[12].x = blocks[12].x + blockxdir * block12speed * -1;
                blocks[13].x = blocks[13].x + blockxdir * block13speed * -1;
                blocks[14].x = blocks[14].x + blockxdir * block14speed * -1;
                blocks[15].x = blocks[15].x + blockxdir * block15speed * -1;
                blocks[16].x = blocks[16].x + blockxdir * block16speed * -1;
                blocks[17].x = blocks[17].x + blockxdir * block17speed * -1;
            }
            //if the score is between certain numbers
            if (score > 2000 && score < 3999) {
                //increasing the block speed
                block1speed = 6;
                block2speed = 4;
                block3speed = 4;
                block4speed = 5;
                block5speed = 3;
                block6speed = 4;
                block7speed = 5;
                block8speed = 2;
                block10speed = 3;
                block11speed = 4;
                block12speed = 5;
                block13speed = 3;
                block14speed = 5;
                block15speed = 3;
                block16speed = 4;
                block17speed = 5;
            }
            //if the score is greater than a certain number
            if (score > 4000) {
                //increasing the block speed
                block1speed = 7;
                block2speed = 6;
                block3speed = 7;
                block4speed = 8;
                block5speed = 7;
                block6speed = 6;
                block7speed = 9;
                block8speed = 5;
                block10speed = 10;
                block11speed = 5;
                block12speed = 6;
                block13speed = 3;
                block14speed = 6;
                block15speed = 7;
                block16speed = 8;
                block17speed = 7;
            }
            //if the block has made it past the left side of the screen
            if (blocks[1].x < -200) {
                //returning the block back to the right side of the screen
                blocks[1].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[2].x < -200) {
                //returning the block back to the right side of the screen
                blocks[2].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[3].x < -200) {
                //returning the block back to the right side of the screen
                blocks[3].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[4].x < -200) {
                //returning the block back to the right side of the screen
                blocks[4].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[5].x < -200) {
                //returning the block back to the right side of the screen
                blocks[5].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[6].x < -200) {
                //returning the block back to the right side of the screen
                blocks[6].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[7].x < -200) {
                //returning the block back to the right side of the screen
                blocks[7].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[8].x < -200) {
                //returning the block back to the right side of the screen
                blocks[8].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[10].x < -200) {
                //returning the block back to the right side of the screen
                blocks[10].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[11].x < -200) {
                //returning the block back to the right side of the screen
                blocks[11].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[12].x < -200) {
                //returning the block back to the right side of the screen
                blocks[12].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[13].x < -200) {
                blocks[13].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[14].x < -200) {
                //returning the block back to the right side of the screen
                blocks[14].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[15].x < -200) {
                //returning the block back to the right side of the screen
                blocks[15].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[16].x < -200) {
                //returning the block back to the right side of the screen
                blocks[16].x = WIDTH;
            }
            //if the block has made it past the left side of the screen
            if (blocks[17].x < -200) {
                //returning the block back to the right side of the screen
                blocks[17].x = WIDTH;
            }
            //as long as none of the buttons are being pressed
            if (covered = true) {
                //if the key to move right has been pressed
                if (right) {
                    //the players "x direction" will increase
                    playerDX = 4;
                    //the score will be increased
                    score = score + 1;
                //if the key to move left has been pressed
                } else if (left) {
                    //the players "x direction" will decrease
                    playerDX = - 4;
                    //the score will be increased
                    score = score + 1;
                } else {
                    //the player will stop moving 
                    playerDX = 0;
                    //the score will be increased
                    score = score + 1;
                }
                //if the player is on the ground and the jump key has been pressed
                if (onGround && jump) {
                    //the players "y direction" will decrease
                    playerDY = -15;
                    //the "on groud" boolean will be false as a result of the player jumping
                    onGround = false;
                }
            }
            //if the player hit the left wall
            if(player.x < 0){
                //end the game
                break;
            }
            //increasing the players y by adding the gravitational affect to it
            playerDY = playerDY + gravity;
            //changing the players x by adding the directional x
            player.x = player.x + playerDX;
            //changing the players  by adding the directional y
            player.y = player.y + playerDY;
            //changing the "onground" boolean to false
            onGround = false;
            //a loop for seeing if the player and the blocks collided
            for (int i = 0; i < blocks.length; i++) {
                //checking to see if the player intersected with the blocks
                if (player.intersects(blocks[i])) {
                    int cHeight = Math.min(blocks[i].y + blocks[i].height, player.y + player.height) - Math.max(blocks[i].y, player.y);
                    int cWidth = Math.min(blocks[i].x + blocks[i].width, player.x + player.width) - Math.max(blocks[i].x, player.x);
                    //determining the smaller dimension to make fixing the collision easier
                    if (cHeight > cWidth) {
                        //fixing the width by moving the player out of the block
                        if (player.x < blocks[i].x) {
                            player.x = player.x - cWidth;
                        } else {
                            player.x = player.x + cWidth;
                        }
                        //stopping the players x directional movements
                        playerDX = 0;
                    } else {
                        //fixing the height by moving the player out of the block
                        if (player.y < blocks[i].y) {
                            player.y = player.y - cHeight;
                            //if the player is moving in the y direction than stop the y directional movement
                            if (playerDY >= 0) {
                                playerDY = 0;
                                //changing the "onground" boolean to true
                                onGround = true;
                            }
                        } else {
                            player.y = player.y + cHeight;
                        }
                    }
                }
            }
            // GAME LOGIC ENDS HERE 
            // update the drawing (calls paintComponent)
            repaint();

            // SLOWS DOWN THE GAME BASED ON THE FRAMERATE ABOVE
            // USING SOME SIMPLE MATH
            deltaTime = System.currentTimeMillis() - startTime;
            try {
                if (deltaTime > desiredTime) {
                    //took too much time, don't wait
                    Thread.sleep(1);
                } else {
                    // sleep to make up the extra time
                    Thread.sleep(desiredTime - deltaTime);
                }
            } catch (Exception e) {
            };
        }
    }

    // Used to implement any of the Mouse Actions
    private class Mouse extends MouseAdapter {
        // if a mouse button has been pressed down

        @Override
        public void mousePressed(MouseEvent e) {
        }

        // if a mouse button has been released
        @Override
        public void mouseReleased(MouseEvent e) {
        }

        // if the scroll wheel has been moved
        @Override
        public void mouseWheelMoved(MouseWheelEvent e) {
        }

        // if the mouse has moved positions
        @Override
        public void mouseMoved(MouseEvent e) {
            //getting the x and y positions of the mouse to allow it to affect the buttons
            mouseX = e.getX();
            mouseY = e.getY();
        }
    }

    // Used to implements any of the Keyboard Actions
    private class Keyboard extends KeyAdapter {
        // if a key has been pressed down

        @Override
        public void keyPressed(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            //if the right arrow key has been pressed
            if (key == KeyEvent.VK_RIGHT) {
                //than the right boolean is true
                right = true;
            //if the left arrow key has been pressed
            } else if (key == KeyEvent.VK_LEFT) {
                //than the left boolean is true
                left = true;
            //if the space key has been pressed
            } else if (key == KeyEvent.VK_SPACE) {
                //than the jump boolean is true
                jump = true;
            }
        }

        // if a key has been released
        @Override
        public void keyReleased(KeyEvent e) {
            // store the key being pressed
            int key = e.getKeyCode();
            //if the right arrow key has been released
            if (key == KeyEvent.VK_RIGHT) {
                //than the right boolean is false
                right = false;
            //if the left arrow key has been released
            } else if (key == KeyEvent.VK_LEFT) {
                left = false;
            //if the space key has been released
            } else if (key == KeyEvent.VK_SPACE) {
                //than the jump boolean is false
                jump = false;
            }

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creates an instance of my game
        FinalAssignmentGame game = new FinalAssignmentGame();

        // starts the game loop
        game.run();
    }
}
