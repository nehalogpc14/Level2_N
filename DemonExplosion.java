 

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
//         Greenfoot.delay(3);
//         image.scale(400,400);
//         setImage(image);
//         Greenfoot.delay(3);
//         image.scale(500,500);
//         setImage(image);
//         image.scale(600,600);
//         setImage(image);
//         image.scale(700,700);
//        // setImage(image);
        
        if (GameOver = true)
        {
            Greenfoot.stop();
        }
       
    }    
}
