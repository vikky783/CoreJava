package learn.java.access2;

public class PassByValue {

	public void updateInfo(int siteId ) {
		System.out.println(siteId);
		siteId =100;
		System.out.println(siteId);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PassByValue pbv  = new PassByValue();
		int id = 10;
		pbv.updateInfo(id);
		System.out.println(id);
		
	}

}
