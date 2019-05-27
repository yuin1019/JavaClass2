
public class ForExample {

	public static void main(String[] args) {

		int total=0;
		for(int n=1;n<=10;n++) {
			total+=n;
		}	System.out.println("1~10까지의 합: "+total);
		
		//48~150사이의 8의 배수를 가로로 출력하기.
		int i;
		for(i=48;i<=150;i+=8) {
			System.out.print(i+" ");
		}
		System.out.println("\ni의 값: "+i);//while이 끝난 변수를 사용할 일이 있다.

		//1~200사이의 12의 배수를 가로로 출력하기.
		int j;
		for(j=1; j<=200; j++) {
			if(j%12==0) {
				System.out.print(j+" ");

			}

		}
		System.out.println();//단순 줄개행

		//1~20000까지의 정수 중 248의 배수의 개수를 구하여 출력.
		int a;
		int count=0;
		for(a=1; a<=20000; a++) {
			if(a%248==0) {
				count++;//종속코드 하나면 굳이 블록을 열지 않아도 된다.
			}
		}
		System.out.println("1~20000사이의 248의 배수 갯수: "+count);
	}

}
