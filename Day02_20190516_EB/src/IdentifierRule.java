
public class IdentifierRule {

	public static void main(String[] args) {
		// 꼭 지켜야하는 규칙(안 지키면 에러가 발생)
		 //1. 식별자 이름은 중복을 허용하지 않고 대,소문자를 구분함
		int age=30;
		int Age=32;
		System.out.println(age);
		System.out.println(Age);
		//2. 식별자 이름은 숫자로 지정하거나 숫자로 시작하면 안된다. 문자와 함께 작성하는 숫자는 괜찮음.
//		int 700=365; (X)
//		System.out.println(700);(X)
		int number7=7;
		int num7ber=7;
		//int 7number=7;(X)
		//3. 식별자 이름에 공백을 포함할 수 없다.
		//int my birthday=19951122;(X)
		int mybirthday=19951122;
		//4. 식별자 이름에 사용할 수 있는 특수문자는 밑줄(_), 달러기호($)만.but사용을 권장하지 않음.
		// String hello!!;(X)
		String $hello_;
		//5.키워드(예악어)는 식별자 이름으로 사용 불가능.
		//String class;
		String Class;
		//6.한글이나 한자같은 식별자 이름도 사용 가능하지만 권장하지는 않는다.
		int 숫자=100;
		String 名="박영희";
		System.out.println(숫자);
		System.out.println(名);
		/*
		 #Coding Convention(관례) - 지키지 않아도 에러가 나진 않음
		 1.클래스, 인터페이스 이름
		 - 명사와 형용사를 연결하여 짓는게 좋음.
		 - 첫글자는 대문자로 연결된 부분은 첫글자를 대문자로.
		 ex) Mycalculatorforhim -> MyCalculatorForHim
		 2.변수,함수 이름
		 - 변수는 명사적 느낌이 강하게, 함수는 동사적 느낌이 강하게
		 - 첫글자는 소문자로 연결된 부분은 첫글자를 대문자로
		 ex) int myBirthDay; processSocialService();
		 */
		
	}

}
