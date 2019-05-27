
import java.util.Scanner;
public class ScanQuiz01 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**** 상품 재고 총액 구하기 ****");
		System.out.print("- 상품의 가격: ");
		int much=sc.nextInt();
		System.out.print("- 상품의 개수: ");
		int many=sc.nextInt();
		System.out.println("----------------------------------");
		System.out.printf("- 상품 재고 총액: "+(much*many)+"원");
		sc.close();

	}

}
