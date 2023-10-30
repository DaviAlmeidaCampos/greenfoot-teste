import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class dancef here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dancef extends edance
{
    GifImage MyGif = new GifImage("f-dance.gif");
    /**
     * Act - do whatever the dancef wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(MyGif.getCurrentImage());
        movimento();
    }
    public void movimento(){
        if(Greenfoot.isKeyDown("e")){
        MyGif = new GifImage("e-dance.gif");
        }
    }
}
