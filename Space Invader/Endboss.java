import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Endboss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Endboss extends Alien
{
    public Endboss()
    {
        super(1,20); //2. int ist hp (erstes kmh)
    }
    public void act()
    {
        moving();
        treffen();
        grenze();
    }
}
