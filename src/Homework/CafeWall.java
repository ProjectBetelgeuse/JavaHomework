package Homework;

import java.awt.*;

public class CafeWall {
	
	public static DrawingPanel panel = new DrawingPanel(650,400);
	public static Graphics g = panel.getGraphics();
	
	public static void main(String[] args) {
		panel.setBackground(Color.GRAY);
		//left up
		for (int a =0;a<4;a++){
			Box(40*a,0,20);
		}
		//left middle
		for (int a=0;a<5;a++){
			Box(60*a+50,70,30);
		}
		//left down
		for (int a = 0;a<4;a++){
			for (int b=0;b<8;b++){
				Box(50*a+10,150+27*b,25);
		}
		}
		//right up(400, 20) pair:2 size:35 offset:35
		for (int a=0;a<2;a++){
			for(int b=0;b<2;b++){
				Box(70*a+400,20+74*b,35);
			}
			for(int b=0;b<2;b++){
				Box(70*a+435,57+74*b,35);
			}
		}
		//middle down(250,200) pair:3 size:25 offset:10
		for (int a=0;a<3;a++){
			for(int b=0;b<3;b++){
				Box(50*a+250,200+54*b,25);
			}
			for(int b=0;b<3;b++){
				Box(50*a+260,227+54*b,25);
			}
		}	
		//right down(425,180) pair:5 size:20 offset:10
		for (int a=0;a<5;a++){
			for (int b=0;b<5;b++){
				Box(40*a+425,180+44*b,20);
			}
			for (int b=0;b<5;b++){
				Box(40*a+435,202+44*b,20);
			}
		}
}
	
public static void Box (int x,int y,int size){
	g.setColor(Color.BLACK);
//blackBox
    g.fillRect(x, y, size, size);
//slash
    g.setColor(Color.BLUE);
    g.drawLine(x, y, x+size, y+size);
    g.drawLine(x,y+size,x+size,y);
//whiteBox
    g.setColor(Color.WHITE);
    g.fillRect(x+size, y, size, size);
	}
}
