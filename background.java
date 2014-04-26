import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends base
{

    /** ********************      MAP LEGEND     *********************** */
    //      a = avatar       f = floor           b = brownblock
    //      c = brownblockL  g = Goldcoin        h = Bluecoin
    //      r = Redcoin      d = Brickblock      w = Ghos
    //      z = Counter      s = Spikyball2      q = Spider
    //      m = Healthbar    x = SurpriseBox     p = PowerUp
    //      k = key          o = Door
    public void setFields()
    {
        counter = new Counter();
        healthBar = new HealthBar();
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

    public void nextLevel()
    {
        background1 bg1 = new background1(counter, healthBar);

        Greenfoot.setWorld(bg1);
    }

    // HealthBar healthbar = new HealthBar();


}
