import java.util.Arrays;

public class Array2D {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3};
		int[] arr2= {4,5,6};
		int[] arr3= {7,8,9};
		
		int[][] arr2D= {arr1,arr2,arr3,{10,11,12}};
		
		System.out.println(arr2);
		System.out.println(arr2D[1]);
		System.out.println(Arrays.toString(arr2D[1]));
		System.out.println("arr2D의 길이: "+arr2D.length);
		
		System.out.println(arr2D[1][2]);
		System.out.println(arr2D[3][1]);
		
		//빈 2차원 배열 만들기
		System.out.println("==============================");
		int[][] arr3by4 = new int[3][4]; //앞은 1차원배열의 갯수 뒤는 1차원배열에 있는 것들의 수
		
		arr3by4[1][2]=50;
		arr3by4[2][1]=70;
		
		for(int[] arr : arr3by4) {
			for(int n:arr) {
				System.out.printf("%-3d", n); //-3은 좌측 정렬
			}
			System.out.println();
		}
		
		int[][][] arr3D=new int[3][3][4];//2차원 배열의 갯수, 2차원 배열에 있는 1차원배열의 갯수, 1차원 배열에 있는 것들의 수
		//모든 자료구조의 기초.
		
		

	}

}
