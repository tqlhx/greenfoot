import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gegner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Alien extends Actor
{
    int kmh, health;
    MyWorld m;
    
    public Alien(int kmh, int health)
    {
        this.kmh = kmh;
        this.health = health;
    }
   
    public void addedToWorld(World w)
    {
        m = (MyWorld)w;
    }
    
    
    public void act()
    {
        moving();  
        this.treffen();
        grenze();
    }
    
    public void treffen()
    {
        if(isTouching(wassermelone.class))
        {
            health = health - 1; //gleich wie = hp -1 
            removeTouching(wassermelone.class);
            if(this.health == 0)
            {
                m.removeObject(this);
                Greenfoot.stop();
            }
        }
    }
        
    public void grenze()
    {
        if(isAtEdge())
         {
            this.playSound();
            getWorld().showText("Game over!!!", 400, 300);
            Greenfoot.stop();
        }
    }
        
    public void playSound()
    {
            
    }

    
   public void moving()
    { 
        move(-kmh); 
    }
    
  
}
