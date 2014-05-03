import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background2 extends base
{
    public background2(Counter counter, HealthBar healthbar)
    {
        super(counter,healthbar);
    }

    /** ********************      MAP LEGEND     *********************** */
    //      a = avatar       f = floor           b = brownblock
    //      c = brownblockL  g = Goldcoin        h = Bluecoin
    //      r = Redcoin      d = Brickblock      w = Ghost
    //      z = Counter      s = Spikyball2      q = Spikyball3
    //      m = Healthbar    x = SurpriseBox     p = PowerUp
    //      k = key          o = Door
    public void setFields()
    {
        map = new String[] 
        { 
            "               z      m ",
            "  q rrrhrrrr     rrr    ",
            "  dddddddddd    ddddd   ",
            "                        ",
            "   b        dddd        ",
            "                        ",
            "                        ",
            "  c         rgh         ",
            "  gr                    ",
            "  ddd             rh    ",
            "                 dddd   ",
            "    rr                  ",
            "   dddd      b          ",
            "                        ",
            " w  rh a   ggg      w   ",
            "fffffffffffffffffffffffff" 
        };
        prepare();
    }

    public void nextLevel()
    {
        Greenfoot.setWorld(new Lvl2BkgDesert());
    }

    private void prepare()
    {

        SurpriseBox surpriseBox = new SurpriseBox(counter);
        addObject (surpriseBox, 400, 400);

        PowerUp powerUp = new PowerUp(healthBar);
        addObject(powerUp, 300, 323);

    }
}

