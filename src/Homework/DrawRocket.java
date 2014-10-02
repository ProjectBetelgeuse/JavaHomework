package Homework;

public class DrawRocket {
public static final int size=5;
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
	public static void triangle(){
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
	public static void line(){
		System.out.print("+");
		for(int x=1;x<=(size*2);x++){
			System.out.print("=*");
		}
		System.out.println("+");
	}
	public static void frontPart(){
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
			for(int z=0;z<x;z++){
				System.out.print("/\\");
			}
			for(int y=size-x;y>0;y--){
				System.out.print(".");
			}
			System.out.print("|");
			System.out.println();
		}
	}
	public static void backPart(){
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
			System.out.print("|");
			System.out.println();
		}
	}
}