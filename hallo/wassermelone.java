import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wassermelone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wassermelone extends Actor
{
    /**
     * Act - do whatever the wassermelone wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(6);
        if(isAtEdge())
        getWorld().removeObject(this);
        treffen();
    }
    
    public void treffen()
    {
    Actor Alien = getOneIntersectingObject(Alien.class);
       if(Alien !=null)
       {
           getWorld().removeObject(Alien);
           getWorld().removeObject(this);
       }
        
    }

}
