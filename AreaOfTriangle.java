import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		float base;
		float height;
		System.out.println("Base of the triangle");
		base=sc.nextFloat();
		System.out.println("Height of the triangle");
		height=sc.nextFloat();
		float area;
		area=(base*height)/2;
		System.out.println("Area of the triangle is "+area);

	}

}
