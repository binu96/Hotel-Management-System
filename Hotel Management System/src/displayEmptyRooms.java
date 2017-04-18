
public class displayEmptyRooms {

	public displayEmptyRooms() {
		
		// initializing a for loop to navigate through the array
		for (int i = 0; i < 10; i++) {
			
			// checking whether the string values of the array is equal to "e"
			if (HotelRoomBooking.hotel[i].equals("e")) {
				
				// printing the values
				System.out.println("room " + i + " is empty.");
			}
		}
	}

}
