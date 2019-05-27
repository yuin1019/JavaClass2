import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("점수: ");
		int point=sc.nextInt();
		switch(point/10) {
		case 10:
			if(point!=100) {
				System.out.println("점수를 잘못 입력했습니다");
				break;
			}
		case 9:System.out.println("A학점입니다");
			break; //switch블록을 나가라는 코드. 가끔은 코드를 흘러내려야하는 경우가 있어서 만듦.
		case 8:System.out.println("B학점입니다");
			break;
		case 7:System.out.println("C학점입니다");
			break;
		case 6:System.out.println("D학점입니다");
	
			break;
		default: 
			if(point<0||point>=100) {
				System.out.println("점수를 잘못 입력했습니다.");
			} else {
				System.out.println("F학점입니다.");	
			}
		}
		
		sc.close();

	}

}
