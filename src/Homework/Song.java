/*Hou Yu
 * 
 * CSE 142
 * TA:
 * Assignment #1
 * 
 */

package Homework;

public class Song {

	public static void main(String[] args) {
		one();
		two();
		three();
		four();
		five();
	}
	public static void one(){
		System.out.println("There was an old woman who sawallowed a fly");
		end();
		System.out.println();
	}
	public static void two(){
		System.out.println("There was an old woman who sawallowed a spider,");
		System.out.println("That wriggled and iggled and jiggled inside her.");
		System.out.println("She swallowed the spider to catch the fly");
		end();
		System.out.println();
	}
	public static void three(){
		System.out.println("There was an old woman who swallowed a bird,");
		System.out.println("How absurd to swallow a bird.");
		she();
		end();
		System.out.println();
	}
	public static void four(){
		System.out.println("There was an old woman who swallowed a cat,");
		System.out.println("Imagine that to swallow a cat.");
		System.out.println("She swallowed the cat to catch the bird,");
		she();
		end();
		System.out.println();
	}
	public static void five(){
		System.out.println("There was an old woman who swallowed a dog,");
		System.out.println("What a hog to swallow a dog.");
		System.out.println("She swallowed the dog to catch the cat,");
		System.out.println("She swallowed the cat to catch the bird,");
		she();
		end();
		System.out.println();
	}
	public static void six(){
		System.out.println("There was an old woman who swallowed a ");
	}
	public static void she(){
		System.out.println("She swallowed the bird to catch the spider.");
		System.out.println("She swallowed the spider to catch the fly,");
	}
	public static void end(){
		System.out.println("I don't lnow why she swallowed that fly");
		System.out.println("Perhaps she'll die");
	}
}
