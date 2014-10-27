/*
 * Yu Hou
 * 10/26/2014
 * CSE 142A
 * TA: chris R.Gores
 * Assignment #5
 * 
 * 
 */
package Homework;
import java.util.*;
public class GuessingGame {
	
	public static final int MAX = 10;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		intro();
		String userInput="";
		int totalGames = 0;
		int totalGuess = 0;
		int guess = 0;
		int bestGames = 9999;
		do{
		guess = game(input);
		totalGuess += guess;
			if(guess<bestGames){
				bestGames=guess;
			}
		System.out.print("Do you want to play again? ");
		userInput = input.next().toLowerCase();
		System.out.println();
		totalGames++;
		}while(userInput.charAt(0)=='y');

		count(totalGames,totalGuess,bestGames);
			
	}
	
	public static void intro(){
		System.out.println("This origram allows you to play a guessing game.");
		System.out.println("I will think of a number between 1 and ");
		System.out.println(MAX+" and will allow youto guess unitl ");
		System.out.println("you get it. For each guess, I will tell you");
		System.out.println("whether the right answer is higher or lower");
		System.out.println("than your guess. ");
		System.out.println();
	}
	
	public static int game(Scanner input){
		Random rand = new Random();
		int randNum = rand.nextInt(MAX)+1;
		System.out.println("I'm thinking of a number between 1 and "+MAX+"···");
		System.out.print("Your guess ? ");
		int userNum = input.nextInt();
		int guessCount = 1;
		while (userNum!=randNum){
			if(userNum>randNum){
				System.out.println("It's lower. ");
				guessCount++;
			}else{
				System.out.println("It's higher. ");
				guessCount++;
			}
			System.out.print("Your guess ? ");
			userNum = input.nextInt();
		}
		if(guessCount==1){
			System.out.println("You got it right in 1 guess");
		}else{
			System.out.println("You got it right in "+guessCount+" guesses");
		}
		return guessCount;
	}
	
	public static void count(int totalGames,int totalGuess,int bestGames){
		double ratio = (double)totalGuess/(double)totalGames;
		System.out.println("Overall results: ");
		System.out.println("	total games   = "+totalGames);
		System.out.println("	total guesses = "+totalGuess);
		System.out.printf("	guesses/game  = %.1f%n",ratio);
		System.out.println("	best game     = "+bestGames);
	}
	




}
