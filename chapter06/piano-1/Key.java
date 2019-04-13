import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables
     * These can used anywhere in the class below.
     */
    //Will keep track of whether a key was just pressed
    private boolean isDown;
    
    
    /**
     * Create a new key. 
     * Constructor- it runs ince when a Key object is created.
    public Key()
    {
      
     // No key has been pressed 
     keyAlreadtDown = false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //Animate the piano key being pressed
        //Condition 1 - is the "g" key being pressed 
        //Condition 2 - was the "g: key alreadt down
        if ( Greenfoot.isKeyDown("g") && isDown == false )
        {
            //Key is down
            setImage("white-key-down.png");
            play();
            keyAlreadtDown= true;
        }
        
        //Stop showing the key being pressed
        //Condition 1 - The key was down the last time act() fired
        //Cpndition 2 - The "g" has been released )no longer being pressed
        
        if ( Greenfoot.isKeyDown("g")&& !KeyAlreadyDown )
        {
            //Key is up
            setImage("white-key.png");
            isDown = false;
        }
    }

    /**
     * play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound("3a.wav");
    }

}


