import java.util.Scanner;

public class deleteCustomer {

	// creating a scanner object
	Scanner sc = new Scanner(System.in);

	// creating a static int variable variable delRoom
	private static int delRoom;

	// creating getters to delroom variable
	static int getDelRoom() {
		return delRoom;
		
	}

	public deleteCustomer() {

		// seeking for input
		System.out.print("Please Enter the Customer Name : ");

		// getting the string input
		String delete = sc.nextLine().toUpperCase();

		// removing numbers and characters
		if (delete.matches("[A-Z\\s]+")) {

			// initializing a for loop to navigate through the array
			for (int i = 0; i < 10; i++) {

				// checking whether there is a match to the entered input
				if (HotelRoomBooking.hotel[i].equals(delete)) {
					delRoom = i;

					// assigning it to empty
					HotelRoomBooking.hotel[i] = "e";

					// printing the value
					System.out.println("Mr/Mrs/Ms." + delete + " has Been Successfully Checked Out.");

					// creating a object of queue and calling the method delete
					// queue from thr queue class
					queue1 que = new queue1();
					que.deleteQueue();

					break;

				} else {// validating the code

					if (i == 9) { // checking whether the i is equal to 9

						System.err.println("The person with the name you have entered doesn't exist!");
						break;
					}
				}
			}

		} else { // validating
			System.err.println("Please enter a valid input!");
			System.out.println();
		}
	}

}
