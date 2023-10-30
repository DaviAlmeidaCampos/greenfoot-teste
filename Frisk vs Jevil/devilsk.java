import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class devilsk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class devilsk extends Actor
{
    /**
     * Act - do whatever the devilsk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moveAtaque();
        turn(+1);
        acertaralbo();
    }
    public void moveAtaque()
    {
    int speed = 1;
    this.setLocation(this.getX() - speed, this.getY());
    }
    public void acertaralbo() {
        Actor b = getOneIntersectingObject(edance.class);
        Actor a = getOneIntersectingObject(attack.class);
        if (b !=null){
            getWorld().removeObject(b);
            //getWorld().removeObject(this);
        }
                if (a !=null){
            getWorld().removeObject(a);
            getWorld().removeObject(this);
        } else if(isAtEdge()){
            getWorld().removeObject(this);
        }
        }
}
        
    
