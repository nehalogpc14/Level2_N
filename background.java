import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends base
{
    Counter counter;
    HealthBar healthBar;
   // String[] map;

    /** ********************      MAP LEGEND     *********************** */
    //      a = avatar       f = floor           b = brownblock
    //      c = brownblockL  g = Goldcoin        h = Bluecoin
    //      r = Redcoin      d = Brickblock      w = Ghos
    //      z = Counter      s = Spikyball2      q = Spider
    //      m = Healthbar    x = SurpriseBox     p = PowerUp
    //      k = key          o = Door
    public void setFields()
    {
        map = new String[] 
        { 
            "               z      m ",
            "  o                     ",
            " ddd       p            ",
            "        grrwrkg         ",
            "       ddddddddd        ",
            "  gg                gg  ",
            "  dd                dd  ",
            "        g      r        ",
            "      ddd  b  ddd       ",
            "                        ",
            "     q            s     ",
            "    gr            rh    ",
            "   ddd            ddd   ",
            "  a                     ",
            "        g r   r  g      ",
            "fffffffffffffffffffffffff" };
    }

    public void nextLevel(Counter counter, HealthBar healtBar)
    {
        Greenfoot.setWorld(new background1());
    }

    // HealthBar healthbar = new HealthBar();


}
