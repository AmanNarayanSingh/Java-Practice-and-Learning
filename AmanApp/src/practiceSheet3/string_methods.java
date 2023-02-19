package practiceSheet3;
import java.util.Scanner;
import java.lang.*;
import practiceSheet3_library.*;

public class string_methods {
	
//	public static String convertLower(String str){
//		str=str.toLowerCase();
//		return str;
//	}
//	
//	public static String replaceSpaces(String str){
//		str=str.replace(" ", "_");
//		return str;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while(true){
			System.out.println("\nAvailale chocies: \n1. Convert the string to lowercase.\n2. Replace spaces with underscores.\n3. Letter template filling.\n4. Detect double and triple spaces in program.\n5. Letter formatting using esacape sequence characters.");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice){
			case 1: System.out.println("Enter your string: ");
					String str=sc.nextLine();
					System.out.println(practiceSheet3_library.Library_prac3.convertLower(str));
					break;
			case 2: System.out.println("Enter the complete sentence.");
					String string=sc.nextLine();
					System.out.println(practiceSheet3_library.Library_prac3.replaceSpaces(string));
					break;
			case 3: System.out.println("Enter your name: ");
					String inp=sc.nextLine();
					String template="Dear <|name|>, Thanks a lot!";
					template=template.replace("<|name|>", inp);
					System.out.println(template);
					break;
			case 4: System.out.println("Enter the complete sentence to check for double or triple spaces.");
					String input=sc.nextLine();
					System.out.println(input.indexOf("  ")!=-1? "Yes! double space is present at "+input.indexOf("  ")+".":"No double space available.");
					System.out.println(input.indexOf("   ")!=-1? "Yes! triple space is present at "+input.indexOf("   ")+".":"No triple space available.");
					break;
			default:System.out.println("Exiting from the program.");
					System.exit(0);
			}
		}
		

	}

}
