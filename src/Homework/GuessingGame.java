/*
* Yu Hou
* 10/26/2014
* CSE 142A
* TA: chris R.Gores
* Assignment #5
*
* This program let you to have game that guess a number between 1 to some number
* to will tell you if you are right and how many guesses you have used. You can type anything
* start with a "y" to play again. In the end you will have a report tell you how many games
* and guesses you had used. And how many guesses you had used in your best game.
*
*/

import java.util.*;
public class GuessingGame {
   
   public static final int MAX = 100;// can change this to change the range
   
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      intro();
      //initialize some variable that will be used in the following program
      String userInput="";
      int totalGames = 0;
      int totalGuess = 0;
      int guess = 0;
      int bestGames = 9999;
      //this part test the user's input to decided whether the user want to play it again
      do{
         guess = game(input);
         totalGuess += guess;
         //if there is one game's guesses is less than the previews one,than let it be the best game
         if(guess<bestGames){
            bestGames=guess;
         }
         System.out.print("Do you want to play again? ");
         userInput = input.next().toLowerCase();// convert the input into lowerCase
         System.out.println();
         totalGames++;
      }while(userInput.charAt(0)=='y'); // test if the first char is "y"
      
      count(totalGames,totalGuess,bestGames);// output the overall result
   }
   
   // introduction of this game
   public static void intro(){
      System.out.println("This program allows you to play a guessing game.");
      System.out.println("I will think of a number between 1 and ");
      System.out.println(MAX+" and will allow you to guess unitl ");
      System.out.println("you get it.  For each guess, I will tell you");
      System.out.println("whether the right answer is higher or lower");
      System.out.println("than your guess. ");
      System.out.println();
   }
   
   // the game method that play game once than return how many guesses had been used
   public static int game(Scanner input){
      Random rand = new Random();
      int randNum = rand.nextInt(MAX)+1; // let the random number be 1 to the MAX
      System.out.println("I'm thinking of a number between 1 and "+MAX+"···");
      System.out.print("Your guess? ");
      int userNum = input.nextInt();
      int guessCount = 1;
      while (userNum!=randNum){ // test if the guess is right
         if(userNum>randNum){ // tell user the right number is higher or lower
            System.out.println("It's lower. ");
            guessCount++;
         }else{
            System.out.println("It's higher. ");
            guessCount++;
         }
         System.out.print("Your guess ? ");
         userNum = input.nextInt();
      }
      if(guessCount==1){ // exception if user got it right in the first time
         System.out.println("You got it right in 1 guess");
      }else{
         System.out.println("You got it right in "+guessCount+" guesses");
      }
      return guessCount;
   }
   
   // output the overall result of the whole game
   public static void count(int totalGames,int totalGuess,int bestGames){
      double ratio = (double)totalGuess/(double)totalGames; //compute the number of guessed/game
      System.out.println("Overall results: ");
      System.out.println("	total games   = "+totalGames);
      System.out.println("	total guesses = "+totalGuess);
      System.out.printf("	guesses/game  = %.1f%n",ratio);
      System.out.println("	best game     = "+bestGames);
   }
   
}

