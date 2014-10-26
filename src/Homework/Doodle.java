package Homework;

/* Yu Hou
* 10/14/2014
* CSE 142A
* TA: chris R.Gores
* Assignment #3
*
* This program draw a peace logo and the word "PEACE" at the bottom
*/

import java.awt.*;

public class Doodle {
   
   public static void main(String[] args) {
      //set up the DrawingPanel
      DrawingPanel p = new DrawingPanel(400,400);
      Graphics g = p.getGraphics();
      
      p.setBackground(Color.RED);
      g.setColor(Color.BLACK);
      g.fillOval(100, 100, 200, 200);
      g.setColor(Color.RED);
      g.drawLine(200, 100, 200, 300);
      g.drawLine(200, 200, 129, 271);
      g.drawLine(200, 200, 271, 271);
      g.setColor(Color.black);
      g.drawRect(100, 330, 200, 50);
      g.setColor(Color.GREEN);
      g.drawString("PEACE", 110,370 );
   }
   
}

