
public class CastingExample2 {

	public static void main(String[] args) {

		/*
		 - 크기가 큰 데이터를 작은 데이터 타입으로 변환하려면 반드시 형 변환 연산자 : (type)을 사용하여
		 명시적으로 형 변환을 해야한다 (Downcasting)
		 - 명시적 형 변환을 하는 이유는 Downcasting의 경우 저장 공간이 줄어들기 때문에 데이터 손실의
		 가능성이 있기 때문이다. (Overflow, Underflow)
		 */
		
		double d = 4.81234;
		int j = (int)d;
		System.out.println(j);//나머지는 싹 다 버려버린다.
		
		int i = 72;
		char c = (char)i;
		System.out.println("72 문자값 : "+c);
		
		int k = 1000;
		byte b = (byte)k;
		System.out.println(b);
		

	}

}
