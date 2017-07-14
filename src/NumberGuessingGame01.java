import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame01 {
	public static void main(String[] args){
		
		// Initialize Scanner Object
		Scanner in  = new Scanner(System.in);
		// Initialize random object
		Random random = new Random();
		// maximum possible number
		int max = 10;
		//minimum possible number
		int min =1;
		int randomNum = random.nextInt(max - min + 1 ) + min;
		/*variable that will hold the value of the user guess 
		 * initialize as 100 , since 100 is not a possible answer/option
		*/
		int answer =100;
		
		System.out.println("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!" +
		 " press zero\"0\" to quit");
		
		while(answer != 0){
			System.out.print("\nI\"M THKING OF A NBR FROM 1-10.  TRY 2 GESS!");
			answer = in.nextInt();
			
			// For wrong guess
			if( answer != randomNum) {
				System.out.println("\nW00T!  U SUX0R!!!  I PWN J00!!!  IT WAS" + randomNum + "!\n");
			}else{// For correct guess
				System.out.println("\nLOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS" + randomNum + "!\n");
			}
		}
		
		
	}
}
