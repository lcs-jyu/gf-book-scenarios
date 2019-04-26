import greenfoot.*;

/**
 * Autumn. A world with some leaves.
 * 
 * @author Michael Kölling
 * @version 0.1
 */
public class MyWorld extends World
{
    /**
     * Create the world and objects in it.
     */
    public MyWorld()
    {    
        super(600, 400, 1);
        setUp();
         
        //Create 18 Leaf onjects 
        for(int i = 1; i <= 18; i +=1)
        {
           //Create the object 
           Leaf aLeaf = new Leaf();
           
           //Position
           int x = Greenfoot.getRandomNumber(600);
           int y = Greenfoot.getRandomNumber(400);
           
           //Now actually add the object to the world 
           addObject(aLeaf, x, y);
           
        }
    }
    
    /**
     * Create the initial objects in the world.
     */
    private void setUp()
    {
        addObject(new Block(), 300, 200);
    }
}
