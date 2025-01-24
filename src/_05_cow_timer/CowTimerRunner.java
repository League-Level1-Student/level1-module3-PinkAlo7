package _05_cow_timer;

public class CowTimerRunner {
    public static void main(String[] args) throws InterruptedException {
        CowTimer openPresentsTime = new CowTimer(30);
        openPresentsTime.start();
        openPresentsTime.playSound("moo.wav");
//playSound() method has to be accessed through an object of a different class because the methods are not static. If they were static, these methods could be accessed without the objects,
//  objects could freely be altered,but these alterations would affect all of the other opbjects as well
    	
    	/* Make a CowTimer, set its time and start it.
    
         * Use a short delay (seconds) when testing, then try with longer delays
         */
        
    }
}
