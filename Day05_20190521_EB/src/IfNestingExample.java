import java.util.Scanner;

public class IfNestingExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("신장: ");
		double height=sc.nextDouble();
		
		if(height>=140) {
			System.out.print("나이: ");
			int age=sc.nextInt();
			if(age>=8) {
				System.out.println("놀이기구를 탈 수 있습니다.");
			} else if(age>=6) {
				System.out.println("보호자 동반 시 탑승 가능");}
				else {
				System.out.println("나이가 안 돼서 탈 수 없습니다.");
			}
		} else {
			System.out.println("키가 안 돼서 타지 못합니다.");
		}
		
		sc.close();

	}

}
