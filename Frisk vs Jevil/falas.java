import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class falas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class falas extends Actor
{
     GifImage falas = new GifImage("dialogo.gif");
            
    /**
     * Act - do whatever the falas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(falas.getCurrentImage());// Add your action code here.
    }
}
