package week1.day2.homework;

public class PrimeNumber {

	public static void main(String[] args) {
		int number=12;
		int count = 0;
		if (number>1) {
			for (int i = 1; i <= number; i++) {
				
				if (number %i==0) {
					
					count++;
					
				}
				
				
				
			}
			if (count==2) {
				
				System.out.println(number+ " is a prime number");
			}
			
			else {
				
				System.out.println(number+ " is a not prime number");
			}
			
			
		}
	}
	}			
						