
public class PrintExample {

	public static void main(String[] args) {
		String dog="멍멍이";
		String cat="야옹이";
		System.out.print(dog+"\n");
		System.out.println("메롱메롱+\n");
		System.out.print(cat+"\n");
		
		int month=7;
		int day=17;
		String anni="제헌절";
		System.out.println(month+"월 "+day+"일은 "+anni+"입니다.");
		System.out.printf("%d월 %d일은 %s입니다.\n", month, day, anni);
		/*
		 #문자열 포맷팅 함수 (printf)
		 1.포맷 서식문자를 사용해서 문자열을 조립.
		 - %d: 10진수 정수
		 - %f: 실수(소숫점 이하 6자리까지만 표현하도록 설정되어있다.)
		 - %c: 단일문자
		 - %s: 문자열
		 - 포맷팅 기호는 %를 보면서 찾아가기 때문에 바로 옆에 %를 붙이면 안된다.
		 특수기호 %를 표현하고 싶으면 %를 연속으로 두개 입력한다.
		 */
		double percentage=78.123456789;
		System.out.printf("백분율: %.2f%%\n", percentage);
		//몇자리 소숫점까지 보고싶을 떄 %.nf라고 적기. 반올림해서 표현된다. 6자리 이상히면 억지로 0을 붙여 표현한다.
	}

}
