import java.util.*;
public class doller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("원화를 입력하세요(단위 원)>> ");
		int won = s.nextInt();
		double doller = won/1100;
		System.out.print(doller + "달러");



	}

}
