
import hhssadventure.Map;
import hhssadventure.GUI;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moore3607
 */
public class Controller {
    private GUI gui;
    private Map map;
    private int row;
    private int col;
    
    public Controller(GUI gui, Map map, int row, int col){
        this.gui = gui;
        this.map = map;
        this.row = row;
        this.col = col;
        
        //make sure the GUI can talk to you
        gui.setControler(this);
        
        // set the starting image
        Screen start = map.getScreen(row, col);
        gui.setImage(start.getImage());
    }
    
    public void goNorth(){
        // get the screen we are on right now
        Screen current = map.getScreen(row, col);
        //ask if we can move north
        if(current.canGoNorth()){
            // move up a row
            row--;
            // get the new screen
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goSouth(){
        // get the screen we are on right now
        Screen current = map.getScreen(row, col);
        //ask if we can move north
        if(current.canGoSouth()){
            // move down a row
            row++;
            // get the new screen
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goEast(){
        // get the screen we are on right now
        Screen current = map.getScreen(row, col);
        //ask if we can move north
        if(current.canGoNorth()){
            // move up a row
            row--;
            // get the new screen
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
    
    public void goWest(){
        // get the screen we are on right now
        Screen current = map.getScreen(row, col);
        //ask if we can move north
        if(current.canGoNorth()){
            // move up a row
            row--;
            // get the new screen
            Screen newScreen = map.getScreen(row, col);
            // set the image
            gui.setImage(newScreen.getImage());
        }
    }
}
