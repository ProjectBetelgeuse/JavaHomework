import java.util.*;
public class GuessGame {
public static int MaxNum = 10;
private static Scanner input;
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
		input = new Scanner(System.in);
		int RNum=(int)(Math.random()*MaxNum);
		int counter=1;
		int totalGames=0;
		System.out.println("I'm thinking of a number between 1 and "+MaxNum+"...");
		for (int a = 0;a<MaxNum/2;a++){
			System.out.print("your guess?");
			int UserNum=input.nextInt();
			if (UserNum<RNum){
				System.out.println("It's higher");
				counter++;
				continue;
			}if (UserNum>RNum){
				System.out.println("It's lower");
				counter++;
				continue;
			}else{
				System.out.println("you got it right in "+counter+" guesses");
				totalGames++;
				break;
			}
		}
		System.out.println("Do you want to play again?");
		String YN=input.next();
		char c=YN.charAt(0);
		if(c=='y'){
			game();
		}if(c=='n'){
			count();
		}if(c=='Y'){
			game();
		}if(c=='N'){
			count();
		}
	}
	public static void count(){
		System.out.println("Overall results: ");
		System.out.println("	total games = ");
	}
}