package CodingEverybody;

public class CharString {

	public static void main(String[] args) {
		//숫자
		System.out.println(1+2);	// 따옴표 없는 숫자는 숫자로 인식. 정수
		System.out.println(1.2 + 2.3); // 실수
		System.out.println(2*3);		// * 애스터리스크 곱하기
		System.out.println(6/3);		// 나누기 /
		
		//문자, 문자열
		
		System.out.println('생');	//Java에서는 문자는 ''작은 따옴표 안에 넣는다.
		System.out.println("생활코딩");	//문자열은 큰따옴표에 넣는데 만약 작은따옴표에 넣으면 에러가 발생한다.
		System.out.println("생");	// 문자 하나도 문자열이니 큰따옴표안에 넣어도 괜찮다.
		
		//문자열안에 " 넣고 싶을때. Java는 "을 문자열의 시작과 끝으로 인식. \" 이렇게 하면 "를 문자열로 인식.이스케이프 
		System.out.println("그녀가 말했다 \"너무 더워\""); // \역슬래시 뒤에 "는 문자열로 인식
		//여러줄로 출력하고 싶을 때 \n 사용 
		System.out.println("그녀가 \n말했다\n\"너무 더워\"");
		//문자열 연산
		System.out.println("생활코딩"+"입니다.");
		
	}

}
