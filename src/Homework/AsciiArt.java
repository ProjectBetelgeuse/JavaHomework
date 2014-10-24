/* Yu Hou
* 10/7/2014
* CSE 142A
* TA:Christopher R. Gores
* Assignment #2
*
* This program drawing a heart in "*".
*/
package Homework;
public class AsciiArt {
   
   public static void main(String[] args) {
      upperPart();
      line();
      line();
      downPart();
   }
   
   public static void upperPart(){ //this part drawing the upper round of a heart.
      for(int a=1;a<7;a++){
         for(int b=7-a;b>0;b--){
            System.out.print(" ");
         }
         for(int c=0;c<1+2*a;c++){
            System.out.print("*");
         }
         for(int d=0;d<12-2*a;d++){
            System.out.print(" ");
         }
         for(int e=0;e<1+2*a;e++){
            System.out.print("*");
         }
         for(int f=7-a;f>0;f--){
            System.out.print(" ");
         }
         System.out.println();
      }
   }
   
   public static void downPart(){ //this part drawing the down part of this heart
      for(int g=0;g<14;g++){
         for(int h=0;h<g;h++){
            System.out.print(" ");
         }
         for(int i=0;i<28-2*g;i++){
            System.out.print("*");
         }
         System.out.println();
      }
      
   }
   
   public static void line(){ //this part is the line between the upper and the down part in order to make this graphic look more like a heart.
      for(int x=0;x<28;x++){
         System.out.print("*");
      }
      System.out.println();
   }
}

