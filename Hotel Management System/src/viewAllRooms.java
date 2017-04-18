import javax.swing.JOptionPane;

public class viewAllRooms {

	public viewAllRooms() {

		try {// opening a try to catch the exceptions

			// initializing a for loop to navigate among the array
			for (int i = 0; i < 10; i++) {

				// chaecking whether the string values of the array is equal to
				// "e"
				if (HotelRoomBooking.hotel[i].equals("e")) {

					// printing the value
					System.out.println("room " + i + " is empty.");

				} else {

					// printing the value
					System.out.println("room " + i + " occupied by " + HotelRoomBooking.hotel[i] + ".");
				}
			}

		} catch (NullPointerException ex) { // catching the errors
			JOptionPane.showMessageDialog(null, "Values are null.");
		}
	}
}
