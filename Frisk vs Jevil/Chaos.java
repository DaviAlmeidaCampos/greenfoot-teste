import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Caos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chaos extends World
{
        private GreenfootSound bgMusic = new GreenfootSound("revolving.mp3");
   
    public void started()
    {
    bgMusic.playLoop();
    }
 
    public void stopped()
    {
    bgMusic.pause();
    }
    GifImage myCen = new GifImage("cenario.gif");
    /**
     * Constructor for objects of class Caos.
     * 
     */
    public void act()
    {    
        setBackground(myCen.getCurrentImage());
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
    }
    
    public Chaos()
    {
        super(640, 480, 1); 
        prepare();
    }
    
    public void prepare()
    {

        edance edance = new edance();
        addObject(edance,132,360);
        jevil jevil = new jevil();
        addObject(jevil,580,352);
    }
}