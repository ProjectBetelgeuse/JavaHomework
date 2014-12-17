/*
* Yu Hou
* 12/01/2014
* CSE 142A
* TA: Chris R. Gores
* Assignment #9
* This define a critter that move around and infect anyone that it can
* it is like a super verison of the FlyTrap.
*/

import java.awt.*;

public class Husky extends Critter {
   
   private int count;
   private Color gold;
   private Color purple;
   private Neighbor[] sides;
   private int close;
   private int open;
   
   public Husky(){
      count=0;
      gold = new Color(218,165,32);
      purple = new Color(167,87,168);
      sides = new Neighbor[4];
      close = 0;
      open = 0;
   }
   
   public Color getColor(){
      if(count%2==0){
         return gold;
      }else{
         return purple;
      }
   }
   
   public Action getMove(CritterInfo info){
      count++;
      sides[0]=info.getFront();
      sides[1]=info.getLeft();
      sides[2]=info.getRight();
      sides[3]=info.getBack();
      for(int i=0;i<sides.length;i++){
         if(sides[i]==Neighbor.OTHER){
            return Action.INFECT;
         }else{
            return Action.RIGHT;
         }
      }
      return Action.LEFT;
   }
   
   public String toString(){
      if(count%2==0){
         return "U";
      }else{
         return "W";
      }
   }
}

