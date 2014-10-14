/* Yu Hou
 * 10/13/2014
 * CSE 142A
 * TA: Chris R. Gores
 * Assignment #3
 * 
 * This program use the DrawingPanel class to draw a Cafe Wall illusion
 */
package Homework;

import java.awt.*;

public class CafeWall2 {
	
	public static DrawingPanel p = new DrawingPanel(650,400);
	public static Graphics g = p.getGraphics();
	public static final int mortar=2; //the mortar constants
	
	public static void main(String[] args) {
		p.setBackground(Color.GRAY); //set the backGroud color to grey
		//upper-left
		box(0,0,4,20);
		//mid-left
		box(50,70,5,30);
		//lower-left
		grid(10,150,4,25,0);
		//lower-middle
		grid(250,200,3,25,10);
		//lower-right
		grid(425,180,5,20,10);
		//upper-right
		grid(400,20,2,35,35);
	}
	
	//This is method draw a pair of box
	public static void box(int x,int y,int pair,int size){
		for(int a=0;a<pair;a++){
			g.setColor(Color.BLACK);
			//blackBox
			g.fillRect(x, y, size, size);
			//cross
			g.setColor(Color.BLUE);
			g.drawLine(x, y, x+size, y+size);
			g.drawLine(x,y+size,x+size,y);
			//whiteBox
			g.setColor(Color.WHITE);
			g.fillRect(x+size, y, size, size);
			x+=2*size;
		}
	}
	
	//This is method draw a grid of box by use the "box" method
	public static void grid(int x,int y,int pair, int size, int offset){
		int realGap=size+mortar;
		for(int b=0;b<pair;b++){
			box(x,y+2*realGap*b,pair,size);
			box(x+offset,y+realGap+(2*realGap)*b,pair,size);
		}
	}	
}
