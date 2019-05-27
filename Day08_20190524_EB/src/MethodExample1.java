
/*
 # 메서드(Method)
 1. 메서드는 코드의 모듈화 밑 재활용성을 높이기 위해 사용한다.
 2. 메서드는 선언하는 과정과 호출하는 과정으로 나누어진다.
 3. 메서드 선언은 메서드 내부에서는 불가능. 새로운 메서드의 선언은 반드시 메서드 블록 외부,
 클래스 블록 내부에서만 가능하다.(main 내부도 안된다.)
 4. 메서드 호출은 메서드나 생성자 블록에서만 가능하다. 클래스 블록 내부에서는 호출할 수 없다. (사용은 main 안쪽)
 5. 호출하는 과정은 메서드를 사용하는 과정이며 해당 메서드가 필요로 하는 데이터(매개값)를 메서드 내부로 전달하면서
 해당 메서드는 매개값을 통해 처리한 겨로가값을 호출부로 다시 반환해준다.
 6. 메서드는 호출하지 않으면 절대로 실행되지 않는다.
 */


public class MethodExample1 {
	
	//1.메서드의 선언
	static int calcTotal(int x){ //static은 메서드의 문법이 아니다!! 나중에 배울거.
		System.out.println("계산 시작!");
		int total=0;
		//System.out.println("반복문 시작!");
		for(int n=1; n<=x; n++)
			total+=n;
		//System.out.println("반복문 종료!");
		return total;//블록 밖에서도 변수를 유지하기 위해.
	}//end method
	

	public static void main(String[] args) {//메인은 자동으로 불려짐
		System.out.println("메서드 테스트!");
		//2. 메서드의 호출
		
		System.out.println(calcTotal(10));
		System.out.println(calcTotal(100));

		
		
		

	}//end main

}//end class
