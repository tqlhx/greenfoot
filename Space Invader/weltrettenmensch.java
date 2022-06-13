import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class weltrettenmensch extends Actor
{
    int kmh = 2;
    String oben, unten, links, rechts, schießen;
    boolean schuss = false;
    GreenfootSound sound;
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
            wassermelone w = new wassermelone();
            getWorld().addObject(w, getX() + 50, getY());
            sound.play(); 
            schuss = true;
        }
        if(!Greenfoot.isKeyDown(schießen) & schuss)
        {
            schuss = false;
        }
    }
}
