/*Yu Hou
* 12/03/2014
* CSE 142A
* TA:Chris R. Gores
* Assignment #9
* This define a Lion that change in random color and bouncing between the wall
*/
import java.awt.*;
import java.util.*;

public class Lion extends Critter {
   
   private Random r;
   private int count;
   private int which;
   private Color[] color = {Color.RED, Color.GREEN, Color.BLUE}; //random color
   
   public Lion(){
      r = new Random();
   }
   
   //changing color every three steps
   public Color getColor(){
      if(count%3==0){
         which = r.nextInt(3);
      }
      return color[which];
   }
   
   public String toString(){
      return "L";
   }
   
   // move around the wall and bounce
   public Action getMove(CritterInfo info){
      count++;
      if(info.getFront()==Neighbor.OTHER){
         return Action.INFECT;
      }else if(info.getFront()==Neighbor.WALL||info.getRight()==Neighbor.WALL){
         return Action.LEFT;
      }else if(info.getFront()==Neighbor.SAME){
         return Action.RIGHT;
      }else{
         return Action.HOP;
      }
   }
}

