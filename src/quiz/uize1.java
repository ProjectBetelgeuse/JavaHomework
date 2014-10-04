package quiz;

public class uize1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int x=1;x<=5;x++){
			for(int y=1;y<=20-4*x;y++){
				System.out.print("/");
			}
			for(int z=1;z<=8*x-8;z++){
				System.out.print("*");
			}
			for(int y=1;y<=20-4*x;y++){
				System.out.print("\\");
			}
			System.out.println();
		}
	}

}
