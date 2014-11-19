package Homework;
/*
 * Yu Hou
 * 11/12/2014
 * CSE 142A
 * TA: Chris R.Gores
 * Assignment #6
 * 
 * This program allow you to find how popular a baby name in decades' data. And can make
 * a diagram to show you the trend of a name in recent years.
 */
import java.util.*;
import java.awt.*;
import java.io.*;

public class Names {
	// the constant that can change in order to change to format of the diagram.
	public static final int decades = 10;
	public static final int years = 1920;
	public static final int width = 90;

	public static void main(String[] args) 
			throws FileNotFoundException {
		Scanner input = new Scanner(new File("src/names2.txt"));
		Scanner console = new Scanner(System.in);
		intro();
		// user input
		System.out.print("name? ");
		String name = console.next().toLowerCase();
		System.out.print("gender (M or F)? ");
		String gender = console.next().toLowerCase();
		//find whether the name is in the database. 
		String line = find(input, name, gender);// line that the name and gender match input
		if(line.length()==0){
			System.out.println("name/gender combination not found");
		}else{
			diagram(line);
		}
	}
	
	//introduction of the program. 
	public static void intro(){
		System.out.println("This program allows you to search through the");
		System.out.println("data from the Social Security Administration");
		System.out.println("to see how popular a particular name has been");
		System.out.println("since "+years+".");
		System.out.println();
	}
	
	// find the user's input of name&gender combination in the database
	public static String find(Scanner input, String name, String gender){
		while(input.hasNextLine()){
			String line = input.nextLine();// scan line by line
			Scanner lineBase = new Scanner(line);// scan words by words
			boolean findName = lineBase.next().toLowerCase().equals(name);
			boolean findGender = lineBase.next().toLowerCase().equals(gender);
			if(findGender&&findName){
				return line; // if find the combination then return that line. 
			}
		}
		return ""; 
	}
	
	//scan the line that has the name&gender combination to output a diagram
	//that show the popular trend of this name. 
	public static void diagram(String line){
		DrawingPanel p = new DrawingPanel(decades*width,550);
		Graphics g = p.getGraphics();
		grid(p,g); // draw the grid that under the polt.
		Scanner lineBase = new Scanner(line); //scan the line that have the combination
		String name = lineBase.next(); // find the name
		String gender = lineBase.next(); //find the gender
		int num = 0;
		int count = 0;
		int preNum = lineBase.nextInt(); //find the first number
		int pre = 0;
		boolean hitMax = false;
		g.setColor(Color.RED); //set the pen to red
		// draw the first number diagram in the panel
		if(preNum==0){
			g.drawString(name+" "+gender+" "+preNum, count*width, 525);
			pre = 525;
		}else{
			g.drawString(name+" "+gender+" "+preNum, count*width, 
					(int)(Math.round(preNum*0.5)+24));
			pre = (int)(Math.round(preNum*0.5)+24);
		}
		// scan the number part to make to whole graph
		while(lineBase.hasNextInt()&&!hitMax){
			num = lineBase.nextInt();
			//test whether the number is 0, which means it is not in the rank that year.
			if(num==0){
				g.drawString(name+" "+gender+" "+num, (count+1)*width, 525);
				g.drawLine(count*width, pre, (count+1)*width, 525);
				pre = 525;
			}else{
				g.drawString(name+" "+gender+" "+num, (count+1)*width, 
						(int) (Math.round(num*0.5)+24));
				g.drawLine(count*width, pre, (count+1)*width, 
						(int)(Math.round(num*0.5)+24));
				pre = (int)(Math.round(num*0.5)+24);
			}
			preNum=num;
			count++;
			//test whether it had already scan enough number.
			if(count>=(decades-1)){
				hitMax=true;
			}
		}
	}
	
	// draw the grid that under the number diagram.
	public static void grid(DrawingPanel p, Graphics g){
		g.drawLine(0, 25, decades*width, 25);
		g.drawLine(0, 525, decades*width, 525);
		for(int i = 0;i<decades;i++){
			g.drawLine(i*width, 0, i*width, 550);
			g.drawString(""+(years+(i*10)), i*width, 550);
		}
	}
}
