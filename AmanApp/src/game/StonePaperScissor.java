package game;
import java.util.Random;
import java.util.Scanner;
//import java.util.stream.IntStream;

public class StonePaperScissor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Starting the game of stone, paper and scissor... ");
		System.out.println("Choices available:\n1. Stone \n2. Paper\n3. Scissor ");
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int i=0;
		int human=0,comp=0;
		while(i<5){
			int rand=random.nextInt(3)+1;
			
			System.out.println("Please enter your choice : ");
			int choice=sc.nextInt();
			sc.nextLine();
			
			if (choice==rand){
				System.out.println("Tie! Play again");
			}
			else if((rand==1 && choice==2) || (rand==2 && choice==3) || (rand==3 && choice==1)){
				System.out.println("You won this round.");
				human+=1;
			}
			else if((rand==1 && choice==3) || (rand==2 && choice==1) || (rand==3 && choice==2)){
				System.out.println("Computer won this round!");
				comp+=1;
			}
			i++;
		}
		if(human>comp){
			System.out.println("Congratulations! You won the game.");
		}
		else if(human==comp){
			System.out.println("It's a tie.");
		}
		else{
			System.out.println("Computer won the game!");
		}
		
		
	}

}
