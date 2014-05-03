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
    private GreenfootImage plus20 = new GreenfootImage("20plus.png");
    int timer;
    int delta = 0;

    public SurpriseBox(Counter pcounter)
    {
        counter = pcounter;
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
                // setImage(open);
                delta = getFun();
            }
        }

        if (timer > 0)
            timer++;

        if (timer == 30)
        {
            if (delta == 10)
            {
                setImage(plus10);
            }
            else
            {
                setImage(plus20);

            }
            counter.add(delta);

        }

        if (timer == 45)
        {
            setImage(close);
            //getWorld().removeObject(this);
            // timer++;
            // delta = 0;
        }

        if (timer == 65)
        {
            setLocation(Greenfoot.getRandomNumber(800), Greenfoot.getRandomNumber(600));
        }
    }       
      
    public int getFun()
        {
            int d = Greenfoot.getRandomNumber(2);
            if (d < 1)
            {
                soundno.play ();
                return 10;
            }
            else 
            { 
                soundapp.play ();
                return 20;
            }

        }
    

    public boolean foundAvatar()
    {
        Actor Avatar = getOneObjectAtOffset(0, 0, Avatar.class);
        if (Avatar!= null) 
        {
            timer++;
            setImage(open);
            return true;
        }
        else 
        {
            return false;
        }
    }
}

