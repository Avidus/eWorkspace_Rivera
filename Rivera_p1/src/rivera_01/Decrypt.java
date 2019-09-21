package rivera_01;

import java.util.Scanner;

public class Decrypt {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int passWord = 0;
		System.out.println ("Enter 4 digit password to decrypt:");
		passWord = scnr.nextInt();
		
		System.out.println ("Password to decrypt: " + passWord);
		
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		// Isolating the digits from the password//
		firstDigit = (passWord/1000);
		secondDigit = ((passWord/100)%10);
		thirdDigit = ((passWord/10)%10);
		fourthDigit = (passWord%10);
		
		//Displays the digits before decryption used to make sure digits were isolated//
		/*System.out.println("First digit is: " +firstDigit);
		System.out.println("Second digit is: " +secondDigit);
		System.out.println("Third digit is: " +thirdDigit);
		System.out.println("Fourth digit is: " +fourthDigit);*/
		
		int firstDecrypt;
		int secondDecrypt;
		int thirdDecrypt;
		int fourthDecrypt;
		
		//Decrypts the password//
		firstDecrypt = ((thirdDigit + (10 - 7))%10);
		secondDecrypt = ((fourthDigit + (10 - 7))%10);
		thirdDecrypt = ((firstDigit + (10 - 7))%10);
		fourthDecrypt = ((secondDigit + (10 -7))%10);
		
		System.out.println("The decrypted password is: " + firstDecrypt + secondDecrypt + thirdDecrypt + fourthDecrypt);
		
		
		
	}

}
