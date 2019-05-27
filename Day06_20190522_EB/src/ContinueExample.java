import java.util.Scanner;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<11; i++) {
			if(i%2==0) continue;
			System.out.print(i+" ");
		}
		System.out.println("\n반복문 종료!");
		
		System.out.println("================================");
		
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("정수: ");
			int n=sc.nextInt();
			
			if(n==0) break;
			else if(n==1) continue;
			System.out.println("메롱메롱~~");
		}
		sc.close();
	}

}
