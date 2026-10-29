//26.10.29 목

package ex02;

class Member{

	// Fields
	private String name;
	private String email;

	// Constructor
	// 기본 생성자 : NoArgsCOnstructor
	public Member() {
		
	}
	// 모든 인자가 있는 생성자 :@AllArgsConstructor
	public Member(String name, String email) {
		super();
		this.name =name;
		this.email=email;
	}

	//Getter / Setter
	public void setEmail(String email) {
		this.email =email;
	}

	// method
	public void info() {
		System.out.println("이름: " + name + ",이메일: "+ email);
	}
}


public class TestMember {
	public static void main(String[] args) {

		Member m1 = new Member("박찬호","park@gmail.com");
		// m1.name
		m1.info();

		Member m2 = new Member("류현진", null);
		m2.info();
		m2.setEmail("Ryu@gmail.com");
		m2.info();
	}
}