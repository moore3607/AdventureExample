
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Scanner;
import javax.imageio.ImageIO;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *An object to represent a single screen in a level
 * @author moore3607
 */
public class Screen {
    
    private int row;
    private int col;
    private BufferedImage image;
    private boolean north;
    private boolean south;
    private boolean east;
    private boolean west;
    
    /**
     * Using a scanner to create a new screen 
     * @param input A scanner containing screen info
     */
    public Screen(Scanner input){
        // scan in the image name
        String imageName = input.next();
        //split the string to grab row and col
        String[] split = imageName.split("_");
        // save the row, gets rid of R, convert to int
        row = Integer.parseInt(split[1].substring(1));
        // save the column, gets rid of C, convert to int
        col = Integer.parseInt(split[2].substring(1));
        
        // load the image file
        try{
            image = ImageIO.read(new File("zelda/" + imageName + ".gif"));
        }catch(Exception e){
            e.printStackTrace();
        }
        
        // get the possible directions
        north = input.nextBoolean();
        south = input.nextBoolean();
        east = input.nextBoolean();
        west = input.nextBoolean();
        
        // move to next line
        input.nextLine();
    }
    
    /**
     * gets the row of the screen
     * @return the row of the screen
     */
    public int getRow(){
        return row;
    }
    
    /**
     * gets the column of the screen
     * @return the column of the screen
     */
    public int getCol(){
        return col;
    }
    
    public boolean canGoNorth(){
        return north;
    }
    
    public boolean canGoSouth(){
        return south;
    }
    
    public boolean canGoEast(){
        return east;
    }
    
    public boolean canGoWest(){
        return west;
    }
    
    public BufferedImage getImage(){
        return image;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Screen s = new Screen(in);
        
        System.out.println(s.getRow());
        System.out.println(s.getCol());
        System.out.println(s.canGoEast());
        System.out.println(s.getImage());
    }
}
