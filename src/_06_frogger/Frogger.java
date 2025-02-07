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
		frameRate(60);
		frogX = 400;
		frogY = 580;
		car1 = new Car(400, 400, 80, 5);
		car2 = new Car(550, 300, 80, 5);
		car3 = new Car(700, 200, 80, 5);
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
			frogX = 785;
		}
	}

	class Car {
		int carX;
		int carY;
		int carSizeLength;
		int carSpeed;


		void display() {
			fill(255, 0, 0);
			rect(carX, carY, carSizeLength, 30);
		}

		public Car(int xPosition, int yPosition, int carSizeLength, int carSpeed) {
			this.carX = xPosition;
			this.carY = yPosition;
			this.carSizeLength = carSizeLength;
			this.carSpeed = carSpeed;
			//how would I incorporate the speed variable into this line?
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
	}









}
