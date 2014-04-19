import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;  
import java.awt.Font; 
import java.util.*;  

/**
 * Write a description of class PointsBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PointsBar extends Actor
{
    private int score;
    private int timeRem;
    private Timer timer;

    public PointsBar()
    {
        score = 0;
        timeRem = 60;
        setImage (new GreenfootImage(200, 30));
        update();
    }

    public int updateScore(int delta)
    {
        score += delta;
        update();
        return score;
    }

    public int updateTimeRem(int delta)
    {
        timeRem += delta;
        update();
        return timeRem;
    }

    public void update()
    {
        GreenfootImage img = getImage();
        img.clear();
        img.setColor(Color.BLACK);
        img.drawString("Score: " + score + " Time remaining: " + timeRem, 4, 20);
    }

    /**
     * Act - do whatever the PointsBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //         updateScore(2);
        updateTimeRem(-1);
    }     

}
