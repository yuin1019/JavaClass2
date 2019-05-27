
public class MethodQuiz {

	static double[] calcArrayTotal(int... nums){//인트 기타등등... 자동 배열처리
		int total=0;
		for(int n:nums) total+=n;
		return new double[] {total, (double)total/nums.length};

	}

	public static void main(String[] args) {
		System.out.println("--------------------------");
		int[] numbers= {57,89,78,91,93,47};
		double[] arrTotAvg= calcArrayTotal(numbers);
		System.out.printf("총점: %d점, 평균: %.2f점\n",
				(int)arrTotAvg[0],arrTotAvg[1]);
		
		//double[] arr2 = calcArrayTotal(new int[]{1,2,3,4});
		double[] arr2 = calcArrayTotal(1,2,3,4);
		System.out.printf("총점: %d점, 평균 %.2f점",
				(int)arr2[0], arr2[1]);
		
		

	}//end main

}//end class
