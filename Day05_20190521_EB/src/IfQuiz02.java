import java.util.Scanner;

public class IfQuiz02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수: ");
		int a=sc.nextInt();
		if(a==0) {
			System.out.println("입력하신 숫자는 0입니다");
		} else if(a%7==0) { //0 나누기 7도 0!!
			System.out.println("입력하신 숫자는 7의배수 입니다");
		} else {
			System.out.println("입력하신 숫자는 7의 배수가 아닙니다.");
		}
		sc.close();
		
	}

}
