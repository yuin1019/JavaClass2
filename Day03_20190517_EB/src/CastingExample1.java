
public class CastingExample1 {

	public static void main(String[] args) {
		
		/*
		 -크기가 작은 데이터를 큰 데이터 타입으로 변환할 떄는 자바 가상머신(JVM)이 자동으로
		 타입을 올려셔 변환한다.(Promotion, Upcasting)
		 */
		
		byte b=10;
		int i=b;//작은 타입을 큰 타입에 넣을 때는 자동으로 변환. byte b-> int b로 자동 형변환.
		
		char c='가';
		int j=c;//char ->int로 자동 형변환
		System.out.println("가의 유니코드 정수값"+j);
		
		int k =500;
		double d=k; //int->double
		System.out.println(d);
		
				
		
		
		

	}

}
