import java.util.*;
public class GuessGame {
public static int MaxNum = 100;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    	intro();
    	game();
	}
	/*
	 * the intro of the game
	 */
    public static void intro(){
    	System.out.println("This program allows you to play a guessing game.");
    	System.out.println("I will think of a number between 1 and");
    	System.out.println("100 and will allow you to guess until");
    	System.out.println("you get it. For each guess, I will tell you");
    	System.out.println("whether the right answer is higher or lower");
    	System.out.println("than your guess.");
    	System.out.println();
    }

	public static void game(){
		Scanner in=new Scanner(System.in);
		int RNum=(int)(Math.random()*MaxNum);
		System.out.println("I'm thinking of a number between 1 and "+MaxNum+"...");
		for (int a = 0;a<MaxNum/2;a++){
			System.out.print("your guess?");
			int UserNum=in.nextInt();
			if (UserNum<RNum){
				System.out.println("It's higher");
			}if (UserNum>RNum){
				System.out.println("It's lower");
			}else{
				System.out.println("you got it right in "+"guesses");
			}
		}
	}
}