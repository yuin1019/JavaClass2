
public class PlusMinusOperator {

	public static void main(String[] args) {
		
		int i=1;
		int j=i++; //후위 연산 -> i가 j로 대입될 때 방해요소가 없어 먼저 대입 후 나중에 i가 올라간다.-> i=2, j=1
		System.out.println("i의 값은 "+i);
		System.out.println("j의 값은"+j);
		System.out.println("--------------------------");
		
		int x=1;
		int y =++x;//전위 연산 -> x가 y에게 대입될 때 방해요소 ++가 있어 올려진 후 y에게 대입된다.-> x=2, y=2
		System.out.println("x의 값은"+x);
		System.out.println("y의 값은"+y);
		//단독으로 쓰일 경우 앞에 붙든 뒤에 붙든 결과는 같다. ++ ->+1 -- ->-1
		
		

	}

}
