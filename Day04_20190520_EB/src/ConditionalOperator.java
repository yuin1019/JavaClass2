import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("얼마 있어요??");
		int money=sc.nextInt();
		String food;
		food=(money>=5000)?"육개장":(money<=2500)?"굶자":"라면";
		System.out.println("선택된 음식: "+food);
		sc.close();
		//항에 또 3항식을 넣는 게 가능.
		
		//헐 신세계

	}

}
