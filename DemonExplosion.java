 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class DemonExplosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DemonExplosion extends BlueDemon
{
    /**
     * Act - do whatever the DemonExplosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        GreenfootImage image = getImage(); 
        image.scale(400,400);
        setImage(image);
         if(Greenfoot.mouseClicked(this))  
        {  
            Greenfoot.stop();
            Startroom sr = new Startroom(); 
            Greenfoot.setWorld(sr);
        }
        //if (GameOver = true)
        //{
         //   Greenfoot.stop();
       // }
       
    }    
}
