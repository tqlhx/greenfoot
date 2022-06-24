import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int zerstoertegegner = 0;
    int timer = 0; //timer für boss damit es selten spawned
    int level = 1;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        weltrettenmensch a = new weltrettenmensch("rakete-blau.png","up","down","left","right","enter","laserschuss1.wav");
        addObject(a, 60, getHeight() - 435);
        weltrettenmensch b = new weltrettenmensch("rakete-rot.png","w","s","a","d","space","laser-4.wav");
        addObject(b, 60, 430);
    }
    public void act()
    {
        spawnen(); 
        bossGegner();
        showText(zerstoertegegner + " Gegner zerstört", getWidth()/2, 50);
    }
    public void bossGegner()
    {
        timer++; //timer wird immer eins mehr
        if(timer == 1500)
        {
            Endboss e = new Endboss();
            level = level + 10; // mit jedem boss wird level schwerer
            addObject(e, getWidth() - 5, getHeight()/2);
            timer = 0;
        }
    }
    public void anzahlschuesse()
    {
        zerstoertegegner++;
    }
    public void spawnen()
    {
        if(Greenfoot.getRandomNumber(125 + level) == 0)
        {
            F16 f = new F16();
            addObject(f,getWidth() - 8, Greenfoot.getRandomNumber(getHeight()));
        }
        if(Greenfoot.getRandomNumber(250 + level) == 0)
        {
            Bombe b = new Bombe();
            addObject(b,getWidth() - 8, Greenfoot.getRandomNumber(getHeight()));
        }
    }

    
}
