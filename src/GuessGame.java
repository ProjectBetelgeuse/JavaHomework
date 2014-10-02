import java.util.*;
public class GuessGame {
public static final int MaxNum = 10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int userGuess=0;
		int comPick=0;
		int numGuesses=1;
		int totalGuesses=0;
		int numGames=0;
    	intro();
    	String playAgain="";
		do{
    		game(input,userGuess,comPick,numGuesses,totalGuesses);
    		System.out.println("Do you want to paly again?");
    		playAgain=input.next().toLowerCase();
    		numGames++;
    	}while(playAgain.charAt(0)=='y');
		count(numGames,totalGuesses);
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

	public static void game(Scanner input,int userGuess,int comPick,int numGuesses,int totalGuesses){
		Random RNum = new Random();
		comPick=RNum.nextInt(MaxNum)+1;
		System.out.println(comPick);//need to delete
		System.out.println("I'm thinking of a number between 1 and "+MaxNum+"...");
		System.out.println("your guess? ");
		userGuess= input.nextInt();
		while (userGuess != comPick){
			if (userGuess<comPick){
				System.out.println("It's higher");
			}
			else if(userGuess>comPick){
				System.out.println("It's lower");
				}
			 numGuesses++;
			 System.out.print("your guess? ");
			 userGuess=input.nextInt();
			}
		if(numGuesses==1){
			System.out.println("You got it right in "+numGuesses+" guess");
		}else{
		    System.out.println("You got it right in "+numGuesses+" guesses");
		}
	}
	public static void count(int numGames,int totalGuesses){
		System.out.println("Overall results: ");
		System.out.println("	total games   = "+numGames);
		System.out.println("	total guesses = "+totalGuesses);
		System.out.println("	guesses/game  = ");
		System.out.println("	best game     = ");
	}
}