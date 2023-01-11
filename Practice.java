
public class Practice {

	
	int a;
	int b;
	
	
	static void students(String ...names) {
		for(String name:names) {
			System.out.println(name);
		}
		System.out.println(names.length);
	}
	
	public static void main(String argss[]) {
//		int numbers[]= {1,2,4,4};
//		System.out.println(numbers[3]);
//        for(int i:numbers) {
//        	System.out.println(i);
//        	
//        }
		
		
		
		System.out.println(a);
		students("Rajesh","Seshu");
		
		String students[][]= {
				
				{"Rajesh","85%","First class"},{"Sirisha","95%","Distinction"}
		};
		
		System.out.println(students[0][1]);
		
		
		int marks[][]= {
				
				{4,2},{2,2}
		};
		
		System.out.println(marks[0]);
		
		
	}
}
