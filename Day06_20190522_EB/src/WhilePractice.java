
public class WhilePractice {

	public static void main(String[] args) {
		
		//48~150사이의 8의 배수를 가로로 출력하기.
		int i=48;
		while(i<=150) {
			System.out.print(i+" ");
			i+=8;
		}
		System.out.println("\ni의 값: "+i);//while이 끝난 변수를 사용할 일이 있다.
		
		//1~200사이의 12의 배수를 가로로 출력하기.
		int j=1;
		while(j<=200) {
			if(j%12==0) {
				System.out.print(j+" ");
				
			}
			j++;
		}
		System.out.println();//단순 줄개행
		
		//1~20000까지의 정수 중 248의 배수의 개수를 구하여 출력.
		int a=1;
		int count=0;
		while(a<=20000) {
			if(a%248==0) {
				count++;//종속코드 하나면 굳이 블록을 열지 않아도 된다.
			}
			a++;
		}
		System.out.println("1~20000사이의 248의 배수 갯수: "+count);
	}//end main

}//end class
