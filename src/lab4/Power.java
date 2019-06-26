package lab4;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		Scanner scrn = new Scanner(System.in);

		String userInput;
		do {
			System.out.println("Enter an interger: ");
			int user1= scrn.nextInt();
			System.out.printf("%-10s| %-12s | %-10s\n", "Numbers", "Squared", "Cubed");

			for (int i = 1; i <= user1; i++) {
				int squared =  i * i;
				int cubed = i * i * i;
				System.out.printf("%-10d| %-12d | %-10d\n", i , squared, cubed);

			}

			System.out.println("continue? (y/n)");
			userInput = scrn.next();

		} while (userInput.equals("y"));

		System.out.println("Thanks for playing");

	}
}
/*public boolean nearHundred(int n) {
	  if(Math.abs(100-n)<=10 || Math.abs(200-n)<=10){
		    return true;
		  }else{
		    return false;
		  }
		}
*/