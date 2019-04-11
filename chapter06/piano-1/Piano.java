import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kölling
 * @version: 0.1
 */
public class Piano extends World
{
    /**
     * Instance variable
     * (we can use these variables anywhere in the classO
     */
    int frames;
    public Piano() 
    {
        super(800, 340, 1);
        
        //Initialize instance variables
        frames = 0;
    }
    
    /**
     * act
     * (get called repeatedly to create animation)
     */
    public void act()
    {
        //Track frames
        frames += 1;
        
        //show the frames 
        showText(""+ frames, 100,100);
    }
  
}