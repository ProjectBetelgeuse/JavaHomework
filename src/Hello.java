import java.util.*;
public class Hello {

	public static void main(String[] args) {
		Scanner input = new Scanner("1 2 3 4");
		processData(input);
	}
	public static void processData(Scanner input){
		int count = 1;
		int predigits = 0;
		int sum = 0;
		double average = 0;
		while (input.hasNextInt()){
			int digit = input.nextInt();
			sum = digit+predigits;
			predigits = sum;
			System.out.println("Sum of "+count+" = "+sum);
			count++;
		}
		average = (double)sum/(count-1);
		System.out.print("Average = "+average);
	}
}

