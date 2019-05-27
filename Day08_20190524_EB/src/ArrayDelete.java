import java.util.Arrays;

public class ArrayDelete {

	public static void main(String[] args) {

		int[] arr= {1,3,5,7,9,11,13};
		System.out.println("삭제 전: "+Arrays.toString(arr));

		/*
		 arr[2]=arr[3];
		 arr[3]=arr[4];
		 */

		for(int i=2; i<arr.length-1; i++)
			arr[i]=arr[i+1];
		
		int[] temp=new int[arr.length-1];
		for(int j=0; j<temp.length; j++)
			temp[j]=arr[j];
		arr=temp; temp=null;
		
		


		System.out.println("삭제 후: "+Arrays.toString(arr));

	}//end main

}//end class
