import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class weltrettenmensch extends Actor
{
    int kmh = 2;
    int leben = 3;
    String oben, unten, links, rechts, schießen;
    boolean schuss = false;
    GreenfootSound sound;
    GreenfootSound explosionsound = new GreenfootSound("explosionsound1.wav");
    public weltrettenmensch(String camel, String xOben, String xUnten, String xLinks, String xRechts, String xSchießen, String xSound)
    {
        oben = xOben;
        unten = xUnten;
        links = xLinks;
        rechts = xRechts;
        schießen = xSchießen;
        setImage(camel);
        sound = new GreenfootSound(xSound);
    }
    
    public void act()
    {   
        checkAlienTreffen();
        
        if(Greenfoot.isKeyDown(oben)) 
        {
            setLocation(getX(), getY() - kmh);
        }
        if(Greenfoot.isKeyDown(links))
        {
            move(-2);
        }
        
         if(Greenfoot.isKeyDown(rechts))
        {
            move(2);
        }
        
        if(Greenfoot.isKeyDown(unten))
        {
            setLocation(getX(), getY() +  kmh);
        }
        
        if(Greenfoot.isKeyDown(schießen) & !schuss)
        {
            bullet w = new bullet();
            getWorld().addObject(w, getX() + 50, getY());
            sound.play(); 
            schuss = true;
        }
        if(!Greenfoot.isKeyDown(schießen) & schuss)
        {
            schuss = false;
        }
    }
    public void checkAlienTreffen()
    {
        if(isTouching(Alien.class))
        {
            leben--; //leben-1
            removeTouching(Alien.class);
            GreenfootImage altesBild = getImage();
            GreenfootImage explosionBild = new GreenfootImage ("kaboom.png");
            explosionsound.play();
            setImage(explosionBild);
            Greenfoot.delay(7);
            setImage(altesBild);
            if(leben == 0)
            {
                getWorld().removeObject(this);
            }
            
        }
    }
}
