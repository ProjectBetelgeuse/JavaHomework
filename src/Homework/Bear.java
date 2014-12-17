/*
* Yu Hou
* 12/3/2014
* CSE 142A
* TA: Chirs R. Gores
* Assignment #9
*
* This define a bear that spin around the wall of the playground
* and eat everything in front of it.
*/
import java.awt.*;

public class Bear extends Critter {
   
   private boolean polar;
   private int count;
   
   public Bear(boolean polar){
      this.polar = polar;
      count = 0;
   }
   
   // if there is something in front of it than infect it
   // otherwise hop or turn left.
   public Action getMove(CritterInfo info){
      count++;
      if(info.getFront()==Neighbor.OTHER){
         return Action.INFECT;
      }else if(info.getFront()==Neighbor.EMPTY){
         return Action.HOP;
      }else{
         return Action.LEFT;
      }
   }
   
   // change the char every two step
   public String toString(){
      if(count%2==0){
         return "/";
      }else{
         return "\\";
      }
   }
   
   // get the color test whether it is white or black
   public Color getColor(){
      if(polar==true){
         return Color.WHITE;
      }else{
         return Color.BLACK;
      }
   }
}

