// 26.10.29 수
package ex03;

class Member{
	// Field
	private String name;
	private String phone;
	
	// Constructor
	public Member() {
		
	}
	public Member(String name, String phone) {
		super();
		this.name = name;
		this.phone = phone;
	}
	
	// Getter / Setter
	public void getName() {
		return;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void getPhone() {
		return;
	}
	
	public void setPhone(String phone) {
		this.phone=phone;
	}
	
	
	// Method 
	public void info() {
		System.out.println("이름" + name + "전화: " + phone);
	}
}


public class TestMember {

	public static void main(String[] args) {
		Member m1 = new Member("손흥민", "010-1111-1111");
		Member m2 = new Member("안정환", "010-2222-2222");
		Member m3 = new Member("차범근", "010-3333-3333");
		
		m1.info();
		m2.info();
		m3.info();
		
		// 손흥민 이름, 전화 
		Member m = new Member("손흥민","010-1111-1111");
		System.out.println(m1==m);
		
		// 비교가능하게 만들어줘
		System.out.println(m1.equals(m));

	}

}
