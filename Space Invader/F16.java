import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class f16 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class F16 extends Alien
{
    public F16()
    {
        super(2,1); //2. int ist hp (erstes kmh)
    }
    public void act()
    {
        moving();
        grenze();
    }
    
}
