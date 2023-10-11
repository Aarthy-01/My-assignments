package week1.day2.homework;
//import java.util.Arrays;
public class FindInterjunction {

	public static void main(String[] args) {
		// Declare An array for {3,2,11,4,6,7};	 
		 //* b) Declare another array for {1,2,8,4,9,7};
		int num1[]= {3,2,11,4,6,7};
		int num2[]={1,2,8,4,9,7};
		int num1Len=num1.length;
		//int num2Len=num2.length;			
		//System.out.println( num1Len);
	for (int i = 0; i < num1Len; i++) {
			//System.out.println(num1[i]);
			for (int j = 0; j < num2.length; j++) {
				//System.out.println(num2[j]);
				if(num1[i]==num2[j]) {
					System.out.println(num1[i]);
				}
				
			}
			
		}
		
		
		

}
}