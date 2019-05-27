
public class MethodExample2 {

	/*
	 # 매개 변수(argument, parameter)
	 1. 매개 변수는 메서드를 호출할 때 메서드 실행헤 필요한 값들을
	 호출부에서 메서드 내부로 전달하기 위한 매개체
	 2. 메서드 호출부에서 어떤 매개값을 전달하느냐에 따라 메서드의 실행 결과가 달라진다.
	 3. 매개값을 몇 개 전달받아 사용할지는 메서드를 선언할 때 선언부에서 ()안에 미리 개수와 타입을
	 지정해야한다.
	 4. 매개변수는 하나도 선언하지 않을 수 있으며 이 때는 메서드 선언부의 ()내부를 비워둔다.
	 그리고 호출 시에도 ()를 비워서 호출한다.
	 */
	
	static String selectRandomFood() {
		double rn = Math.random();
		if(rn>0.66)
			return"치킨";
		else if(rn>0.33)
			return"족발";
		else
			return"파스타";
	}


	public static void main(String[] args) {
		
		int result = calcRangeTotal(4, 7);
		System.out.println(result);
		
		System.out.println(selectRandomFood());
		
		//정수 n개를 전달하면 정수 n개의 총합을 리턴하는 메서드->배열사용
		int[] arr= {10,20,30};
		int sum1= calcNumbersTotal(arr);
		System.out.println("sum1: "+sum1);
		
		int sum2=calcNumbersTotal(new int[] {5,8,12});
		//생성이 아니라 선언이라 타입을 써줘야한다
		System.out.println("sum2: "+sum2);


	}//end main
	
	static int calcNumbersTotal(int[] nums){
		int total=0;
		for(int n:nums)
			total+=n;
		return total;
	}

	static int calcRangeTotal(int x, int y) {
		int total=0;
		for(int n=x; n<=y; n++)
			total+=n;
				
		return total;
	}



}//end class
