package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    int frogX;
    int frogY;
    int hopDistance = 10;
    Car car1;
    Car car2;
    Car car3;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
    	frogX = 400;
    	frogY = 600;
    }

    @Override
    public void mouseClicked() {
    	// TODO Auto-generated method stub
    	super.mouseClicked();
    	
    	System.out.println(mouseX + " "+mouseY);
    	
    }
    
    
    @Override
    public void draw() {
    	background(252, 3, 173);
    	
    	fill(31,117,9);
    	ellipse(frogX,frogY, 30, 30);

    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    //why can I not make this method static?
    //what does key == CODED mean?
    //How do I make it so that the frog does'nt go past the boundaries of the screen?
     public void keyPressed()
    {
    	 
    	 
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	frogY-=hopDistance;
         
            }
            else if(keyCode == DOWN)
            {
            	frogY+=hopDistance;
                //Frog Y position goes down 
            }
            else if(keyCode == RIGHT)
            {
            	frogX+=hopDistance;
                //Frog X position goes right
            }
            else if(keyCode == LEFT)
            {
            	frogX-=hopDistance;
                //Frog X position goes left
            }
            
            doNotLeaveCanvasFroggy();
        }
    }
     
     public void doNotLeaveCanvasFroggy() {
    	 if (frogX > 785) {
    		 frogX = 785;
    	 }
     }
     
     class Car{
	int carX;
	int carY;
	int carSizeLength;
	int carSpeed;
	
	void display()
	  {
	    fill(0,255,0);
	    rect(carX, carY, carSizeLength, 50);
	  }
	
	public Car(int xPosition, int yPosition, int carSizeLength, int carSpeed) {
		this.carX = xPosition;
		this.carY = yPosition;
		this.carSizeLength = carSizeLength;
		this.carSpeed = carSpeed;
		
		
	}
    	 
     }
}

