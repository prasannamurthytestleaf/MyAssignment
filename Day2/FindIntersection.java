package week1.day1;

public class FindIntersection {



	public static void main(String[] args) {

		int[] arrayOne = {3,2,11,4,6,7};
		int[] arrayTwo = {1,2,8,4,9,7,};

		for(int i=0;i < arrayOne.length; i++ ) {
			for(int t=0; t < arrayOne.length; t++ ) {
				if (arrayOne[i]==arrayTwo[t]) {
					System.out.println(arrayOne[i]);
				}else {
					continue;
				}
			}
		}
	}
}

