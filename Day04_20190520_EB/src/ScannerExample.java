
//1. Scanner api 로딩 (키보드 입력을 위한 문구들)
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		//2. 스캐너 객체 생성.
		Scanner sc=new Scanner(System.in);
		/*
		 3. Scanner의 함수들을 사용하여 데이터를 입력받는다.
		 - next(): 공백을 포함하지 않는 문자열을 입력
		 - nextLine(): 공백을 포함하는 문자열을 입력
		 - next+기본타입이름(): 해당 타입에 맞는 데이터를 입력.
		 ex) nextInt(), nextDouble(),... but char나 String은 없다.
		 */
		System.out.println("# 정보를 입력하세요!!");
		System.out.print("- 이름을 입력: ");
		String name=sc.next(); //입력 커서창을 띄어주고 프로그램 내로 들고와주는 역할까지 한다. 꼭 String에 담는다.
		
		System.out.print("- 나이를 입력: ");
		int age= sc.nextInt(); //자동으로 int형으로 가져온다. double은 nextDouble
		
		System.out.println("-------------------------");
		System.out.printf("내 이름은 %s이고, 나이는 %d세 입니다\n", name, age);
		
		//4. 스캐너 자원 반납 (메모리 관리 차원)
		sc.close();

	}

}
