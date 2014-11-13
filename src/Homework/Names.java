package Homework;

import java.util.*;
import java.awt.*;
import java.io.*;

public class Names {
	
	public static final int decades = 14;
	public static final int years = 1880;
	public static final int width = 70;

	public static void main(String[] args) 
			throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/names.txt"));
		Scanner console = new Scanner(System.in);
		intro();
		System.out.print("name? ");
		String name = console.next().toLowerCase();
		System.out.print("gender (M or F)? ");
		String gender = console.next().toLowerCase();
		String line = find(input, name, gender);
		if(line.length()==0){
			System.out.println("name/gender combination not found");
		}else{
			lineScan(line);
		}
	}
	public static void intro(){
		System.out.println("This program allows you to search through the");
		System.out.println("data from the Social Scurity Administration");
		System.out.println("to see how popular a particular name has been");
		System.out.println("since 1920. ");
		System.out.println();
	}
	
	public static String find(Scanner input, String name, String gender){
		while(input.hasNextLine()){
			String line = input.nextLine();
			Scanner lineBase = new Scanner(line);
			boolean findName = lineBase.next().toLowerCase().equals(name);
			boolean findGender = lineBase.next().toLowerCase().equals(gender);
			if(findGender&&findName){
				return line;
			}
		}
		return "";	
	}
	
	public static void lineScan(String line){
		DrawingPanel p = new DrawingPanel(decades*width,550);
		Graphics g = p.getGraphics();
		grid(p,g);
		Scanner lineBase = new Scanner(line);
		String name = lineBase.next();
		String gender = lineBase.next();
		int num = 0;
		int count = 0;
		int preNum = lineBase.nextInt();
		int pre = 0;
		g.setColor(Color.RED);
		if(preNum==0){
			g.drawString(name+" "+gender+" "+preNum, count*width, 525);
			pre = 525;
		}else{
			g.drawString(name+" "+gender+" "+preNum, count*width, (int)(Math.round(preNum*0.5)+24));
			pre = (int)(Math.round(preNum*0.5)+24);
		}
		while(lineBase.hasNextInt()){
			num = lineBase.nextInt();
			if(num==0){
				g.drawString(name+" "+gender+" "+num, (count+1)*width, 525);
				g.drawLine(count*width, pre, (count+1)*width, 525);
				pre = 525;
			}else{
				g.drawString(name+" "+gender+" "+num, (count+1)*width, (int) (Math.round(num*0.5)+24));
				g.drawLine(count*width, pre, (count+1)*width, (int)(Math.round(num*0.5)+24));
				pre = (int)(Math.round(num*0.5)+24);
			}
			preNum=num;
			count++;
		}
	}
	
	public static void grid(DrawingPanel p, Graphics g){
		g.drawLine(0, 25, decades*width, 25);
		g.drawLine(0, 525, decades*width, 525);
		for(int i = 0;i<decades;i++){
			g.drawLine(i*width, 0, i*width, 550);
			g.drawString(""+(years+(i*10)), i*width, 550);
		}
		
	}
	
}
