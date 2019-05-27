
import java.util.Scanner;
public class ScannerQuiz02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("이름: ");
		String name=sc.next();
		System.out.print("나이: ");
		int age=sc.nextInt();
		System.out.println("------------------------");
		System.out.printf("이름: %s\n",name);
		System.out.println("출생년도: "+(2019-age+1)+"년생");
		sc.close();
		
		
		

	}

}
