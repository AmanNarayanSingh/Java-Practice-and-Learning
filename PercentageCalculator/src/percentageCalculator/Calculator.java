package percentageCalculator;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the marks of 5 subjects");
		Scanner sc=new Scanner(System.in);
		int maths=sc.nextInt();
		int english=sc.nextInt();
		int science=sc.nextInt();
		int hindi=sc.nextInt();
		int sst=sc.nextInt();
		System.out.println("The percentage obtained by the students is: " + ((float)(maths+hindi+science+sst+english)*100)/500);
	}

}
