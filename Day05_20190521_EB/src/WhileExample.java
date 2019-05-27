import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수x: ");
		int x=sc.nextInt();
		System.out.print("정수y: ");
		int y=sc.nextInt();
		
		sc.close();
		
		//1~10까지의 누적합을 구하는 로직
		int total=0;
		int n=x;
		//1. 제어변수 선언 :반복문의 루프횟수를 제어할 변수(begin)
		
		while(n<=y) {//2.조건식:반복문의 끝지점을 결정한다.(end)
			total+=n;
			n++;//3.증감식:반복문의 종료를 위해 제어변수의 값을 조정(step)
		}
		
		System.out.printf("%d~%d까지의 총합: %d\n",x,y,total);
		

	}

}
