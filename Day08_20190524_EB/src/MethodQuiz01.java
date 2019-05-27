
public class MethodQuiz01 {
	
	static int calcDivisor(int x) {
		int total=0;
		System.out.print(x+"의 약수: ");
		for(int n=1; n<=x; n++) {
			
			if(x%n==0) {
				System.out.print(n+" ");
				total+=n;//나누어 떨어지면 약수이므로, 합계에 누적
			}
		}
		System.out.println();
		return total;
	}
	
	
	
	public static void main(String[] args) {
		
		System.out.println("10의 약수의 총합: "+calcDivisor(10));
		System.out.println("---------------------------------");
		System.out.println("30의 약수의 총합: "+calcDivisor(30));
		

	}//end main

}//end class
