
public class BreakExample01 {
	public static void main(String[]args) {

		for(int i=1; i<11; i++) {
			if(i==5) {
				break; //강제 반복문 종료 코드
			}
			System.out.println(i+" ");
		}
		System.out.println("\n반복문 종료!");
		System.out.println("=================================");

		int i;
		for (i = 0; i < 3; i++) {
			for(int j=0; j<2; j++) {
				if(i==j)break;//직접적으로 소속된 반복문 블록만 나갈 수 있다.
				System.out.println(i+" "+j);

			}//end inner for
			if (i==1) break;

		}//end outer for
		System.out.println("i의 값: "+i);

		/*
		 # 내부 반복문에 포함된 break로 바깥쪽 반복문까지 한번에 종료시키려면 바깥쪽 반복문에
		 label을 붙인다.
		 */

		uCase: for(char upper='A'; upper<='Z'; upper++) {//int가 상위코드라 char도 잠시 int로 계산된다.
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper+"-"+lower);//출력은 문자값이므로 문자로 출력
				if(lower=='f') break uCase;
			}
		}

	}//end main

}//end class
