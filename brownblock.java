import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class brownblock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class brownblock extends Floor
{
    /**
     * Act - do whatever the brownblock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    { 
         int direction = 2;
        move(direction);
        if(getX() <1  || getX()>590)
        {
            turn(180);
        }
    }    
}
