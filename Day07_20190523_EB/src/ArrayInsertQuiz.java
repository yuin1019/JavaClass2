import java.util.Scanner;

public class ArrayInsertQuiz {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("#먹고 싶은 음식을 입력하세요!");
		System.out.println("#입력을 중지하려면 <그만>이라고 입력하세요");
		String[] foods=new String[100];

		for(int i=0; i<foods.length; i++) {
			System.out.print("> ");
			String food=sc.next();

			if(food.equals("그만")) {
				System.out.println("입력종료!");
				break;
			}
			foods[i]=food;
		}
		System.out.println("내가 먹고싶은 음식들: ");
		for(String end:foods) {
			if(end==null) break;
			System.out.print(end+" ");
			
		}


	}

}
