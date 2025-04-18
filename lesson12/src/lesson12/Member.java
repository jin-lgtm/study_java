package lesson12;

public class Member implements Cloneable{

	String name;
	String tel;
	
	Member(String name, String tel){
		this.name = name;
		this.tel = tel;
	}
	
	public String toString() {
		return "name : " + name + ", tel : "+ tel;
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj != null && obj instanceof Member
			&& ((Member)obj).tel.equals(this.tel);
	}
	
//	public Object clone() {    // 조상타입이라 아무 타입으로 바꿀수있음
	public Member clone() {
		Member member = null;
		try {
			member = (Member) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}
}
