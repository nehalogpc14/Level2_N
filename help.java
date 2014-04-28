import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class help here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class help extends Start
{
    /**
     * Act - do whatever the help wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         if(Greenfoot.mouseClicked(this))  
        {   
           Instructions In = new Instructions(); 
           Greenfoot.setWorld(In);
        } 
    }    
}
