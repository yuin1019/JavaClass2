
public class VariableExample {

	public static void main(String[] args) {
	/*
	 #변수(Variable)
	 1.변수는 데이터가 저장되는 공간에 이름을 붙여놓은 것입니다.
	 2.변수를 생성(선언)할 때는 변수에 저장되는 데이터와 크기와 모양에 따라
	      적당한 데이터 타입을 설정합니다.
	 ex) int : 4byte, 정수 저장 가능, String : 문자열(문장)
	 3. 변수는 동일한 이름으로 중복해서 선언할 수 없으며, 하나의 변수에는
	 하나의 데이터만 저장할 수 있습니다.
	 4. 변수에 저장된 값은 언제든지 변경할 수 있습니다.(변수 = 변경 가능한 수)	
	 */
	//변수의 선언 : [데이터 타입] [변수 이름];
		int score;
		// 변수의 초기화(값을 담는 행위) : [변수 이름] = [값];
		score=90; //score에 90을 담으라는 명령
		//변수의 참조(사용)
		System.out.println(score);
		//변수는 선언과 초기화를 동시에 할 수 있습니다.
		// 단 처음 선언 시 1회만 가능.
		int life=50;
		//변수의 값 변경 : [변수 이름] = [수정할 값];
		life=80;
		System.out.println(life);
		//변수에는 또 다른 변수의 값을 저장할 수도 있습니다.
		int tripleScore = score*3;
		System.out.println(tripleScore);
		
		score=score*5; // L-Value(공간 창조,space)=R-Value(값을 창조,value)
		System.out.println(score); //단독으로 사용 시 L-Value
		//변수의 자료형에 맞지 않는 데이터는 저장 불가능!
		// int age=23.5;(X)
		//String name=100;(X)
		String name = "홍길동";
		//변수는 데이터 타입이 다르더라도 동일한 이름으로 중복 선언 할 수 없음.	
		//int name=7500;(X)
		//선언 및 초기화 되지 않은 변수는 참조할 수 없다.
		int result;
		//result = score+number;
		//System.out.println(result);
		
		
	}

}
