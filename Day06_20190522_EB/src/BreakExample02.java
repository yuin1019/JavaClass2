
public class BreakExample02 {

	public static void main(String[] args) {
		
		/*
		 #무한 루프
		 - 무한 루프는 반복문의 반복 횟수를 개발자가 사전에 정확하게 인지하지 못하는
		 상황에서 사용하며 특정 조건 하에서 반복문을 강제로 종료하는 형태로 구성합니다.
		 - 무한 루프는 일반적으로 while문을 사용하며 while의 조건식 자리에 논리 상수값 ture
		 를 쓰면 무한 루프를 구성할 수 있습니다.
		 - 몇바퀴 돌려야하는지 알면 for문이 더 깔끔하다.
		 */
		
		int i=0;
	//	boolean flag=true;
		while(true) {
			if(i==100) {
		//		flag=false;
				break;
			}
			System.out.println(i);
			i++;
		}
		

	}//end main

}// end class
