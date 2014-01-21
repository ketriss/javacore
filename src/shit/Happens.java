package shit;

public class Happens {

	String classMember = "cm";
	static String staticMember = "sm";
	
	void print(){
		
		String classMember = "cm2";
		System.out.println(classMember);
	}
	

	public static void main(String[] args) {
		b.Other o = new b.Other();
		

		System.out.println(o.member);
	}

}


class B extends b.Other{
	void  s(){
		System.out.println(b.Other.stMember);
		
	}
	
}