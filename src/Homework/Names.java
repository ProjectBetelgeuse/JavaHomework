package Homework;

import java.util.*;
import java.awt.*;
import java.io.*;

public class Names {

	public static void main(String[] args) 
			throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/names.txt"));
		Scanner console = new Scanner(System.in);
		intro();
		System.out.print("name? ");
		String name = console.next().toLowerCase();
		System.out.print("gender (M or F)? ");
		String gender = console.next().toLowerCase();
		find(input,name,gender);
		
		
	}
	public static void intro(){
		System.out.println("This program allows you to search through the");
		System.out.println("data from the Social Scurity Administration");
		System.out.println("to see how popular a particular name has been");
		System.out.println("since 1920. ");
		System.out.println();
	}
	
	public static void find(Scanner input, String name, String gender){
		while(input.hasNextLine()){
			String line = input.nextLine();
			Scanner lineScan = new Scanner (line);
			boolean findName = lineScan.next().toLowerCase().equals(name);
			boolean findGender = lineScan.next().toLowerCase().equals(gender);
			if (findName&&findGender){
				System.out.print("the");
			}
		}
	}
	public static void paint(){
		DrawingPanel p = new DrawingPanel(500,500);
		Graphics g = p.getGraphics();
	}
	
}
