import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifyQuiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] people = {"영웅재중","최강창민","시아준수","믹키유천","유노윤호"};
		System.out.println("*변경 전 정보: "+Arrays.toString(people));
		System.out.println("- 수정할 멤버의 이름을 입력하세요");
		System.out.print("> ");
		String member=sc.nextLine();

		int idx;
		for(idx = 0; idx < people.length; idx++) {
			if(member.equals(people[idx])) {
				break;
			}	
		}
		if(idx == people.length) {
			System.out.println("찾는 데이터가 없습니다.");
		} else {
			System.out.println(member+"의 별명을 변경합니다");
			System.out.print("> ");
			String nickname=sc.nextLine();
			people[idx] = nickname;
			System.out.println("변경 완료!");
			System.out.println("* 변경 후 정보: "+Arrays.toString(people));
		}
		sc.close();
	}//end main

}//end class
