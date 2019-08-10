package learn.java.access1;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public  class ArrayLearn {

	private static void arrayL() {
		List<Integer> arList = new ArrayList<>();
		ArrayList<Integer> arList1 = new ArrayList<>();
		Collection<Integer> arList2 = new ArrayList<Integer>();
	//	arList2.
		//arList1.ensureCapacity(50);
		//arList1.ensureCapacity
		//System.out.println(arList1.size());
		for(int i=1; i<100;++i) {
			arList.add(i);
		};

		System.out.println(arList);
		arList.addAll(arList1);
		System.out.println(arList.size());
	}
	
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayLearn.arrayL(); 
		//ArrayLearnarrayL();
	}
}
