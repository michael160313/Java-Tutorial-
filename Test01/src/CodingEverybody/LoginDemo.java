package CodingEverybody;
import java.util.Scanner; // Scanner를 사용하기 위

public class LoginDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Michael";
		System.out.print("ID를 입력하시오 : ");
		
		Scanner sc = new Scanner(System.in); //Scanner객체를 생성해서 문자열 입력받는다.
		String b = sc.nextLine();
		
		if(b.equals(a))
			System.out.println("Correct");
		else
			System.out.println("Wrong");
		
	}

}
