import java.util.Arrays;
import java.util.Scanner;

public class ArrayModify {

	public static void main(String[] args) {

		String[] foods= {"치킨","보쌈","피자","삼겹살"};
		System.out.println("수정 전 정보: "+Arrays.toString(foods));

		foods[1]="족발";
		foods[2]="파스타";//인덱스 번호를 알아야 수정 가능!
		System.out.println("수정 전 정보: "+Arrays.toString(foods));

		//배열에 저장되어있는 데이터의 인덱스 탐색.
		Scanner sc=new Scanner(System.in);
		System.out.print("#탐색할 음식명: ");
		String f=sc.nextLine();

		int idx;
		for(idx=0; idx<foods.length; idx++) {
			if(f.equals(foods[idx])) {
				break;
			}
		}
		if(idx==foods.length) {
			System.out.println("찾는 데이터가 없습니다");
		} else {
			System.out.println("탐색 완료! 인덱스: "+idx+"번");
			foods[idx]="떡볶이";
		}
		System.out.println(Arrays.toString(foods));
		sc.close();

	}//end main

}//end class
