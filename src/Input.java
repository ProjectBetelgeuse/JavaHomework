import java.util.Scanner;


public class Input {
 public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
		public static void MianTitle(){
			System.out.println("Welcome to the game of Mad Libs.");
			System.out.println("I will ask you to provide brious words");
			System.out.println("and phrases to fill in a story.");
			System.out.println("The result will be weittem to an output file.");
		}
		public static void inPutFile(){
			System.out.println("(C)reate mad-lib, (V)iew mad-lib, (Q)uit?");
			String inputFilechoice = input.nextLine();
			if (inputFilechoice=="C"){
			    
			}if(inputFilechoice=="V"){
				
			}if(inputFilechoice=="Q"){
				
			}else{
				inPutFile();
			}
		
		}
}
