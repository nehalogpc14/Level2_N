import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background1 extends World
{
    Counter counter;
    String[] map;

    /** ********************      MAP LEGEND     *********************** */
    //      a = avatar       f = floor           b = brownblock
    //      c = brownblockL  g = Goldcoin        h = Bluecoin
    //      r = Redcoin      d = Brickblock      w = Ghos
    //      z = Counter      s = Spikyball2      q = Spikyball3
    //      m = Healthbar    x = SurpriseBox     p = PowerUp
    //      k = key          o = Door
    public void setFields()
    {
        map = new String[] { "               z      m ",
            "  o                     ",
            " ddd       p            ",
            "        grrwrkg         ",
            "       ddddddddd        ",
            "  gg                gg  ",
            "  dd                dd  ",
            "        g      r        ",
            "      ddd  b  ddd       ",
            "                        ",
            "                   s    ",
            "                        ",
            "                        ",
            "                        ",
            "                        ",
            "fffffffffffffffffffffffff" };
    }

    /**
     * Constructor for objects of class background.
     * 
     */
    public background1()
    {    

        super(800, 500, 1); 

        setFields();
        counter = new Counter();
        prepare();
        //PointsBar pb = new PointsBar();

        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {

                int kind = "afbcghrdwzsqmko".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Avatar(counter);
                if (kind == 1) actor = new Floor();
                if (kind == 2) actor = new brownblock();
                if (kind == 3) actor = new brownblockL();
                if (kind == 4) actor = new Goldcoin();
                if (kind == 5) actor = new Bluecoin();
                if (kind == 6) actor = new Redcoin();
                if (kind == 7) actor = new Brickblock();
                if (kind == 8) actor = new Ghost();
                if (kind == 9) actor = counter;
                if (kind == 10)actor = new Spikyball2();
                if (kind == 11)actor = new Spikyball3();
                if (kind == 12)actor = new HealthBar();
                if (kind == 13)actor = new Key();
                if (kind == 14)actor = new Door();
                // if (kind == 13) actor = new PowerUp();
                //   if (kind == 13) actor = new SurpriseBox(PointsBar pb);
                //   if (kind == 14) actor = new PointsBar();
                addObject(actor, 16+j*32, 16+i*32);
        }
    }
    // HealthBar healthbar = new HealthBar();
    
    public HealthBar getHealthBar()
    {
        //return healthbar;
        return null;
    }

    private void prepare()
    {
        PointsBar pointsbar = new PointsBar();
        addObject(pointsbar, 33, 29);
        pointsbar.setLocation(112, 18);

        SurpriseBox surpriseBox = new SurpriseBox(counter);
        addObject (surpriseBox, 400, 400);

        PowerUp powerUp = new PowerUp(pointsbar);
        addObject(powerUp, 300, 323);

    }

    /**
     * Constructor for objects of class JavaBackground.
     * 
     */

}

