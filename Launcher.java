 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Mover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Launcher extends Mover
{
    int shootdelay = 0;
    int mindelay = 10;
    int AvailDarts = 100;
    public Launcher(int numDarts)
    {
        AvailDarts = numDarts;
    }
    public void act() 
    {
        // Sets the Heart as a smaller image
        GreenfootImage img = getImage();
        setImage(img);
        
        Lvl2BkgDesert myd = (Lvl2BkgDesert) getWorld();
        if (myd.GetAvailDarts() <= 0)
        {
                boolean GameOver;
               getWorld().addObject(new DemonExplosion(), getWorld().getWidth()/2, getWorld().getHeight()/2);
               GameOver = true;
               getWorld().removeObject(this);
        }
        
        shootdelay++;
        
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-1);
        }
        
        if(Greenfoot.isKeyDown("right"))
        {
            turn(1);
        }
        if(Greenfoot.isKeyDown("space"))
        {  
            shoot();
        }
    }
    //Shoots the Dart
    public void shoot()
    {
        if(shootdelay >= mindelay)
        {
            int rot = getRotation()-90;
            int xOffset = (int)(40 *Math.cos(Math.toRadians(rot)));
            int yOffset = (int)(40 *Math.sin(Math.toRadians(rot)));
            Darts d = new Darts(getRotation());

            getWorld().addObject(d, getX()+xOffset, getY()+yOffset);
            shootdelay = 0;
            Lvl2BkgDesert lvl2 = (Lvl2BkgDesert) getWorld(); 
            lvl2.DecrememntDarts(1); 
        }
    }
}
