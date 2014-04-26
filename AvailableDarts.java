import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*; // (Grapohics tools)
/**
 * Write a description of class AvailableDarts here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AvailableDarts extends Actor
{
    public void act() 
    {
        // Add your action code here.
        Lvl2BkgDesert myWorld = (Lvl2BkgDesert)getWorld();
        makeImage("Darts Left:", " ", myWorld.GetAvailDarts());
    }
   
    
    private void makeImage(String title, String prefix, int score)
    {
        int WIDTH = 190;
        int HEIGHT = 50;
        int FONT_SIZE = 10;
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);
        
        image.setColor(new Color(0, 0, 0, 160));
        image.setColor(new Color(255, 255, 255, 100));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        //Font font = image.getFont();
        //font = font.deriveFont(FONT_SIZE);
        //public Font(String name,int style,int size)
        Font font = new Font("Segoe UI", Font.BOLD, 25);
        //font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 10, 35);
        image.drawString(prefix + score, 130, 35);
        setImage(image);
    }
}
