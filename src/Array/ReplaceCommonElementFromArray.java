package Array;

// Array : - Replace common element from array to X

import java.util.Arrays;

public class ReplaceCommonElementFromArray {
	
	public static void main(String[] args) {
		int[] array1 = {1,2,3,4,5,6};
		int array2[] = {0,7,8,3,4,6};
		//int X=0;
		
		System.out.println("Array before replacement");
		System.out.println("Array1 : "+Arrays.toString(array1));
		System.out.println("Array2 : "+Arrays.toString(array2));
		System.out.println("Array after replacement");
		
		 for (int i = 0; i < array1.length; i++)
	        {
	            for (int j = 0; j < array2.length; j++)
	            {
	                if(array1[i] == (array2[j]))
	                {
	                  array1[i]=0;
	                	//System.out.println("Common element is : "+(array1[i]));
	                 
	                 //System.out.println(Arrays.toString(array1[i]));
	                 }
	            }
	            System.out.print((array1[i])+",");
	        }
	}

}
