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

    // Create the array (list of names)
    String[] peopleInClass = {"Julio","Liam", "Dima", "Osman","Nick","Simon","Eric","Phillp","Joven","Joe","Gordon","Jieun","Selena","Jason","Sam","Jeff"};
    
    //Create two arrays
    //First array tracks the keyboard keys that we will use for white piano keys
    String[] whiteKeys = {"a","s","d","f","g","h","j","k","l",";","'","\\"};
    //Second array tracks the sounds files for each note
    String[] whiteNotes = {"3c","3d","3e","3f","3g","3a","3b","4c","4d","4e","4f","4g"};
    //First array trackes the keyboard keys that we wil use for blakck keys
    String[] blackKeys ={"w","e","", };
    String[] whiteNotes = { }
    /**
     * Make the piano.
     */
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
        //This block of code runs once per second until the end of the 
        //array
        int position =frames / 60;
        //    every FULL SECOND when the position is less than count of items in the array
        if ( (frames % 60 == 0) && (position < whiteKeys.length) )
        {
            //Only show a message when we are in the boungs of the array
            showText("Array index is:" + frames / 60,400,250);
            
            
            
            //Create an object to dd to the world
            Key aKey = new Key(whiteKeys[position], whiteNotes[position]);
            //Not actually add the object to the world
            //        OBJECT TO ADD     HORIZONTAL POSITION    VERTICAL POSITION
           
            addObject(aKey,54 + position * 63, 140);

            //Only say hello when we are in the bounds of the array
            //Say hello to everyone in the class!
            //showText("Hello" + peopleInClass[frames / 60],400,170);

        }
        //Track frames
        frames += 1;

        //show the frames 
        //showText(""+ frames, 100,100);
    }

}