 

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
    private GreenfootSound music = new GreenfootSound("Lvl2Music.mp3");      
    /**
     * Constructor for objects of class Lvl2BkgDesert.
     * 
     */
    public Lvl2BkgDesert(int L1counter)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        Greenfoot.playSound("Lvl2Music.mp3");
         //Create the demon object
        BlueDemon bluedemon = new BlueDemon();
        
        AvailDarts = L1counter;
        if (AvailDarts < 0)
        {
            AvailDarts = 0;
        }
        
        // Put Blue Demon in our world
        addObject(bluedemon,50+Greenfoot.getRandomNumber(700), 30+getHeight()/4);
        
        //adds Launcher into World
        Launcher myLauncher = new Launcher(AvailDarts);
        addObject(myLauncher,getWidth()/2,getHeight()+5);
        
        
        Rocks myRocks = new Rocks(1, 100 + Greenfoot.getRandomNumber(50));
        addObject(myRocks, 50 + Greenfoot.getRandomNumber(200), 175 + Greenfoot.getRandomNumber(100));
        //addObject(myRocks, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);       
        Rocks myRocks2 = new Rocks(3, 100 + Greenfoot.getRandomNumber(50));
        addObject(myRocks2, 50 + Greenfoot.getRandomNumber(200), 325 + Greenfoot.getRandomNumber(100));
         //addObject(myRocks2, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);         
        Rocks myRocks3 = new Rocks(4, 100 + Greenfoot.getRandomNumber(50));
        addObject(myRocks3, 300 + Greenfoot.getRandomNumber(200), 175 + Greenfoot.getRandomNumber(100));
         //addObject(myRocks3, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
        Rocks myRocks4 = new Rocks(5, 100 + Greenfoot.getRandomNumber(50));
        addObject(myRocks4, 300 + Greenfoot.getRandomNumber(200), 325 + Greenfoot.getRandomNumber(100));
        //addObject(myRocks4, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
        Rocks myRocks5 = new Rocks(4, 100 + Greenfoot.getRandomNumber(50));
        addObject(myRocks5, 550 + Greenfoot.getRandomNumber(200), 175 + Greenfoot.getRandomNumber(100));
         //addObject(myRocks3, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
        Rocks myRocks6 = new Rocks(5, 100 + Greenfoot.getRandomNumber(50));
        addObject(myRocks6, 550 + Greenfoot.getRandomNumber(200), 325 + Greenfoot.getRandomNumber(100));
        //addObject(myRocks4, Greenfoot.getRandomNumber(getWidth()-200)+100, Greenfoot.getRandomNumber(getHeight()-200)+100);
        
       // DemonExplosion demonexplosion = new DemonExplosion();
        
        
        AvailableDarts myAD = new AvailableDarts();
        addObject(myAD, 700, 30);
        
        Level2Label myL2L = new Level2Label();
        addObject (myL2L, 250, 38);

        Congratulation congrats = new Congratulation();

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
        public void started()  
    {  
        music.playLoop();  
    }  
      
    public void stopped()  
    {  
        music.stop();  
    } 
}
