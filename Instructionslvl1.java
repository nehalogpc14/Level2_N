import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructionslvl1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructionslvl1 extends World
{

    /**
     * Constructor for objects of class Instructionslvl1.
     * 
     */
    public Instructionslvl1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1);
        Start startButton = new Start();
        addObject (startButton, 400, 480);
    }
}
