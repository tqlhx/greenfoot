import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bombe extends Alien
{
    public Bombe()
    {
        super(1,3); //2. int ist hp (erstes kmh)
    }
    public void act()
    {
        moving();
        
        if(isAtEdge())
        {
              getWorld().showText("Game over!!!", 400, 300);
              Greenfoot.stop();  
        }
    }
}
