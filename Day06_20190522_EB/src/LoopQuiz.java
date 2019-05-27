import java.util.Scanner;

public class LoopQuiz {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int Correct=0;
		int Miss=0;

		while(true) {
			int rn01=(int)(Math.random()*100)+1;
			int rn02=(int)(Math.random()*100)+1;
			System.out.printf("%d+%d=?\n",rn01,rn02);
			System.out.print("> ");
			int Answer=sc.nextInt();
			if(Answer==rn01+rn02) {
				System.out.println("정답입니다!");
				Correct++;
			} else if (Answer==0) {
				break;
			} else if(Answer!=rn01+rn02) {
				System.out.println("틀렸습니다!!"); 
				Miss++;
			}

		}//end while
		System.out.println("===============================");
		System.out.println("정답횟수: "+Correct+"회");
		System.out.println("오답횟수: "+Miss+"회");
		sc.close();

	}//end main

}//end class
