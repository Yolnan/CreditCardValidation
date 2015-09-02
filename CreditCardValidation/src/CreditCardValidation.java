import java.util.Scanner;
public class CreditCardValidation {

	public static void main(String[] args) {
		Scanner inpudding  = new Scanner(System.in);
		int i = 15;
		long creditNum;
		long numList [] = new long[16];
	    //Get credit card number
		System.out.println("Give me your credit card number, or else...");
		creditNum = inpudding.nextLong();
		while(creditNum >= 0) {
			numList[i] = creditNum%10;
			creditNum /= 10;
			i--;
		}
		for(long a: numList) {
			System.out.println(a);
		}
	}

}
