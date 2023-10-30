import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cenario2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cenario2 extends intro
{

    /**
     * Constructor for objects of class cenario2.
     * 
     */
    public cenario2()
    {
        
    }
        public void act(){
        if(atraso > 0){
            atraso--;
        }
        if(Greenfoot.isKeyDown("enter") && (atraso == 0)){
        falas falas = new falas();
        addObject(falas,324,92);
        }
    }
    }
