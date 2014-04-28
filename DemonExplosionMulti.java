import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * An Explosion. It starts by expanding and then collapsing
 *
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DemonExplosionMulti extends Actor
{
    int sx = 20;
    int sy = 20;
    
    public DemonExplosionMulti()
    {
        GreenfootImage img = new GreenfootImage();
        img.scale(sx,sy);
        setImage(img);
    }
    
    
    
    
    /**
     * Explode!
     */
    int counter = 0;
    public void act()
    {
        counter++;
        if(counter > 50)
        {
            Actor BlueDemon = getOneIntersectingObject(BlueDemon.class);
            //System.out.println("removing Rocks Num:" + Rock.getNumber());
            //getWorld().removeObject(Rock);
            getWorld().removeObject(this);
        }
        
        //if((counter % 10) == 0)
        {
            GreenfootImage img = new GreenfootImage("explosion.png");            
            img.scale(sx + counter*2,sy + counter*2);
            setImage(img);        
        }
    }    
}
