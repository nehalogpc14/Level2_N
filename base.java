import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class base here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class base extends World
{
    Counter counter;
    HealthBar healthBar;
    String[] map;
    public base()
    {    

        super(800, 500, 1);  
        counter = new Counter();
        healthBar = new HealthBar();
        setFields();
        prepare();
        for (int i=0; i<map.length; i++) for (int j=0; j<map[i].length(); j++)
            {

                int kind = "afbcghrdwzsqmko".indexOf(""+map[i].charAt(j));
                if (kind < 0) continue;
                Actor actor = null;
                if (kind == 0) actor = new Avatar(counter, healthBar);
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
                if (kind == 12)actor = healthBar;
                if (kind == 13)actor = new Key();
                if (kind == 14)actor = new Door();
                // if (kind == 13) actor = new PowerUp();
                //   if (kind == 13) actor = new SurpriseBox(PointsBar pb);
                //   if (kind == 14) actor = new PointsBar();
                addObject(actor, 16+j*32, 16+i*32);
        }

    }

    public void setFields() {}

    public void nextLevel() {}
    
    public HealthBar getHealthBar()
    {
        //return healthbar;
        return null;
    }

    private void prepare()
    {

        SurpriseBox surpriseBox = new SurpriseBox(counter);
        addObject (surpriseBox, 400, 400);

        PowerUp powerUp = new PowerUp(healthBar);
        addObject(powerUp, 300, 323);

    }
}
