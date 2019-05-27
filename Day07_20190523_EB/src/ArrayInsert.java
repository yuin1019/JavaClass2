import java.util.Scanner;

public class ArrayInsert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String[] names=new String[5];
		
		for(int i=0; i<names.length; i++) {
			System.out.print("# 이름: ");
			String name= sc.next();
			
			/*
			 -자바에서는 문자열 동등, 비동등 비교시에는 ==, != 연산자를 사용할 수 없다.
			 -비교문자열1.equals(비교문자열2)
			 */
			
			if(name.equals("그만")) {
				System.out.println("입력종료!");
				break;
			}
			
			names[i]=name;
			System.out.print("#입력된 이름들: ");
			for(String n:names) {
				if(n==null) break;
				System.out.print(n+" ");
			}
			
			System.out.println();
		}
		sc.close();
	}

}
