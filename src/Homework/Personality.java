package Homework;
import java.util.*;
import java.io.*;

public class Personality {
	
	public static final int num4 = 4;

	public static void main(String[] args) 
			throws FileNotFoundException{
		intro();
		Scanner console = new Scanner(System.in);
		System.out.print("input file name? ");
		String fileIn = console.next();
		System.out.print("output file name? ");
		String fileOut = console.next();
		Scanner input =  new Scanner(new File(fileIn));
		PrintStream output = new PrintStream (new File(fileOut));
		fileProcesses(input,output);

	}
	
	public static void intro(){
		System.out.println("This program processes a file of answers to the");
		System.out.println("Keirsey Temperament Sorter.  It converts the");
		System.out.println("various A and B answers for each person into");
		System.out.println("a sequence of B-percentages and then into a");
		System.out.println("four-letter personality type. ");
		System.out.println();
	}
	
	public static void fileProcesses(Scanner input,PrintStream output){
		while (input.hasNextLine()){
			int[] A = new int[num4];
			int[] B = new int[num4];
			int [] percentage = new int [num4];
			String name = input.nextLine();
			String AB = input.nextLine().toLowerCase();
			count(AB,A,B);
			percentage=percent(percentage,A,B);
			String result = convert(percentage);
			printOut(name, result, percentage,output);
		}
	}
	
	public static void count(String AB,int[] A,int[] B){
		for(int i = 0;i < AB.length()/7;i++){
			char EI = AB.charAt(i*7);
			char SN1 = AB.charAt(i*7+1);
			char SN2 = AB.charAt(i*7+2);
			char TF1 = AB.charAt(i*7+3);
			char TF2 = AB.charAt(i*7+4);
			char JP1 = AB.charAt(i*7+5);
			char JP2 = AB.charAt(i*7+6);
			if(EI == 'a'){
				A[0]++;
			}else if(EI == 'b'){
				B[0]++;
			}
			if(SN1 == 'a'){
				A[1]++;
			}else if(SN1 == 'b'){
				B[1]++;
			}
			if(SN2 == 'a'){
				A[1]++;
			}else if(SN2 == 'b'){
				B[1]++;
			}
			if(TF1 == 'a'){
				A[2]++;
			}else if(TF1 == 'b'){
				B[2]++;
			}
			if(TF2 == 'a'){
				A[2]++;
			}else if(TF2 == 'b'){
				B[2]++;
			}
			if(JP1 == 'a'){
				A[3]++;
			}else if(JP1 == 'b'){
				B[3]++;
			}
			if(JP2 == 'a'){
				A[3]++;
			}else if(JP2 == 'b'){
				B[3]++;
			}
		}
	}
	
	public static int[] percent(int[] percentage,int[] A,int[] B){
			for(int i = 0; i<percentage.length;i++){
				percentage[i] = (int)Math.round(((double)B[i]/(A[i]+B[i]))*100);
			}
			return percentage;
	}
	
	public static String convert(int[] percentage){
		String result = "";
		for(int i = 0; i < percentage.length;i++){
			if(percentage[i]>50){
				if(i==0){
					result += "I";
				}else if(i==1){
					result += "N";
				}else if(i==2){
					result += "F";
				}else if(i==3){
					result += "P";
				}
			}else if(percentage[i]<50){
				if(i==0){
					result += "E";
				}else if(i==1){
					result += "S";
				}else if(i==2){
					result += "T";
				}else if(i==3){
					result += "J";
				}
			}else{
				result += "X";
			}
		}
		return result;
	}
	
	public static void printOut(String name, String result, int[] percentage,PrintStream output){
		output.println(name+": "+Arrays.toString(percentage)+" = "+result);
	}
}
