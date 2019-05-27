
public class AssignmentOperator {

	public static void main(String[] args) {
		
		/*
		 #대입 연산자(=,+=,-=,*=,...)
		 - 변수에 값을 대입할 때 사용하는 연산자입니다.
		 		
		 */
		int a=5, b= 5;
		System.out.println(a+3);
		a+=3; //a=a+3;과 같은 뜻
		a-=5;
		a*=7;
		a/=4; //5.02 -> int는 정수이므로 5.
		a%=3; // a에서 3을 나눈 나머지를 대입. -> 2
		System.out.println("a의 값: "+a);
		b=+4; //저건 b는 양수 4라는 뜻. 그러니까 =는 무조건 오른쪽에 쓰자!!!
		System.out.println("b의 값: "+b);
		
		System.out.println("==============================");
		
		int c=3;
		//c+=1; // c= c+1; 항상 변수 선언 먼저 하기
		c++; //c+=1;은 컴퓨터가 연산을 두번 하지만 c++;은 1번 한다. 그래서 ++가 훨씬 빠르다.
		//만약 1만 올리거나 내릴때는 -=,+=보다 --,++이 좋다.
		System.out.println("c: "+c);
		
		
		
		
	}

}
