import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class edance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
//Pai ou Principal
public class edance extends Actor{
    GifImage MyGif = new GifImage("e-dance.gif");
    
    public int speed = 1;
    public int sTimer = 0;
    
    /**
     * Act - do whatever the voce wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(MyGif.getCurrentImage());
        movimento();
    }
    public void movimento(){
        if (Greenfoot.isKeyDown("w")){
            this.setLocation(this.getX(), this.getY() - speed);
        }
        if(Greenfoot.isKeyDown("s")){
            this.setLocation(this.getX(), this.getY() + speed);
        }
        if(Greenfoot.isKeyDown("a")){
            this.setLocation(this.getX() - speed, this.getY());
        }
        if(Greenfoot.isKeyDown("d")){
            this.setLocation(this.getX() + speed, this.getY());
        }
          else if(Greenfoot.isKeyDown("z")&&(sTimer == 0)){
         sTimer ++;
         getWorld().addObject(new attack(), getX() +50,
         getY() +30);
        }
        else{
         if(!Greenfoot.isKeyDown("z" ))
         sTimer = 0;
        } 
        if(Greenfoot.isKeyDown("f")){
        MyGif = new GifImage("f-dance.gif");
        }
         if(Greenfoot.isKeyDown("e")){
        MyGif = new GifImage("e-dance.gif");
        }    
    }
}

    
    
