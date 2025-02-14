package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;

	int frogX;
	int frogY;
	int hopDistance = 10;
	Car car1;
	Car car2;
	Car car3;
	 PImage back;
	 PImage carLeft;
	 PImage carRight;
	 PImage frog;
	 
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);

	}

	@Override
	public void setup() {
		frameRate(60);
		frogX = 400;
		frogY = 580;
		car1 = new Car(400, 400, 80, 5, loadImage("src/_06_frogger/carLeft.png"));
		car2 = new Car(550, 300, 80, 5, loadImage("src/_06_frogger/carRight.png"));
		car3 = new Car(700, 200, 80, 5, loadImage("src/_06_frogger/carLeft.png"));
		back = loadImage("src/_06_frogger/froggerBackground.png");
		back.resize(WIDTH, HEIGHT);
		frog = loadImage("src/_06_frogger/frog.png");
		frog.resize(75, 75);
	}

	@Override
	public void mouseClicked() {
		// TODO Auto-generated method stub
		super.mouseClicked();

		System.out.println(mouseX + " " + mouseY);

	}

	@Override
	public void draw() {
		background(252, 3, 173);

		fill(31, 117, 9);
		ellipse(frogX, frogY, 30, 30);
		//instead of displaying the cars right here, can I just display them only after the "carMoveLeft/Right" lines?
		car1.carMoveLeft();
		car1.display();
		car2.carMoveRight();
		car2.display();
		car3.carMoveLeft();
		car3.display();
		if(car1.intersects(car1) == true) {
			frogX = 768;
			frogY = 537;
			
		}
		if(car2.intersects(car2) == true) {
			frogX = 768;
			frogY = 537;
		}
		if(car3.intersects(car3) == true) {
			frogX = 768;
			frogY = 537;
		}
		 background(back);
	        image (loadImage("src/_06_frogger/carLeft.png"),250,360);
	        image (loadImage("src/_06_frogger/carLeft.png"),250, 210);
	        image (frog, 300, 530);
	}

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
	//what is the shortcut version of bringing the function that [rints the mouse X's and Y's positions?

	public void keyPressed() {

		if (key == CODED) {
			if (keyCode == UP) {
				// Frog Y position goes up
				frogY -= hopDistance;

			} else if (keyCode == DOWN) {
				frogY += hopDistance;
				// Frog Y position goes down
			} else if (keyCode == RIGHT) {
				frogX += hopDistance;
				// Frog X position goes right
			} else if (keyCode == LEFT) {
				frogX -= hopDistance;
				// Frog X position goes left
			}

			doNotLeaveCanvasFroggy();
		}
	}

	public void doNotLeaveCanvasFroggy() {
		if (frogX > 785) {
			frogX = 15;
		}
		if(frogX < 15) {
			frogX = 785;
		}
	}

	class Car {
		int carX;
		int carY;
		int carSizeLength;
		int carSpeed;
		PImage carImage;


		void display() {
			fill(255, 0, 0);
			if (carImage == null) {
				rect(carX, carY, carSizeLength, 30);
			} else {
				image(carImage, carX, carY, carSizeLength, 30);
			}
		}

		public Car(int xPosition, int yPosition, int carSizeLength, int carSpeed) {
			this.carX = xPosition;
			this.carY = yPosition;
			this.carSizeLength = carSizeLength;
			this.carSpeed = carSpeed;
		}
		
		public Car(int xPosition, int yPosition, int carSizeLength, int carSpeed, PImage image) {
			this.carX = xPosition;
			this.carY = yPosition;
			this.carSizeLength = carSizeLength;
			this.carSpeed = carSpeed;
			this.carImage = image;
			carImage.resize(130, 81);
			//resize this car image to fit the screen appropiately
		}
			
			
		void carMoveLeft() {
			carX-=carSpeed;
			if(carX <  -carSizeLength) {
				carX = WIDTH;

			}
		}
		void carMoveRight() {
			carX+=carSpeed;
			if(carX == WIDTH) {
				carX = -carSizeLength;
			}
		}
	
		boolean intersects(Car car) {
			 if ((frogY > car.carY && frogY < car.carY+50) &&
			                (frogX > car.carX && frogX < car.carX+car.carSizeLength)) {
			   return true;
			  }
			 else  {
			  return false;
			 }
		
	}
		}









}
