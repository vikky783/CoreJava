package learn.java.access2;

import learn.java.access1.A1;

 public class C2 extends A1 {
	public static void main(String[] args) {
		//System.out.println("privateMember: " + privateMember);
		//System.out.println("defaultMember: " + defaultMember);
		System.out.println("protectedMember: " + protectedMember);
		System.out.println("publicMember: " + publicMember);
		//I made a change
	}
}