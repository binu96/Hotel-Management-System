import java.util.Scanner;

public class findCustomer {

	// creating a Scanner object
	Scanner sc = new Scanner(System.in);

	public findCustomer() {

		// seeking for input
		System.out.print("Please Enter the Customer Name : ");

		// getting the string input
		String find = sc.nextLine().toUpperCase();

		// removing numbers and chracters
		if (find.matches("[A-Z\\s]+")) {
			// initializing a loop to navigate through the array

			for (int i = 0; i < 10; i++) {
				// checking whether entered value matches any element in the
				// array

				if (HotelRoomBooking.hotel[i].equals(find)) {

					// printing the value
					System.out.println("Room " + i + " occupied by " + HotelRoomBooking.hotel[i] + ".");
					break;

				} else { // validating the code

					if (i == 9) { // checking whether index equals to 9 inorder
									// to validate it
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
