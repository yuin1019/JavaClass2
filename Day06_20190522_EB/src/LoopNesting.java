
public class LoopNesting {

	public static void main(String[] args) {

		for(int dan=2; dan<10; dan++) {
			System.out.printf("\n구구단",dan,"단");
			System.out.println("-----------------------");
			int a;
			for(a=1; a<10; a++) {
				System.out.printf("%dX%d=%d\n",dan,a,dan*a);
			}

		}

	}

}
