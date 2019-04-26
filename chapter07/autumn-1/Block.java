import greenfoot.*;

/**
 * A block that bounces back and forth across the screen.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class Block extends Actor
{
    private int delta = 2;
    
    /**
     * Move across the screen, bounce off edges. Turn leaves, if we touch any.
     */
    public void act() 
    {
        move();
        checkEdge();
        checkMouseClick();
        checkFrLeafCollision();
        
    }
    
    /**
     * Remove a Leaf object if we are intersecting with it.
     */
    private void checkFrLeafCollision()
    {
        //Get an object reference to a single Leaf from any Leaf objects we are currently 
        //interesting 
        // NOTE: By placing a type in brackets before the call to getOneIntersectingObject
        //      we ***cast*** (or force) the type to change from Actor to Leaf 
        // NOTE 2: We can do this because Leaf is a subclass of Actor.
        Leaf someLeaf = (Leaf) getOneIntersectingObject(Leaf.class);
        
        // Check that the someLeaf object actually has a reference to an object 
        // If it is null, that means there was no Leaf intersecting the Block this time around 
        if (someLeaf != null)
        {
            // someLeaf is NOT null... so now we can remove it
             World myWorld = getWorld();
             myWorld.removeObject(someLeaf);
            
        }
    }
    
    /**
     * Move sideways, either left or right.
     */
    private void move()
    {
        setLocation(getX()+delta, getY());
    }
    
    /**
     * Check whether we are at the edge of the screen. If we are, turn around.
     */
    private void checkEdge()
    {
        if (isAtEdge()) 
        {
            delta = -delta;  // reverse direction
            
            //Add a new Leaf object to the world
            // 1. Add a reference to the world
            World myWorld = getWorld();
            // 2. Use the object reference to call, or use, a method on the World object
            myWorld.addObject(new Leaf(), getX(), getY());
        }
    }
    
    /**
     * Check whether the mouse button was clicked. If it was, change all leaves.
     */
    private void checkMouseClick()
    {
        if (Greenfoot.mouseClicked(null)) 
        {
            // do this when the mouse is clicked. currently: nothing.
        }
    }
    
}
