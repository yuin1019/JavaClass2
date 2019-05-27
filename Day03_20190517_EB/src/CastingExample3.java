
public class CastingExample3 {

	public static void main(String[] args) {
		
		char c='B';
		int i=2;
		System.out.println(c+i); //타입이 다른 경우의 연산은 작은 쪽을 큰 쪽에 맞춘다. char c -> int c
		
		int intResult=c+i;
		char charResult=(char)(c+i);
		System.out.println(intResult);
		System.out.println(charResult);
		
		int k=10;
		double d=k/4;//int 나누기 int의 결과값은 int -> int는 소숫점 허용 못함 -> 2.5인 결과가 2가 됨.
		System.out.println(d);
		
		int k2=10;
		double d2 = (double)k2/4; //or double d2=k2/4.0; (int 범위인 4를 double 범위인 4.0으로 표기)
		System.out.println(d2);
		
		byte b1=100;
		byte b2=70;
		//byte b3=b1+b2;
		//계산 결과가 byte의 범위를 넘어서므로 int로 해줘야한다. 혹여 결과값이 byte 이내라고 해도 안전을 위해 int로 하라고 한다.
		int b3=b1+b2;
		System.out.println(b3);
		/*
		 - int 보다 작은 크기의 데이터 (byte,short,char)의 연산은 자동으로 결과값이 int로 변환되어 처리된다
		 (오버플로우 방지)
		 */
		

		
	}

}
