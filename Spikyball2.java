import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spikyball2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spikyball2 extends Actor
{
    private int vSpeed = 0;
    private int acceleration = 1;
    
    /**
     * Act - do whatever the Spikyball2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
         checkFall();
         
    }
    
    public boolean onGround()
    {
        Actor under = getOneObjectAtOffset ( 0, 40, Floor.class);
        return under != null;
    }

    public void checkFall()
    {
        setLocation ( getX(), getY() + vSpeed);
        vSpeed = vSpeed + acceleration;
        if (onGround() || getY()<=100 && vSpeed<0)
        {
           vSpeed=-vSpeed + acceleration;
        }

        //else 
        // {
        //     if ((getY() == 100)) 
        //      vSpeed = -vSpeed;
    }

}
