package learn.java.access1;

import java.util.ArrayDeque;
import java.util.ArrayList; 
import java.util.Deque; 
import java.util.Iterator; 
import java.util.List;

public class TicketReservation {

    private static final int CONFIRMEDLIST_LIMIT = 10;
    private static final int WAITINGLIST_LIMIT = 3;

    private List<Passenger> confirmedList = new ArrayList<>();
    private Deque<Passenger> waitingList = new ArrayDeque<>();

    

    // This getter is used only by the junit test case. 
    public List<Passenger> getConfirmedList() {
        return confirmedList;     
    }

    /**      
     * Returns true if passenger could be added into either confirmedList or      
     * waitingList. Passenger will be added to waitingList only if confirmedList      
     * is full.      
     *      
     * Return false if both passengerList & waitingList are full      
     */     
     public boolean bookFlight(String firstName, String lastName, int age, String gender, String travelClass, String confirmationNumber) {  
         Passenger passenger = new Passenger(firstName, lastName, age, gender, travelClass, confirmationNumber);
         
    	 if(confirmedList.size()<CONFIRMEDLIST_LIMIT ) {//|| waitingList.size()<=WAITINGLIST_LIMIT ) {
         confirmedList.add(passenger);
    	 System.out.println(confirmedList.get(0).getFirstName());
    	System.out.println("Passenger added\n" + confirmedList.size());
         return true;
         
         }
    	 else {
    	if (waitingList.size()<WAITINGLIST_LIMIT) {
    		waitingList.add(passenger);
       	System.out.println("Passenger wait\n" + waitingList.size());
    		return true;
		}
            	 
    		
		}
    	 return false;
         

    }

    /**      
     * Removes passenger with the given confirmationNumber. Passenger could be      
     * in either confirmedList or waitingList. The implementation to remove the      
     * passenger should go in removePassenger() method and removePassenger method      
     * will be tested separately by the uploaded test scripts.      
     
     * If passenger is in confirmedList, then after removing that passenger, the      
     * passenger at the front of waitingList (if not empty) must be moved into      
     * passengerList. Use poll() method (not remove()) to extract the passenger      
     * from waitingList.      
     */     
    public boolean cancel(String confirmationNumber) {
       
    	Iterator<Passenger> iterator = confirmedList.iterator();
    	Iterator<Passenger> wIterator = waitingList.iterator();
    	
    	
    	if (removePassenger(iterator, confirmationNumber)) {
    		
    		//
    		return true;
    	} else if (removePassenger(wIterator, confirmationNumber)) {
			
			return true;
		}
    	
			
		
    	
    	
           
            
            
        
    	
    	return false;
    	
    } 

    /**      
     * Removes passenger with the given confirmation number.      
     * Returns true only if passenger was present and removed. Otherwise, return false.      
     */     
    public boolean removePassenger(Iterator<Passenger> iterator, String confirmationNumber) {   
    	Iterator<Passenger> wIterator = waitingList.iterator();
    	while (iterator.hasNext()) {
    		Passenger passenger3 = iterator.next(); 
    		if(passenger3.getConfirmationNumber() != null && passenger3.getConfirmationNumber().contains(confirmationNumber)){
                confirmedList.remove(passenger3);
                System.out.println("Passenger POP\n" + waitingList.size());
                
                confirmedList.add( waitingList.poll());
                System.out.println("Passenger removed in List" +passenger3.getFirstName());

                return true;
         
           
    	
    		}  	


}
    	
			while (wIterator.hasNext()) {
				Passenger passenger4 = wIterator.next(); 
				System.out.println("Passenger removed in queu 0");
				if(passenger4.getConfirmationNumber() != null && passenger4.getConfirmationNumber().contains(confirmationNumber)){
					System.out.println("Passenger going to be removed in queu");
					
					System.out.println("Passenger removed in List" +passenger4.getFirstName());
					waitingList.remove(passenger4);

	                return true;
				
			
		}
	
}
    	return false;
}
}