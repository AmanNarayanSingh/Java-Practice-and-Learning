package vowelCheck;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		byte flag=0;
		System.out.println("Enter the world to check that whether itstarts with vowel or not: ");
		char word=sc.next().charAt(0);
		switch(word){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': flag=1;
				  break;
		default:System.out.println("The word entered by you starts with a consonent.\n");
			
		}
		if(flag==1){
			System.out.println("Bingo! Word starts with a vowel and the vowel is '"+word+"'");
		}

	}

}
