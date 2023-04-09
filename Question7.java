import java.util.*;
public class Question7 {
	public static void main(String[] args ) {
		// Assign the variable of lottery
		int lottery = (int)(Math.random() * 100); 
		
		Scanner myNum = new Scanner(System.in); 
		
		System.out.print("Please enter your lottery pick (two-digit number): ");
		int number = myNum.nextInt();
		System.out.println(lottery);
		
		// Assign the ones and tens place of the number of the lottery
		int number_ones = lottery % 10;
		int number_tens = lottery/10; 
		
		
		// Assign the ones and tens place of the number that the user entered
		int matchNum1 = number/10; 
		int matchNum2=number%10; 
		
		// If the number that the user entered is equal to the number of the lottery, then they won $10,000
		if (number == lottery) {
			System.out.println("Congratulations, you match the lottery number exactly. You won $10,000");
		}
		// If the number that the user entered match both digits but not in order (that is, the tens of the entered number is equal to the ones of the lottery number and vice versa, then they won $3,000
		else if (number_ones == matchNum2 && number_tens == matchNum1) {
			System.out.println("Your number match both lottery number but not in order. You won $3,000");
		}
		
		// If the entered number match one digit of the lottery number, they won $1,000
		else if (number_ones == matchNum1 || number_tens == matchNum2 || number_ones == matchNum2 || number_tens == matchNum1) {
			System.out.println("Your number match one of the digits in the lottery number. You won $1,000"); 
		}
		// Otherwise, they lost
		else {
			System.out.println("Sorry, you lost");
		}
	}
}
