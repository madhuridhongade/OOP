package Array;
// Prog to find common elements between two arrays and display the count

public class FindCommonELementsBetweenTwoArray {
	
	public static void main(String[] args) {
		
		int arr1[] = {23,11,45,67,91,78};
		int arr2[] = {61,84,23,33,11,56};
		
		System.out.print("Common elements between two arry is: ");
		 
		int count = 0;
		
		for(int i=0; i<arr1.length-1; i++)
		{
			for(int j=0; j<arr2.length-1; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.print(arr1[i]+",");
					count++;
				}
			}
		}
		System.out.println();
		System.out.print("Count is: "+count);
	}

}
