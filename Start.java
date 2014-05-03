import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Start extends Actor
{
    /**
     * Act - do whatever the Start wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))  
        {   
           background bg = new background(); 
           Greenfoot.setWorld(bg);
        }
        
        if(Greenfoot.isKeyDown("shift") && Greenfoot.isKeyDown("F9"))
        {
            Greenfoot.setWorld(new Lvl2BkgDesert());
        }
    }    
}
