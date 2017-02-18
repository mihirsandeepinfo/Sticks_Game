import java.util.Scanner;

public class Sticks {

	public static void main(String[] args){
		int noOfSticks = 21;
		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Would you like to go first");
		String decision = scan.nextLine();
		while(noOfSticks>0)
		{
			if(decision.equals("yes")){
				
				System.out.println("How many sticks do you want to remove (1/2)");
				int n = scan1.nextInt();
				noOfSticks -= n;
				if(noOfSticks<=0)
					System.out.println("You Lose");
				else{
					if((noOfSticks-2)%3==0 || noOfSticks-2==0)
						n = 1;
					else
						n=2;
					System.out.println("Computer took "+n+" sticks");
					noOfSticks -= n;
					if(noOfSticks<=0)
						System.out.println("You Win");
				}
					
			}
			System.out.println("There are "+ noOfSticks+ " left");
			int n;
			if((noOfSticks-2)%3==0 || noOfSticks-2==0)
				n = 1;
			else
				n=2;
			System.out.println("Computer took "+n+" sticks");
			noOfSticks -= n;
			if(noOfSticks<=0)
				System.out.println("You Win");
			else{
				System.out.println("There are "+ noOfSticks+ " left");
				System.out.println("How many sticks do you want to remove (1/2)");
				n = scan1.nextInt();
				noOfSticks -= n;
				if(noOfSticks<=0)
					System.out.println("You Lose");	
			}
								
		}
	}
}
