package practiceSet5;

import java.util.Scanner;

import practiceSheet3_library.Library_prac3;
//import practiceSheet3_library.Library_prac;

public class Prac_set_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Choices available:\n1. Print pattern\n2. Sum of first 'n' even numbers using while loop.\n3. Print multiplication table of a given number 'n'.\n4. Print multiplication table in reverse order.\n5. Factorial of a given number using for loop. ");
		System.out.println("");
		System.out.println("Enter your choice: ");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		sc.nextLine();
		switch(choice){
		case 1: System.out.println("Enter the input: ");
			    int rows=sc.nextInt();
			    Library_prac3.pattern(rows);
			    break;
		case 2: System.out.println("Enter the value of 'n': ");
				int n=sc.nextInt();
				System.out.println(Library_prac3.sumOfEven(n));
				break;
		case 3: System.out.println("Enter the number 'n': ");
				int num=sc.nextInt();
				Library_prac3.multTable(num);
				break;
			
		}
		

	}

}
