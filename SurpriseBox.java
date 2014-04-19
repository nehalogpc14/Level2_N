import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.lang.*;

/**
 * Write a description of class SurpriseBox here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SurpriseBox extends Actor
{
    private Counter counter;
    private GreenfootSound soundapp = new GreenfootSound("applause.wav");
    private GreenfootSound soundno = new GreenfootSound("beep1.wav");
    private GreenfootImage open = new GreenfootImage("opened-box.png");
    private GreenfootImage close = new GreenfootImage("closedbox.png");
    private GreenfootImage plus10 = new GreenfootImage("10plus.png");
    private GreenfootImage minus10 = new GreenfootImage("10minus.png");
    int timer;
    int delta = 0;

    public SurpriseBox(Counter counter)
    {
        this.counter = counter;
        setImage(close);

    }

    /**
     * Act - do whatever the SurpriseBox wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        if (timer == 0)
        {
            if(foundAvatar())
            {
                timer++;
                setImage(open);
                delta = getFun();
            }
        }

        if (timer > 0)
            timer++;

        if (timer == 80)
        {
            if (delta == 10)
            {
                setImage(plus10);
            }
            else
            {
                setImage(minus10);
            }

        }
         
        if (timer == 160)
            {
                counter.add(delta);
                getWorld().removeObject(this);
                timer = 0;
                delta = 0;
            }
    }

    public int getFun()
    {
        int d = Greenfoot.getRandomNumber(2);
        if (d != 0)
        {
            soundno.play ();
            return d = -10;
        }
        else 
        { 
            soundapp.play ();
            return d = 10;
        }

    }

    public boolean foundAvatar()
    {
        Actor Avatar = getOneObjectAtOffset(0, 0, Avatar.class);
        if (Avatar!= null) 
        {
            setImage(open);
            return true;
        }
        else 
        {
            return false;
        }
    }
}

