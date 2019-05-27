import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {

	public static void main(String[] args) {

		String[] TVXQ = {"영웅재중","최강창민","시아준수","믹키유천","유노운호"};
		Scanner sc=new Scanner(System.in);
		System.out.println("우리반 학생들의 별명: "+ Arrays.toString(TVXQ));
		System.out.println("- 삭제할 학생의 별명을 입력하세요!");
		System.out.print("> ");
		String member=sc.nextLine();
		int idx;
		for(idx = 0; idx < TVXQ.length; idx++) {
			if(member.equals(TVXQ[idx])) {
				break;
			}	
		}
		if(idx == TVXQ.length) {
			System.out.println("찾는 이름이 없습니다.");
		} else {
			for(int i=idx; i<TVXQ.length-1; i++)
				TVXQ[i] = TVXQ[i+1];
			String[] after = new String[TVXQ.length-1];
			for (int j = 0; j < after.length; j++)
				after[j] = TVXQ[j];
			TVXQ = after; after = null;
			System.out.println("* 삭제 후 정보: "+Arrays.toString(TVXQ));
		}
		sc.close();
	}
}
