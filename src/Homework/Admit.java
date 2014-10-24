/* Yu Hou
* 10/17/2014
* CSE 142A
* TA: Chris R. Gores
* Assignment #4
*
* This program build a system that you can input each score of your ACT and SAT
* test. Then this program will compute a universal score for each applicant. Finally
* program can compare each score and tell you which one is better.
*/
package Homework;
import java.util.*;

public class Admit {
   public static void main(String[] args) {
      //set up Scanner
      Scanner input = new Scanner(System.in);
      
      title();
      
      System.out.println("Information for applicant #1:");
      double firstScore = test(input); //the score of the first applicant
      System.out.println("Information for applicant #2:");
      double secondScore = test(input); //the score of the second applicant
      
      overAll(firstScore,secondScore); //pass two score to the overAll method to compare
   }
   
   //introduction of this program
   public static void title(){
      System.out.println("This program compares two applicants to");
      System.out.println("determine which one seems like the stronger");
      System.out.println("applicant. For each candidate I will need");
      System.out.println("either SAT or ACT scores plus a weighted GPA. ");
      System.out.println();
   }
   //use if to test what score the user want to input, ACT or SAT
   public static double test(Scanner input){
      System.out.print("	do you have 1) SAT scores or 2) ACT sores? ");
      int x = input.nextInt();
      if (x == 1){
         double satScore = SAT(input); //pass the SAT score to a variable
         return satScore; //return the number to the main method
      }else{
         double actScore = ACT(input); //pass the ACT score to a variable
         return actScore; //return the ACT score to the main method
      }
      
   }
   
   // To get user's SAT score
   public static double SAT(Scanner input){
      System.out.print("	SAT math? ");
      int satMath = input.nextInt();
      System.out.print("	SAT critical reading? ");
      int satCR = input.nextInt();
      System.out.print("	SAT writing? ");
      int satW = input.nextInt();
      double satExamScore = (2 * satMath + satCR + satW) / 32.0; //compute the satScore
      System.out.print("	SAT score = ");
      System.out.printf("%.1f%n",satExamScore); // Round up the number to 1 digit
      double satGPAScore = GPA(input); //pass the GPA score to a variable
      return satGPAScore+satExamScore; //return the final SAT score to the test method
   }
   
   // To get user's ACT score
   public static double ACT(Scanner input){
      System.out.print("	ACT English? ");
      int actEngl = input.nextInt();
      System.out.print("	ACT math? ");
      int actMath = input.nextInt();
      System.out.print("	ACT reading? ");
      int actRead = input.nextInt();
      System.out.print("	ACT science? ");
      int actScience = input.nextInt();
      //compute the act score
      double actExamScore = (actEngl + 2 * actMath + actRead + actScience) / 1.8;
      System.out.print("	exam score = ");
      System.out.printf("%.1f%n",actExamScore); //round up
      double actGPAScore = GPA(input); // pass the GPA score to a variable
      return actGPAScore + actExamScore; // return the final ACT score to the test method
   }
   
   // To get the user's GPA and compute a universal score
   public static double GPA(Scanner input){
      System.out.print("	overalll GPA? ");
      double overAll = input.nextDouble();
      System.out.print("	max GPA? ");
      double maxGPA = input.nextDouble();
      System.out.print("	Transcript Multiplier? ");
      double transM = input.nextDouble();
      double gpaScore = (overAll / maxGPA) * 100 * transM; //compute the gpaScore
      System.out.print("	GPA score = ");
      System.out.printf("%.1f%n",gpaScore); //round up
      System.out.println();
      return gpaScore; // return the gpaScore to SAT and ACT method
   }
   
   // To output the final score of the first applicant and second applicant
   // Then compare two applicant to test which one is better.
   public static void overAll(double firstScore,double secondScore){
      System.out.print("First applicant overall score  = ");
      System.out.printf("%.1f%n", firstScore);
      System.out.print("Second applicant overall score = ");
      System.out.printf("%.1f%n", secondScore);
      if(firstScore == secondScore){
         System.out.println("The two applicants seem to be equal");
      }else if(firstScore > secondScore){
         System.out.println("The first applicant seems to be better");
      }else{
         System.out.println("The second applicant seems to be better");
      }
   }
   
}

