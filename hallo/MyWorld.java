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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        weltrettenmensch a = new weltrettenmensch("camel.png","up","down","left","right","enter","thumbs.mp3");
        addObject(a, 50, getHeight() - 435);
        weltrettenmensch b = new weltrettenmensch("elephant.png","w","s","a","d","space","grrrrr.mp3");
        addObject(b, 50, 430);
    }
    public void act()
    {
        spawnen(); 
    }
    public void spawnen()
    {
        if(Greenfoot.getRandomNumber(125) == 0)
        {
            F16 f = new F16();
            addObject(f,getWidth() - 8, Greenfoot.getRandomNumber(getHeight()));
        }
        if(Greenfoot.getRandomNumber(250) == 0)
        {
            Bombe b = new Bombe();
            addObject(b,getWidth() - 8, Greenfoot.getRandomNumber(getHeight()));
        }
    }
    
}
