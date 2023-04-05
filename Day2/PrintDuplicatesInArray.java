package week1.day1;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int arrayLength = arr.length;
		System.out.println("The Lenght of array is " + arrayLength);
		
		int count;
		
		for(int i = 0; i < arrayLength-1; i++) {
			count=0;
			for(int j = i+1; j < arrayLength; j++) {
				if(arr[i]==arr[j]) {
					count++;
					System.out.println(arr[i]+" "+count);


				}
			}
		}
	}

}
