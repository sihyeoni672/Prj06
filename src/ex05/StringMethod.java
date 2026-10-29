// 26.10.29 목
package ex05;
public class StringMethod {

	public static void main(String[] args) {
		System.out.println("문자열 갯수: " + "Hello".length());
		System.out.println("문자열 갯수: " + "안녕하세요".length());
		
		
		String str = "Java 프로그래밍";
		System.out.println("1위치의 글자: " + str.charAt(1));
		System.out.println("5위치의 글자: " + str.charAt(5));
		
		String str2 = "Hello world";
		System.out.println("" + str2.substring(0,4+1));

	}

}
