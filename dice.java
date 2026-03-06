import java.util.Scanner;
/**
 * Write a description of class dice here.
 *
 * @author olivia
 * @version 3/3/26
 */
public class dice
{
    private final int MAX = 6; //number of sides of dice
    public int roll; 
    
    
    // this is what runs the constructor
    public dice(){
        this.roll();
    }
    
    //this is where it rolls
    public void roll() {
        roll = (int)(Math.random() * MAX + 1);
        // the +1 means that it cant roll a zero
    }
    
    // this returns the number
    
    public int getRoll(){
        return this.roll;
    }
}
