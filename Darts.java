import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Darts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Darts extends Mover
{
    public Darts(int rotation) 
    {
        //System.out.println(rotation);
        setRotation(rotation - 90);
        GreenfootImage img = getImage();
        img.scale(40,40);
        setImage(img);
    }  
    
    public void act()
    {
        //Sets our image as a smaller size
        GreenfootImage img = getImage();
        img.scale(40,40);
        //setRotation(270);
        setImage(img);
        
        move(15);
        
        if(atSide())
        {
            getWorld().removeObject(this);
        }
        
        else 
        {
        if (touchingDemon())
        {  
           //Remove Bullet and Demon objects;
 //            bluedemon = getOneObjectAtOffset(0, 0, BlueDemon.class);

 //          if (BlueDemon.class != null)
 //          {
 //              setLocation(0,getHeight()/2);
 //            }
         } 
        }
    }    
    
    
    public boolean touchingDemon() {    
     return !getIntersectingObjects(BlueDemon.class).isEmpty();    
     } 
//I'm putting a comment here ;)
        //Checks to see is the Dart as at the edge of the screen. If it is, remove the Dart
    public boolean atSide()
    {
        if(getX() == 0 || getX() == 799)
        {
            return true;
        }
        if(getY() == 0 || getY() == 699)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
