import java.util.Scanner;
import java.lang.System;

class Library{
	
	String [] books;
	int total_books;
	
	public Library(){
		this.total_books=0;
		this.books=new String[50];
	}
	public void addBooks(String book){
		System.out.println("Adding the book named: "+book);
		this.books[total_books]=book;
		total_books++;
	}
	public void display(){
		System.out.println("The list of all available books in the library are: ");
		for(String element:this.books){
			if(element==null){
				continue;
			}
			System.out.println("* "+element);
		}
	}
	public void issueBook(String book){
		for(int i=0;i<this.books.length;i++){
			if(book.equals(this.books[i])){
				this.books[i]=null;
				System.out.println("The book "+"\""+book+"\""+" has been issued.");
				break;
			}
		}
	}
	public void returnBook(String book){
		for(int i=0;i<this.books.length;i++){
			if(books[i]==null){
				this.books[i]=book;
				System.out.println(book+" was returned");
				break;
			}
		}
	}
	
}

public class OnlineLibrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		obj.addBooks("Romeo and Juliet");
//		obj.addBooks("The story of my life.");
//		obj.addBooks("DSA");
//		obj.addBooks("Java");
//		obj.addBooks("Python");
//		obj.display();
//		obj.issueBook("Java");
//		obj.issueBook("DSA");
//		obj.display();
//		obj.returnBook("Java");
//		obj.returnBook("DSA");
//		obj.display();
		Library obj=new Library();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.println("Choices available:\n1. Add Book to the library.\n2. Display the list of available books.\n3. Issue the book.\n4. Return the book.\n5. Exit the program.");
			System.out.println("Enter your choice: ");
			int choice=sc.nextInt();
			sc.nextLine();
			switch(choice){
			case 1: System.out.println("Enter the name of the book to be added: ");
					String name=sc.nextLine();
					obj.addBooks(name);
					break;
			case 2: obj.display();
					break;
			case 3: System.out.println("Enter the name of the book to be issued: ");
					String alpha=sc.nextLine();
					obj.issueBook(alpha);
					break;
			case 4: System.out.println("Enter the name of the book to be returned: ");
					String beta=sc.nextLine();
					obj.returnBook(beta);
					break;
			case 5: System.out.println("Exiting the program...");
					System.exit(0);
					break;
			default:System.out.println("Wrong choice given!");
					System.out.println("Exiting the program.");
			}
		}

	}

}
