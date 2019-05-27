
public class TextualExample {

	public static void main(String[] args) {
		/*
		 # 단일문자를 저장하는 데이터 타입 char = 2byte
		 - 저장하고 싶은 문자를 홑따옴표 ('')에 담아 대입합니다.
		 */
		char c1='A';
		char c2=66; //이 경우 66에 해당하는 문자값을 가져다준다. UNICODE에 따라 0~65536까지 사용 가능
		System.out.println(c1);
		System.out.println(c2);
		//원래 UNICODE는 16진수 \\u+16진수 로 쓰면된다.
		
		char c3='\uAC00';
		System.out.println(c3);
		
		/*
		 #문자열을 저장할 수 있는 데이터 타입 String
		 -저장하고 싶은 문자열을 겹따옴표("")에 담아 대입한다.
		 -String은 기본데이터 타입은 아니지만 자주 쓰이기 때문에 기본타입처럼 사용한다.
		 */
		String s1="my dream "; //공백도 하나의 byte를 차지한다
		String s2="is a programmer";
		System.out.println(s1);
		System.out.println(s2);
		//자바에서는 문자열의 덧셈연산을 지원하고 있다.
		//연산결과로 문자열을 연결하여 결합한 결과가 도출된다.
		System.out.println(s1+s2);
		System.out.println(s1+s2+"메롱메롱");
		
		//문자열과 다른 데이터 타입의 +연산
		System.out.println("--------------------");
		System.out.println(100+200);
		System.out.println("100"+"200");
		System.out.println(100+"200");//이 경우 문자열이 아닌 애를 문자열화시킨다.
		System.out.println(10+20+"hello");//왼쪽부터 계산해 30+hello가 되므로 30hrllo가 나온다.
		System.out.println("hello"+10+20);//왼쪽부터 계산해 hello10+20되므로 hello1020이 된다.
		System.out.println("hello"+10*20);//숫자 계산식에 따라 곱하기를 먼저 계산한다.
		System.out.println("hi"+'A');
		

	}

}
