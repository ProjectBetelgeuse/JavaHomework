/* Yu Hou
 * 10/17/2014
 * CSE 142A
 * 
 * 
 */
package Homework;
import java.util.*;
public class Admit {

	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		title();
		System.out.println("Information for applicant #1:");
		double firstScore = test();
		System.out.println("Information for applicant #2:");
		double secondScore = test();
		overAll(firstScore,secondScore);
	}
	
	public static void title(){
		System.out.println("This program compares two applicants to");
		System.out.println("determine which one seems like the stronger");
		System.out.println("applicant. For each candidate I will need");
		System.out.println("either SAT or ACT scores plus a weighted GPA. ");
		System.out.println();
	}
	
	public static double test(){
		System.out.print("	do you have 1) SAT scores or 2) ACT sores? ");
		int x = input.nextInt();
		if (x == 1){
			double satScore = SAT();
			return satScore;
		}else{
			double actScore = ACT();
			return actScore;
		}
		
	}
	
	public static double SAT(){
		System.out.print("	SAT math? ");
		int satMath = input.nextInt();
		System.out.print("	SAT critical reading? ");
		int satCR = input.nextInt();
		System.out.print("	SAT writing? ");
		int satW = input.nextInt();
		double satExamScore = (2*satMath+satCR+satW)/32.0;
		System.out.print("	SAT score = ");
		System.out.printf("%.1f%n",satExamScore);
		double satGPAScore = GPA();
		return satGPAScore+satExamScore;
	}
	
	public static double ACT(){
		System.out.print("	ACT English? ");
		int actEngl = input.nextInt();
		System.out.print("	ACT math? ");
		int actMath = input.nextInt();
		System.out.print("	ACT reading? ");
		int actRead = input.nextInt();
		System.out.print("	ACT science? ");
		int actScience = input.nextInt();
		double actExamScore = (actEngl+2*actMath+actRead+actScience)/1.8;
		System.out.print("	exam score = ");
		System.out.printf("%.1f%n",actExamScore);
		double actGPAScore = GPA();
		return actGPAScore+actExamScore;
	}
	
	public static double GPA(){
		System.out.print("	overalll GPA? ");
		double overAll = input.nextDouble();
		System.out.print("	max GPA? ");
		double maxGPA = input.nextDouble();
		System.out.print("	Transcript Multiplier? ");
		double transM = input.nextDouble();
		double gpaScore = (overAll/maxGPA)*100*transM;
		System.out.print("	GPA score = ");
		System.out.printf("%.1f%n",gpaScore);
		System.out.println();
		return gpaScore;
	}
	
	public static void overAll(double firstScore,double secondScore){
		System.out.print("First applicant overall score = ");
		System.out.printf("%.1f%n", firstScore);
		System.out.print("Second applicant overall score = ");
		System.out.printf("%.1f%n", secondScore);
		if(firstScore==secondScore){
			System.out.println("The two applicants seem to be equal");
		}else if(firstScore>secondScore){
			System.out.println("The first applicant seems to be better");
		}else{
			System.out.println("The second applicant seems to be better");
		}
	}
	
}
