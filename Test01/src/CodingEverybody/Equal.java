package CodingEverybody;

public class Equal {

	public static void main(String[] args) {
		System.out.println(1 == 2); //false
		// System.out.println(1=2); 이렇게 하면 1쪽에 빨간 밑줄이 그어지면서 왼쪽은 변수가 있어야한다고 나온다.
		System.out.println(1 == 1); //true
		
		System.out.println( 1 != 2); //true
		System.out.println( 1 != 1); //false
		
		String a = "hello world";
		String b = new String("hello world");
		
		System.out.println( a == b);
		System.out.println(a.equals(b));
	}

}
