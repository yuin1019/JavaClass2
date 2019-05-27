
public class EnhancedForLoop {

	public static void main(String[] args) {

		String[] week= {"월","화","수","목","금","토","일"};

		/*
		 for (int i = 0; i < week.length; i++) {
			System.out.println(week[i]+"요일");
		}*/
		for(String day:week) {//week이라는 배열에서 값을 하나씩 꺼내 day에 대입.
			System.out.println(day+"요일");//값만 필요할 때 사용
			//반복문의 종료시점은 week의 데이터를 모두 소진했을 때(배열의 길이만큼 반복)
		}//end for

		for(int n:new int[] {1,2,3,4}) {//객체 생성문도 가능하다.
			System.out.print(n+" ");
		}//end for
		System.out.println("\n-----------------------------");

		int[] scores= {98,71,85,67,100,95};
		int total=0;
		for(int A=0; A<scores.length; A++) {
			total+=scores[A];

		}
		double avg=(double)total/scores.length;
		System.out.printf("총점: %d점, 평균: %.2f점\n",total,avg);




	}//end main

}//end class
