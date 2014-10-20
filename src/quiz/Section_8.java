package quiz;

public class Section_8 {

	public static void main(String[] args) {
		printTriangleType(6,6,6);
	}
		public static void printTriangleType(int x, int y,int z){
			if((x==y)&&(y==z)&&(z==x)){
				System.out.println("equilateral");
			}else if((x!=y)&&(y==z)){
				System.out.println("isosceles");
			}else if((x==z)&&(x!=y)&&(z!=y)){
				System.out.println("isosceles");
			}if((x!=y)&(y!=z)&(z!=x)){
				System.out.println("scalene");
			}
		}
}