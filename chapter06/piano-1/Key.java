import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    /**
     * Instance variables
     * These can used anywhere in the class below.
     */
    //Will keep track of whether a key was just pressed
    private boolean keyAlreadyDown;
    //Will contain thekey and sound file that this instance of the class will play
    private String key;
    private String sound;
    
    
    /**
     * Create a new key. 
     * Constructor- it runs ince when a Key object is created.
     */
    public Key(String keyName, String soundFile)
    {
     // No key has been pressed 
     keyAlreadyDown = false;
     
     //set the instance variables using the prameters
     key = keyName;
     sound= soundFile;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {
        //Animate the piano key being pressed
        //Condition 1 - is the "g" key being pressed 
        //Condition 2 - was the "g: key alreadt down
        if ( Greenfoot.isKeyDown(key)&& !keyAlreadyDown )
        {
            //Key is down
            setImage("white-key-down.png");
            play();
            keyAlreadyDown = true;
        }
        
        //Stop showing the key being pressed
        //Condition 1 - The key was down the last time act() fired
        //Condition 2 - The "g" has been released (no longer being pressed)
        if  ( keyAlreadyDown == true && !Greenfoot.isKeyDown(key))
        {
            //Key is up
            setImage("white-key.png");
            keyAlreadyDown = false;
        }
    }

    /**
     * play the note of this key.
     */
    public void play()
    {
        Greenfoot.playSound(sound + ".wav");
    }

}


