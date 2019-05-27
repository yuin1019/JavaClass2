import java.util.Scanner;

public class SwitchQuiz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("직급을 입력하세요");
		System.out.println("[사원,대리,과장,차장,부장]");
		System.out.print("> ");
		String a=sc.next();
		
		
		switch(a) {
		case "사원": System.out.println(a+"의 급여는 150만원 입니다");
		break;
		case "대리": System.out.println(a+"의 급여는 300만원 입니다");
		break;
		case "과장": System.out.println(a+"의 급여는 450만원 입니다");
		break;
		case "차장": System.out.println(a+"의 급여는 600만원 입니다");
		break;
		case "부장": System.out.println(a+"의 급여는 750만원 입니다");
		break;
		default:System.out.println(a+"은(는) 없는 직급입니다.");
		System.out.println("직급을 다시 입력해주세요.");
		
		}
		sc.close();
	}

}
