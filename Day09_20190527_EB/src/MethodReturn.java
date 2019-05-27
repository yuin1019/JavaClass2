
/*
 #반환값, 반환유형(return value, return type)
 
 1. 반환값이란 메서드의 실행 결과값을 의미합니다.
 2. 매개변수는 여러 개 존재할 수 있지만 반환값은 언제나 오직 하나여야 한다.
 3. return 이라는 탈출 키워드를 통해 return 뒤에 전달할 값을 지정한다.
 4. 반환 되는 값의 데이터 타입을 반환 유형이라고 하며, 메서드를 선언할 때 메서드 이름 앞에 반드시 반환 유형을
 	꼭 명시해야 한다.
 5. **반환값이 있는 메서드는 호출문이 하나의 값으로 처리되기 때문에 반환값을 다른 변수에 대입할 수도 있고,
 다른 메서드의 매개값으로 사용할 수도 있습니다.**
 6. 모든 메서드가 반환값이 있는 것은 아니다. 메서드 실행 후에 반환할 값이 없다면 return을 사용하지 않아도
 	된다.
 7. 이 때는 반환 유형을 메서드 선언 시에 비워두면 안되고 반드시 void라는 키워드를 적어야 한다.
 8. 모든 메서드는 return을 만나면 강제로 메서드가 종료된다. 따라서 조건 없이 return 아래에
 	코드를 작성할 수 없다.
 */


public class MethodReturn {
	
	static int add(int n1, int n2) {
		System.out.println("메서드 add가 호출됨!");
		return n1+n2;
		//System.out.println("야야야야!!!"); return 밑에 있어 돌아가지 않을 코드.
	}//매서드 결과값을 메인 또는 어딘가에서 또 쓸 일이 있을 때 return
	//시킨 값을 내놓으라고 할 때.
	
	static void multi(int n1, int n2){ //return할 게 없다는 뜻
		int result=n1*n2;
		System.out.printf("%dx%d=%d\n",n1,n2,result);
	}//메서드 결과값을 메인 또는 어딘가에서 쓸 일이 없을 때는 굳이 return하지 않는다.
	//100% 성공할 거라는 전제 하에 사용한다.(할 일만 하고 끝내고 가버리는 것.)
	
	static void divide(int n1, int n2){
		if(n2==0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return; //void에서 탈출 하고 싶을 때 return을 단독으로 사용한다.
			//메서드 강제종료 코드.
		}
		int result=n1/n2;
		System.out.printf("%d/%d=%d\n",n1,n2,result);
	}

	public static void main(String[] args) {
		int result = add(12,13);//int result=25;
		System.out.println(result);
		System.out.println(add(15,7));//s.o.println(22);
		
		System.out.println("==================================");
		//int result=add(8,10);
		int result2 = add(add(4,add(2,2)), add(5,5));
		System.out.println(result2);
		
		System.out.println("=================================");
		multi(6,4);
		//int result3=multi(6,4); (X)
		//계산은 되어있는 상태이지만 그걸 가져오라고 한 적은 없기때문에 다른 변수로 사용할 수 없다.
		multi(add(5,5),add(2,2));
		//add(multi(3,3),multi(9,9));(X) add가 비어져있는 것과 다름없다.
		/*
		 - 반환값이 없는 void 타입의 메서드는 값이 돌아오지 않기 때문에 실행 결과를 변수에
		 저장하거나 메서드의 매개값으로 사용하면 안된다.
		 - 반드시 단독으로 호출하여 사용한다.
		 */
		divide(10,0); //0으로 나누면 안됨. (정상종료가 되지 않고 튕긴다.)
		System.out.println("프로그램 정상 종료!");
		
		int[] results=operateTotal(10,5);
		System.out.println(results[0]);
		System.out.println(results[1]);
		System.out.println(results[2]);
		System.out.println(results[3]);
		
		System.out.println(operateTotal(20,7)[2]);
		//한번에 20*7의 값을 불러오는 방법.
	}//end main
	
	static int[] operateTotal(int n1, int n2){
		int addResult=n1+n2;
		int subResult=n1-n2;
		int mulResult=n1*n2;
		int divResult=n1/n2;
		int[] arr= {addResult, subResult, mulResult, divResult};
		//대신 배열로 묶어 그 주소를 보내는 형식으로 가능.
		//한번만 쓸 변수는 변수이름을 붙이지말고 그 형식을 쓰는 게 더 효율적이다.
		//ex) (앞에 다 지우고) return new int[]{n1+n2,n1-n2,n1*n2,n1/n2};
		return arr;
//		return addResult;subResult, mulResult, divResult; 값은 하나만!
	}
	
	

}//end class
