import java.util.Arrays;

public class ArrayBasic {

	public static void main(String[] args) {
		
		//1. 배열 변수의 선언.
		//int points[4];(X) 자바에서는 선언 시 크기 명시 불가.
		//int points[](O) 그러나 C style. 권장하지 않는다.
		int[] points; //points는 인트배열타입. 8byte.
		
		//2. 배열객체의 생성-실제값들을 저장할 공간 생성.
		points=new int[5]; //points가 안내해주는 곳은 20byte.
		System.out.println(points); //points의 주소가 출력된다. [I@15db9742
		
		//3. 배열의 초기화-배열 객체 내부에 실제 값을 저장.(index)
		points[0]=87;
		points[1]=95;
		points[2]=points[0];
		points[3]=(int)33.145;//크기가 다를 경우 같은 크기로 캐스팅하기
		points[4]=100;
		//points[5]=72;(X) 문제 없어 보이지만 크기를 초과해 에러가 뜬다.index범위 초과
		
		//4. 배열에 저장된 값 참조(사용)
		System.out.println("배열의 첫번째 데이터: "+points[0]);
		System.out.println("배열의 두번째 데이터: "+points[1]);
		System.out.println("배열의 세번째 데이터: "+points[2]);
		System.out.println("배열의 네번째 데이터: "+points[3]);
		System.out.println("배열의 다섯번째 데이터: "+points[4]);//point 연산은 자동으로 이루어진다.
		
		//5. 배열의 총 사이즈(길이) 확인.-배열변수명.length
		System.out.println("points배열의 길이: "+points.length);
		
		//6. 배열의 반복문 처리
		System.out.println("===================================");
		int total=0;
		for(int idx=0; idx<points.length; idx++) {//0번 인덱스부터 4번 인덱스까지 범위가 정해짐.
			total+=points[idx]; //points의 총합 구함.
		}
		System.out.println("총점: "+total);
		double average=(double)total/points.length; //숫자 대신 length를 쓰면 일일히 크기를 바꾸지 않아도 된다.
		System.out.println("평균: "+average);
		
		//7. 배열의 내부 요소 값(배열에 저장된 모든 값)을 문자열 형태로 한눈에 출력하기.
		System.out.println("=============================");
		System.out.println(Arrays.toString(points));
		
		//8. 배열의 선언과 생성을 동시에 처리.
		byte[] bArr=new byte[6];
		double[] dArr=new double[3];
		String[] sArr=new String[4];
		System.out.println("==============================");
		System.out.println(Arrays.toString(bArr));
		System.out.println(Arrays.toString(dArr));
		System.out.println(Arrays.toString(sArr));//각 기본값들이 나온다.
		
		//9. 배열의 선언과 생성, 초기화를 동시에 처리하는 방법.
		System.out.println("=================================");
		char[] letters=new char[] {'A','B','C','D'};
		System.out.println(Arrays.toString(letters));
		
		//선언과 동시에 초기화를 할 때만, 단 1회만 가능한 문법
		String[] names= {"김뽀삐","박삐삐","최뿌뿌"};//처음 변수 선언할 때만 가능
		System.out.println(Arrays.toString(names));
		
		names= new String[] {"김메롱","박메롱","최메롱","송메롱"};
		System.out.println(Arrays.toString(names));
		//그 외에는 new String[]같은 걸 써줘야 한다.
		
		
		
		
		
	}//end main

}//end class
