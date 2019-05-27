
public class LogicalOperator {

	public static void main(String[] args) {
		/*
		 # 논리 연산자(&, &&, |, ||)
		 1.좌항과 우항의 논리값을 연산하는 연산자.
		 - &,&&: 양쪽 항의 논리값이 모두 true일 경우에만 전체 결과를 true를 도출.
		 - |,||: 양쪽 항 중에 한쪽만 true여도 전체 결과를 true로 도출
		 2. 단축 평가 (short circuit: &&,||)
		 : 좌항에서 전체 논리연산결과가 판명날 경우 우항의 연산을 무시한다.
		 */
		
		int x=10,y=20;
		System.out.println((x!=10)&&(++y==21));
		System.out.println((x==10)||(++y==21));
		System.out.println("x: "+x+", y: "+y);
		
		// 논리 반전 연산자 (!: 단항)
		//논리값을 반전시킨다 true->false, false->true)
		System.out.println("-------------------------");
		int z=10;
		System.out.println(z==10);
		System.out.println(!(z==10));
		
		System.out.println(z>15);
		System.out.println(!(z>15));
		
		
	}

}
