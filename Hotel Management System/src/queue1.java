import javax.swing.JOptionPane;

public class queue1 {

	// inizializing two variables and one string array to the queue
	int roomNum;
	String roomName;
	static String[] que = new String[7];

	// creating getters to the above variables
	public int getRoomNum() {
		return roomNum;
	}

	public String getRoomName() {
		return roomName;
	}

	public String[] getQue() {
		return que;
	}

	// creating a method to add to the queue
	public void addQueue(int roomNum, String roomName) {

		try {// using a try to catch all the exceptions

			// checking whether the 6th element of que array is equal to "e"
			if (que[6].equals("e")) {

				// creating a for loop navigate through the array
				for (int i = 0; i < 7; i++) {

					// checking whether the que array is empty
					if (que[i].equals("e")) {

						// adding the values
						que[i] = roomNum + " " + roomName;

						break;

					}
				}

			} else {

				// initializing the que array
				initialize(que);
				// adding the first value
				que[1] = roomNum + " " + roomName;
			}

		} catch (NullPointerException ex) {// catching all the errors
			System.err.println("Values are NULL!!");

		} catch (IndexOutOfBoundsException e) {// catching all the errors
			System.err.println("");
		}

	}

	public void deleteQueue() {

		try { // creating a try to catch the errors

			for (int i = 0; i < 7; i++) {

				// chaecking whether the string values of the array is equal to
				// "e"
				if (!(que[i].equals("e"))) {

					// creating a array to split the words by space
					String[] token = que[i].split("\\s+");

					// assigning those splitted elements into array
					String roomNum = token[0];
					String roomName = token[1];

					// checking the index of deleted customer with the queue
					// index
					if (deleteCustomer.getDelRoom() == (Integer.parseInt(roomNum))) {

						// assigning que index to empty
						que[i] = "e";

						// assigning the room name to the respective element of
						// the hotel array
						// creating a queue object
						queue ad = new queue();
						HotelRoomBooking.hotel[deleteCustomer.getDelRoom()] = roomName;
						ad.enqueue(roomName); // calling the method enqueue

						// using a for loop to re arrange the elements of the
						// queue array using the index
						for (int j = i + 1; j < 7 - i; j++) {

							// checking whether the que element is not equal to
							// empty
							if (!(que[j].equals("e"))) {

								// assigning the value to the previous index
								que[j - 1] = que[j];

							}
						}
						break;
					}

				}
			}

		} catch (NullPointerException ex) { // catching all the errors
			JOptionPane.showMessageDialog(null, "Values are null.");

		}
	}

	public static void initialize(String[] queRef) {
		// using a for loop to assign each element to e
		for (int i = 0; i < 7; i++) {
			queRef[i] = "e";
		}
	}

}
