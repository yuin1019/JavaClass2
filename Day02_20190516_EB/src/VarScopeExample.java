
public class VarScopeExample {

	public static void main(String[] args) {
		/*
		 #변수의 사용 범위
		 - 변수는 선언된 블록을 빠져나가는 순간 메모리에서 자동으로 제거됩니다.
		 - 따라서 선언된 블록 내부에서만 변수를 참조할 수 있습니다.
		 */
		//같은 데이터 타입의 변수를 선언할 때는 콤마로 나열 가능.
		int num1=10, num2=20;
		if(true) {
			int num3 = num1+num2;
		}//end if
		//int num4=num3*8;
		int num3=100;
		
	}//end main
	//int num4=num1+num2+num3;
} //end class
