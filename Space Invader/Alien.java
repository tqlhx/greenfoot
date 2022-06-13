import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gegner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    int kmh, hp;
    
    public Alien(int xkmh, int xhp)
    {
        hp = xhp;
        kmh = xkmh;
    }
    
    
    public void act()
    {
        moving();  
        getroffen();
        
    }
    
    public void getroffen()
    {
         if(isTouching(wassermelone.class))
        {
            hp = hp -1;
            removeTouching(wassermelone.class);
        }
        
        if(hp == 0);
        {
            getWorld().removeObject(this);
        }
        
    }
    
   
    public void moving()
    { 
        move(-kmh); 
    }
    
  
}
