package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int firstNum = 0, secNum = 1, sum = 0;
		System.out.println(firstNum);
		for (int i=1; i < 10; i=i+1) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
			
		}
		
	}

}
