package quiz;
import java.util.*;
public class Section_8 {

	public static void main(String[] args) {
		randomX();
	}
	public static void randomX(){
		Random rand = new Random();
		boolean hit16 = false;
	    while(!hit16){
	    	int randNum = rand.nextInt(15)+5;
	    	hit16 = randNum>=16;
	    	for(int i = 0;i<randNum;i++){
	    		System.out.print("x");
	    	}
	    	System.out.println();

	    }

	    }
	}