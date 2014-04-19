 

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lvl2BkgDesert here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lvl2BkgDesert extends World
{
    public int AvailDarts = 100;

    /**
     * Constructor for objects of class Lvl2BkgDesert.
     * 
     */
    public Lvl2BkgDesert()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Greenfoot.playSound("Lvl2Music.mp3");
         //Create the demon object
        BlueDemon bluedemon = new BlueDemon();
        
        // Put Blue Demon in our world
        addObject(bluedemon,50+Greenfoot.getRandomNumber(700), 30+getHeight()/4);
        
        //adds Launcher into World
        Launcher myLauncher = new Launcher(AvailDarts);
        addObject(myLauncher,getWidth()/2,getHeight()+5);
        Rocks myRocks = new Rocks(1, 100 + Greenfoot.getRandomNumber(75));
        addObject(myRocks, 50 + Greenfoot.getRandomNumber(300), 200 + Greenfoot.getRandomNumber(200));
        //addObject(myRocks, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);       
        Rocks myRocks2 = new Rocks(3, 100 + Greenfoot.getRandomNumber(75));
        addObject(myRocks2, 50 + Greenfoot.getRandomNumber(300), 200 + Greenfoot.getRandomNumber(200));
         //addObject(myRocks2, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);         
        Rocks myRocks3 = new Rocks(4, 100 + Greenfoot.getRandomNumber(75));
        addObject(myRocks3, 450 + Greenfoot.getRandomNumber(300), 300 + Greenfoot.getRandomNumber(200));
         //addObject(myRocks3, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
        Rocks myRocks4 = new Rocks(5, 100 + Greenfoot.getRandomNumber(75));
        addObject(myRocks4, 450 + Greenfoot.getRandomNumber(300), 300 + Greenfoot.getRandomNumber(200));
        //addObject(myRocks4, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
        DemonExplosion demonexplosion = new DemonExplosion();
        
        AvailableDarts myAD = new AvailableDarts();
        addObject(myAD, 700, 30);
    }
    public void IncrementDarts(int num)
    {
       AvailDarts = AvailDarts + num; 
    }
    public void DecrememntDarts(int num)
    {
       AvailDarts = AvailDarts - num;
       
    }
    public int GetAvailDarts()
    {
        return AvailDarts;
    }
}
