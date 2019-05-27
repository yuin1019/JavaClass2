
public class RandomExample {

	public static void main(String[] args) {
		/*
		 # 난수(랜덤값)를 발생시키는 함수: Math.random()
		 -0.0이상 1.0미만의 랜덤실수(double)값을 가져온다. 
		 */
		double rn = Math.random();
		System.out.println("랜덤값: "+rn);
		System.out.printf("오늘 술을 마실까 말까??\n");
		String result=(rn>0.5)?"오지게 달린다!":"집에서 잔다.";
		System.out.println("결과: "+result);
		
		//1~6까지의 랜덤 정수 발생.
		/*
		 Math.random():0.0<=~<1.0
		 Math.random()*6:0.0<=~<6.0
		 -> (int)Math.random()*6:0<=~<6
		 */
		int ri=(int)(Math.random()*6)+1;
		System.out.println("정수랜덤값: "+ri);
			

		
		
	}

}
