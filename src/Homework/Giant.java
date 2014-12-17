/*
* Yu Hou
* 12/03/2014
* CSE 142A
* TA: Chris R. Gores
* Assignment #9
* This defind a critter that change the name every 6 move
* it move around wall in a clockwise direction.
*/

import java.awt.*;

public class Giant extends Critter {
   
   private int count;
   
   public Giant(){
      count = 0;
   }
   
   public Action getMove(CritterInfo info){
      count++;
      if(info.getFront()==Neighbor.OTHER){
         return Action.INFECT;
      }else if(info.getFront()!=Neighbor.WALL){
         return Action.HOP;
      }else{
         return Action.RIGHT;
      }
   }
   
   public Color getColor(){
      return Color.GRAY;
   }
   
   public String toString(){
      if(count == 24){
         count = 0;
      }
      if(count < 6){
         return "fee";
      }else if(count < 12 && count >= 6){
         return "fie";
      }else if(count < 18 && count >= 12){
         return "foe";
      }else{
         return "fum";
      }
   }
   
}

