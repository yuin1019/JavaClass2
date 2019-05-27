
public class ForQuiz {

	public static void main(String[] args) {
		
		int rn= (int)(Math.random()*8)+2;
		System.out.printf("랜덤 구구단 %d단\n",rn);
		System.out.println("-----------------------");
		int a;
		for(a=1; a<10; a++) {
			System.out.printf("%dX%d=%d\n",rn,a,rn*a);
			
		}

	}

}
