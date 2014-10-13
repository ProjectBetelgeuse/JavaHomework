/* Yu Hou
* 10/2/2014
* CSE 142A
* TA: Christopher R. Gores
* Assignment #2
*
* This program use for loop to print a Rocket.
* You can change the Rocket by change the constant "size".
*/

public class DrawRocket {
   
   public static final int size=5;//You can change this number in order to change the whole size of this Rocket.
   
   public static void main(String[] args) {
      triangle();
      line();
      frontPart();
      backPart();
      line();
      backPart();
      frontPart();
      line();
      triangle();
   }
   
   public static void triangle(){   //Print out the top and the end of the Rocket
      for(int x=1;x<=2*size-1;x++){
         for(int y=2*size-1-x;y>=0;y--){
            System.out.print(" ");
         }
         for(int z=0;z<x;z++){
            System.out.print("/");
         }
         System.out.print("**");
         for(int c=0;c<x;c++){
            System.out.print("\\");
         }
         System.out.println();
      }
      
   }
   
   public static void line(){   //Print out the line between the body and head of the Rocket
      System.out.print("+");
      for(int b=1;b<=(size*2);b++){
         System.out.print("=*");
      }
      System.out.println("+");
   }
   
   public static void frontPart(){    //Front part of the body of the Rocket
      for(int x=1;x<=size;x++){
         System.out.print("|");
         for(int y=size-x;y>0;y--){
            System.out.print(".");
         }
         for(int z=0;z<x;z++){
            System.out.print("/\\");
         }
         for(int h=2*(size-x);h>0;h--){
            System.out.print(".");
         }
         for(int a=0;a<x;a++){
            System.out.print("/\\");
         }
         for(int y=size-x;y>0;y--){
            System.out.print(".");
         }
         System.out.println("|");
      }
   }
   
   public static void backPart(){    //Back part of the body of the Rocket
      for(int x=size;x>0;x--){
         System.out.print("|");
         for(int y=size-x;y>0;y--){
            System.out.print(".");
         }
         for(int z=0;z<x;z++){
            System.out.print("\\/");
         }
         for(int h=2*(size-x);h>0;h--){
            System.out.print(".");
         }
         for(int z=0;z<x;z++){
            System.out.print("\\/");
         }
         for(int y=size-x;y>0;y--){
            System.out.print(".");
         }
         System.out.println("|");
      }
   }
}

