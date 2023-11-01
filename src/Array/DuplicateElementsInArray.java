package Array;

// to find the duplicate elements in array

public class DuplicateElementsInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {11,12,13,11,23,34};
		
		System.out.print("Duplicate elements in given array is : ");
		
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length-1; j++ )
			{
				if(arr[i]==arr[j])
				{
					System.out.print(arr[i]);
				}
			}
		}
	}

}
