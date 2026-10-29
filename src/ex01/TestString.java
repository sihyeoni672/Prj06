package ex01;

public class TestString {

	public static void main(String[] args) {
		String name1 = "이순신";
		String name2 = " 이순신";
		String name3 = new String("이순신");
		String name4 = new String ("이순신");
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		System.out.println(name4);
		
		
		// 주소비교
		// 같은 이름 인가 -> 틀린표현 : 문자열 비교는 == 사용 금지
		if(name1==name2)
			System.out.println("같은 이름");
		else System.out.println("다른 이름");
		
		if(name3==name4)
			System.out.println("같은 이름");
		else System.out.println("다른 이름");
		
		
		// data 비교 -> 정상적인 문자열 비교
		if(name1 .equals(name2))
			System.out.println("같은 이름");
		else System.out.println("다른 이름");
		
		if(name3.equals(name4))
			System.out.println("같은 이름");
		else System.out.println("다른 이름");

	}

}
