package week1.day1;

public class IsPrime {
	public static void main(String[] args) {
		int number = 101;
		
		if (number==0 || number==1) {
			System.out.println("It is not a Prime number");
		}
		else if (number == 2){
			System.out.println("It is a prime number");
		}
			
		for(int n=2; n <number; n=n-1) {
			if (number % n==0) {
				System.out.println("It is not a Prime number");
				break;
			}
			else {
				System.out.println("It is a prime number");
				break;
			}
			
			
		}
		
	}

}
