import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class intro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class intro extends World
{
    public int atraso = 50;
    /**
     * Constructor for objects of class intro.
     * 
     */
    public intro()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
    }
    public void act(){
        if(atraso > 0){
            atraso--;
        }
        if(Greenfoot.isKeyDown("enter") && (atraso == 0)){
        cenario2 cenario2 = new cenario2();
        Greenfoot.setWorld(cenario2);
        }
    }
}
