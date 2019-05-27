
public class FloatExample {

	public static void main(String[] args) {
		float f1=7.12345f; //4byte
		double d1=7.12345; //8byte
		System.out.println(f1);
		System.out.println(d1);
		
		System.out.println("-------------");
		
		float f2=1.234567891234f; //수용범위 초과할 경우 반올림해서 잘린다.
		double d2=1.234567891234; //실수 15자리 이상은 표현 못한다. 완벽한 실수 표현 힘듦.
		System.out.println(f2);
		System.out.println(d2);
		
		//int i=3.14;(x)
		double d=300; //실수 = 정수+소숫점 이하 이므로 수용가능
		System.out.println(d);
		
		
		
		

	}

}
