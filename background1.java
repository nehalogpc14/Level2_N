import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background1 extends base
{
    /** ********************      MAP LEGEND     *********************** */
    //      a = avatar       f = floor           b = brownblock
    //      c = brownblockL  g = Goldcoin        h = Bluecoin
    //      r = Redcoin      d = Brickblock      w = Ghost
    //      z = Counter      s = Spikyball2      q = Spikyball3
    //      m = Healthbar    x = SurpriseBox     p = PowerUp
    //      k = key          o = Door
    public void setFields()
    {
        map = new String[] { "               z      m ",
            "                        ",
            "   o                    ",
            "  ddd          grhr     ",
            "              ddddd     ",
            "       b                ",
            "                        ",
            "  g q g                 ",
            "  ddddd      c          ",
            "                        ",
            "      rh                ",
            "     dddd         w     ",
            "                dgggg   ",
            "   a            ddddd k ",
            "       h r  g r g g g   ",
            "fffffffffffffffffffffffff" };
    }
    
      public void nextLevel()
    {
        Greenfoot.setWorld(new background2());
    }

}


