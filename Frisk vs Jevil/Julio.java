import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Julio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Julio extends World
{
    public int atraso = 50;

    /**
     * Constructor for objects of class Julio.
     * 
     */
    public Julio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(640, 480, 1); 
    }

    public void act(){
        if(atraso > 0){
            atraso--;
        }
        if(Greenfoot.isKeyDown("enter") && (atraso == 0)){
        falas falas = new falas();
        addObject(falas,324,92);
        }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    }
}
