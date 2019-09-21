package rivera_01;

import java.util.Scanner;

public class Encrypt {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int passWord = 0;
		System.out.println ("Enter 4 digit password to encrypt:");
		passWord = scnr.nextInt();
		
		System.out.println ("Password to encrypt: " + passWord);
		
		int firstDigit;
		int secondDigit;
		int thirdDigit;
		int fourthDigit;
		
		// Isolating the digits from the password//
		firstDigit = (passWord/1000);
		secondDigit = ((passWord/100)%10);
		thirdDigit = ((passWord/10)%10);
		fourthDigit = (passWord%10);
		
		//Displays the digits before encryption used to make sure digits were isolated//
		/*System.out.println("First digit is: " +firstDigit);
		System.out.println("Second digit is: " +secondDigit);
		System.out.println("Third digit is: " +thirdDigit);
		System.out.println("Fourth digit is: " +fourthDigit);*/
		
		int firstEncrypt;
		int secondEncrypt;
		int thirdEncrypt;
		int fourthEncrypt;
		
		//Encrypts the password//
		firstEncrypt = ((thirdDigit + 7)%10);
		secondEncrypt = ((fourthDigit + 7)%10);
		thirdEncrypt = ((firstDigit + 7)%10);
		fourthEncrypt = ((secondDigit + 7)%10);
		
		System.out.println("The encrypted password is: " + firstEncrypt + secondEncrypt + thirdEncrypt + fourthEncrypt);
		
		
		
	}

}
