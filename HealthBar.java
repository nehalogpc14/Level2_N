import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar extends Actor
{
    int health = 120;
    int totalTime;
    int healthBarWidth = 120;
    int healthBarHeight = 75;
    int pixelsPerHealthPoint = (int)healthBarWidth/health;
    int durationSecs;
    long startTime;
    private int score;
    private int timeRem;
    int timer;
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public HealthBar()
    {
        startTime = System.currentTimeMillis();  
        totalTime = 120;
        score = 0;
        timeRem = 60;
        setImage (new GreenfootImage(200, 30));
        update();
    }

    public void act() 
    {
        update();
        //updateTimeRem(-1);
    }    

    public void update()
    {
        setImage(new GreenfootImage(healthBarWidth + 2, healthBarHeight + 2));
        GreenfootImage myImage = getImage();
        myImage.setColor(Color.WHITE);
        myImage.drawRect(0, 0, healthBarWidth + 1, healthBarHeight + 1);
        myImage.setColor(Color.GREEN);
        myImage.fillRect(1, 1, health*pixelsPerHealthPoint, healthBarHeight);
        // Later (for example in an act() method), do:  
        long currentTime = System.currentTimeMillis();  
        int durationMillis = (int)(currentTime - startTime);  
        // durationMillis is in milliseconds, so you  
        // can convert to seconds/minutes whatever:  
        durationSecs = durationMillis / 1000; 
        health = totalTime - durationSecs;
    }
    //     public HealthBar()
    //     {
    //         score = 0;
    //         totalTime = 120;
    //         setImage (new GreenfootImage(200, 30));
    //         update();
    //     }
    public void addTime(int extra)
    {
        if(extra > durationSecs)
        {
            totalTime += durationSecs;
        }
        else
        {
            totalTime += extra;
        }
        update();
        
    }
}     


