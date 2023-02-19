import java.util.Scanner;
public class beta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Aman Narayan Singh");
		System.out.println("College: The National Institute of Engineering, Mysuru");
		System.out.println("Company: Cisco \t\t Role: Software Engineer\t");
		
		Scanner sc= new Scanner(System.in);		//object of scanner class to take inputs

		System.out.println("\nEnter your employee ID: ");
		int id=sc.nextInt();
		sc.nextLine();							//to ignore \n while reading next input string.
		
		System.out.println("Enter Current role: ");
		String role = sc.nextLine(); 			//read input string
		
		
		System.out.println("Enter Manager name: ");
		String manager=sc.nextLine();

		System.out.println("\nID: "+id);
		System.out.println("Current role: "+role);
		System.out.println("Manager Name: "+manager );
		
		//check for the validation of user input
		System.out.println("Please enter your input(integer data): ");
		boolean b1=sc.hasNextInt();				//check that user input is integer or not. 
		System.out.println(b1);
		

	}

}
