import java.util.InputMismatchException;
import java.util.Scanner;

public class AddRoom {

	// creating the Scanner Object
	Scanner sc = new Scanner(System.in);

	public AddRoom() {

		try { // opening a try to catch the exceptions

			// getting the inputs
			System.out.print("Enter the room number : ");
			int roomNum = sc.nextInt();

			sc.nextLine(); // using a next line statement

			System.out.print("Enter name for room " + roomNum + " :");
			String roomName = sc.nextLine().toUpperCase();

			// checking whether the room Number in hotel is equal to empty
			if (HotelRoomBooking.hotel[roomNum].equals("e")) {

				// creating a for loop to naviagete through the hotel array
				for (int i = 0; i < 10; i++) {

					// checking whether the element in the input value is
					// present in the hotel array
					if (HotelRoomBooking.hotel[i].equals(roomName)) {

						// displaying the messages
						System.out.println("The Name you have entered already exists.");
						System.out.println("Add the surname and enter the customer.");
						return;
					}
				}

				// adding the data to the array
				HotelRoomBooking.hotel[roomNum] = roomName;

				// creating the object queue and calling the enqueue method room
				// Name
				queue que12 = new queue();
				que12.enqueue(roomName);

				// printing a message
				System.out.println("Customer data has been successfully added!");

			} else {// catching the errors

				// displaying some messages
				System.out.println("--------------------------------------------------------------");
				System.out.println("The room " + roomNum + " is not available!!");
				System.out.println("You have been added to the Queue!!");

				// creating the queue object and calling the method add queue
				queue1 que = new queue1();
				que.addQueue(roomNum, roomName);

				System.out.println();
			}

		} catch (InputMismatchException e) { // catching the errors
			System.err.println("Please enter room numbers only!");
			System.out.println();

		} catch (IndexOutOfBoundsException ex) {// catching the errors
			System.err.println("Please Note that there are only 10 rooms!");
			System.out.println();

		}
	}
}
