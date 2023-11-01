package Array;

import java.util.Scanner;

//Prog for to find all pairs of elements in an array whose sum is equal to a specified number

public class SumOfArrayElements {

	public static void main(String[] args) {
		
		int arr[] = {11,34,56,23,9,13,4,8};
		
		System.out.print("Enter a number to check sum: ");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length-1; j++)
			{
				int result = arr[i]+arr[j];
				 if(result==num)
				 {
					 System.out.println(arr[i]+" and "+arr[j]);
				 }
			}
		}
	}
}
