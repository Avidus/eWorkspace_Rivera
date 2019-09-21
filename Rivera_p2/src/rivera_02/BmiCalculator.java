package rivera_02;

import java.util.Scanner;

public class BmiCalculator {
	
	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		int measureOption = 0;
		
		//BMI Categories included in a single string to display later. Starts with an additional new line to space it from the user's BMI//
		String bmiCategories = ("\nBMI Categories: \nUnderweight = <18.5 \nNormal weight = 18.5-24.9 \nOverweight = 25-29.9 \nObesity = BMI >= 30");
		
		System.out.println("Welcome to the Body Mass Index (BMI) Calculator!");
		System.out.println("Type '1' for Imperial System or type '2' for Metric System: ");
		//Used to determine what BMI formula is used//
		measureOption = scnr.nextInt();
		
		//Formulas are separated by if statements and includes an error if directions aren't followed//
		if (measureOption == 1) {
			
			int poundWeight;
			int inchHeight;
			double impBmi;
			
			System.out.println("You have selected the Imperial System");
			System.out.println("Please enter your weight in pounds: ");
			poundWeight = scnr.nextInt();
			
			System.out.println("Please enter your height in inches: ");
			inchHeight = scnr.nextInt();
			
			//Calculates BMI with the Imperial Formula//
			impBmi = ((703 *poundWeight)/((double)inchHeight * inchHeight));//inchHeight converted to prevent rounding errors//
			String impBmiDouble = String.format("%.2f", impBmi); //used to format impBmi to only have two decimal places//
			
			System.out.println("Your BMI is: " + impBmiDouble);
			System.out.println(bmiCategories); //Displays the lengthy BMI category string//
		}
		
		//If statement for the Metric system formula//
		else if (measureOption == 2) {
			
			int kgramWeight;
			double meterHeight;//User is expected to input a decimal for meter height//
			double metBmi;
			
			System.out.println("You have selected the Metric System");
			System.out.println("Please enter your weight in kilograms: ");
			kgramWeight = scnr.nextInt();
			
			System.out.println("Please enter your height in meters: ");
			meterHeight = scnr.nextFloat();
			
			metBmi = ((kgramWeight)/(meterHeight * meterHeight));
			String metBmiDouble = String.format("%.2f", metBmi);
			
			System.out.println("Your BMI is: " + metBmiDouble);
			System.out.println(bmiCategories);
}
		//Else statement in case user does not follow directions//
		else {
			System.out.println("Invalid input \nUser did not select '1' or '2'");
		}
	}
}

