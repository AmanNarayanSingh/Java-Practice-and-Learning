package practiceSet;
import java.util.Scanner;

public class Chap1_prac {
	
	public float sumOfThree(float a, float b, float c){
		return a+b+c;
	}
	
	public static float cgpa(){
		System.out.println("Enter the marks of 3 subjects: ");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		return (float)(a+b+c)/30;
	}
	
	public static String greet(String name){
		String res= "Hello "+ name +", have a good day!";
		return res;
	}
	
	public static double convert(double km){
		return km*0.62137119;
	}
	
	public static String checkInteger(){
		Scanner sc=new Scanner(System.in);
		boolean res=sc.hasNextInt();
		return res==true ? "Yes it's an integer":"No it's not an integer";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Choices available: \n1. Sum of three\n2. CGPA\n3. Greet me!\n4. Convert km to miles\n5. Check for the validation of integer.");
		while(1==1){
			System.out.println("Enter the choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			Chap1_prac obj=new Chap1_prac();
			switch(choice){
			case 1: System.out.println("Enter the three numbers");
					int a=sc.nextInt();
					int b=sc.nextInt();
					int c=sc.nextInt();
					System.out.println("The sum of three integers is: "+obj.sumOfThree(a,b,c));
					break;
			case 2: System.out.println("The CGPA obtained is: "+cgpa());
					break;
			case 3: System.out.println("Enter your name: ");
					String inp = sc.nextLine();
//					sc.next();
					System.out.println(greet(inp));
					break;
			case 4: System.out.println("Enter the distance in km: ");
					double km=sc.nextInt();
					System.out.println(obj.convert(km));
					break;
			case 5: System.out.println("Enter the value: ");
					System.out.println(checkInteger());
					break;
			default:System.out.println("Exiting from the program! "); 
					return;
			}
		}
		
	
	}

}
