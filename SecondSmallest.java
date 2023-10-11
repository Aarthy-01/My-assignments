package week1.day2.homework;

import java.util.Arrays;

public class SecondSmallest {

	public static void main(String[] args) {
		int input[]={23,45,67,32,89,22 };
		int len= input.length;
		
				//System.out.println(len);
		Arrays.sort(input);
		System.out.println(input[len-2]);
		
		
	}

}
