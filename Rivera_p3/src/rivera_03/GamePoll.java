package rivera_03;

import java.util.Scanner;

public class GamePoll {
	
	public static void main(String[] args) {
		
		int i, j;
		int pollUser;
		String [] gameGenre = new String[5];//Array used to display game genres being polled//
		int [] [] userRating = new int[10] [5];//Max of 10 users for poll 5 row (genre) 10 column (users)//
		Scanner scnr = new Scanner(System.in);
		
		//Popular game genres//
		gameGenre[0] = "Role Playing Games";
		gameGenre[1] = "Real Time Strategy";
		gameGenre[2] = "First Person Shooter";
		gameGenre[3] = "Fighting Games";
		gameGenre[4] = "Racing Games";
		
		//Determines how many times to iterate the poll's questions//
		System.out.println("How many people will be taking the poll? (Max 10)");
		pollUser = scnr.nextInt();
		
		//Poll is given to each user with scores stored in userRating array//
		for (i = 0; i< pollUser; i++) {
			System.out.println("User " + (i+1));
			System.out.println("Rate each game genre from 1 (dislike) to 10 (like)\n");
			for(j = 0; j< 5; j++) {
				System.out.println(gameGenre[j] + ": ");
				userRating[i] [j] = scnr.nextInt();
			}
		}
		
		double genreSum = 0;//Used to gather the total score for each genre//
		double genreAverage;//Later used to calculate the average for each genre//
		double[] genreSumStored = new double[5];//array used to store genreSum before it is reset to use later for high and low point totals//
		
		for (i = 0; i< 5; i++) {
			System.out.print(gameGenre[i] + ": ");
			
			genreSum = 0;//genreSum reset to 0 at the start of each genre to prevent the count to carry over from previous genres//
			
			for(j = 0; j< pollUser; j++) {
				System.out.print(userRating[j] [i] + "\t");//i and j are swapped to make user ratings display down a row per genre// 
				
				genreSum+= userRating[j] [i];
			}
			genreSumStored[i] = genreSum;//genreSum stored in an array before being reset//
			genreAverage = genreSum/pollUser;//genreAverage calculated before being displayed and before genreSum is later reset//
			String formatAverage = String.format("%.2f", genreAverage);
			System.out.println("\tAverage: " + formatAverage);	
		}
		//Compare scores to determine which was the most liked//
				int k;
				if (genreSumStored[0] > genreSumStored[1]) {
					k = 0;
				}
				else {
					k = 1;
				}
				if (genreSumStored[2] > genreSumStored[k]) {
					k = 2;
				}
				if(genreSumStored[3] > genreSumStored[k]) {
					k = 3;
				}
				if(genreSumStored[4] > genreSumStored[k]) {
					k = 4;	
				}
				
				System.out.println(gameGenre[k]+ " was rated the most popular with a score of: " + genreSumStored[k]);
				
				//Compare scores to determine which was the least liked//
				if (genreSumStored[0] < genreSumStored[1]) {
					k = 0;
				}
				else {
					k = 1;
				}
				if (genreSumStored[2] < genreSumStored[k]) {
					k = 2;
				}
				if(genreSumStored[3] < genreSumStored[k]) {
					k = 3;
				}
				if(genreSumStored[4] < genreSumStored[k]) {
					k = 4;	
				}
				
				System.out.println(gameGenre[k]+ " was rated the least popular with a score of: " + genreSumStored[k]);

}
}
