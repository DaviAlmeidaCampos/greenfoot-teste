import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jevil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jevil extends Actor
{
       GifImage MyGif = new GifImage("jevil.gif");
    
    public int speed = 1;
    public int sTimer = 0;
    /**
     * Act - do whatever the jevil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(MyGif.getCurrentImage());
        movimento();
    }
        public void movimento(){
        if (Greenfoot.isKeyDown("up")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if(Greenfoot.isKeyDown("down")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + speed, this.getY());
        }
          else if(Greenfoot.isKeyDown("x")&&(sTimer == 0)){
         sTimer ++;
         getWorld().addObject(new devilsk(), getX() -100,
         getY() -30);
        }
        else{
         if(!Greenfoot.isKeyDown("x" ))
         sTimer = 0;
        } 
    }
}

