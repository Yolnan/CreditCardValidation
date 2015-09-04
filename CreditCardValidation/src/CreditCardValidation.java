import java.util.Scanner;
import java.util.Random;
public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner inpudding  = new Scanner(System.in);
		int i = 15;
		long creditNum;
		int numList [] = new int[16];
	    //Get credit card number 
		System.out.println("Give me your credit card number, or else...");
		creditNum = inpudding.nextLong();
		while(creditNum > 0) {
			numList[i] = (int)(creditNum%10);
			creditNum /= 10;
			i--;
		}

		//Checking Validation
		int sum = 0;
		for(i = 0; i < 16; i++) {
			if(i%2 == 0) {
				numList[i] *= 2;
				if(numList[i] >= 10) {
					numList[i] = numList[i]%10 + 1;
				}
			}
			sum += numList[i];
		}
		if(sum%10 == 0) {
			System.out.println("Your credit card number is valid");		
		} else {
			System.out.println("Your credit card number is not valid");
		}
		
		//Generate 100 Valid Credit Cards
		Random randomNum = new Random();
		long tempNum;
		int count = 0;
		while(count < 100) {
			creditNum = randomNum.nextLong();
	        creditNum = Math.abs(creditNum);
	        tempNum = creditNum;
	        i = 15;
	        if(creditNum >= 1000000000000000L && creditNum < 10000000000000000L) {
	        	while(tempNum > 0) {
	    			numList[i] = (int)(tempNum%10);
	    			tempNum /= 10;
	    			i--;
	    		}
	        	
	        	for(i = 0; i < 16; i++) {
	    			if(i%2 == 0) {
	    				numList[i] *= 2;
	    				if(numList[i] >= 10) {
	    					numList[i] = numList[i]%10 + 1;
	    				}
	    			}
	    			sum += numList[i];
	    		}
	        	
	    		if(sum%10 == 0) {
	    			count++;
	    			System.out.println("Valid credit card #" + count + " " + creditNum);
	    		}
	        }
		}
	}	
}
