import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*; // (Grapohics tools)
/**
 * Write a description of class AvailableDarts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2Label extends Actor
{
    public Level2Label()
    {
        act();
    }
    public void act() 
    {
        // Add your action code here.
        Lvl2BkgDesert myWorld = (Lvl2BkgDesert)getWorld();
        makeImage("Level 2: DEFEAT YOUR FEAR");
    }
   
    
    private void makeImage(String title)
    {
        int WIDTH = 530;
        int HEIGHT = 70;
        int FONT_SIZE = 10;
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 160));
        //image.setColor(new Color(255, 255, 255, 100));
        //image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        //Font font = image.getFont();
        //font = font.deriveFont(FONT_SIZE);
        //public Font(String name,int style,int size)
        Font font = new Font("Segoe UI", Font.ITALIC, 40);
        //font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 20, 35);
        setImage(image);
    }
}
