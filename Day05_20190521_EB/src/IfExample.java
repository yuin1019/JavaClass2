
public class IfExample {

	public static void main(String[] args) {
		
		//0~100까지의 정수 난수값 발생.
		int point=(int)(Math.random()*101);
		System.out.println("점수: "+point);
		
		if(point>=60) {
			System.out.println("합격!");
		} else {
			System.out.println("ㅇ ㄲㅈ~");
		}
		System.out.println("ㅅㄱ~");

	}

}
