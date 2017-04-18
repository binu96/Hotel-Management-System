
public class sort {

	public sort() {

		// creating a string array and initializing it
		String[] customer = new String[10];

		// initializing temp to null
		String temp = null;

		// initializing a for loop to navigate in the array
		for (int k = 0; k < 10; k++) {

			// assigning all the values of the hotel array to the array created
			customer[k] = HotelRoomBooking.hotel[k];
		}

		// initializing two for loops to navigate each element of both the
		// arrays
		for (int i = 0; i < 10; i++) {
			for (int j = i; j < 10; j++) {

				// eleminatng empty values
				if (!(customer[i].equals("e"))) {

					// using compared to method to compare each element
					if (customer[i].compareTo(customer[j]) > 0) {

						// swapping the elements to each array
						temp = customer[i];
						customer[i] = customer[j];
						customer[j] = temp;
					}

				}

			}
		}

		// initializing two for loops to navingate through each elements in both
		// the arrays
		for (int x = 0; x < 10; x++) {

			for (int y = 0; y < 10; y++) {

				// eleminating all empty rooms
				if (!(customer[x].equals("e"))) {

					// checking whether the customer array elements are equal to
					// the hotel array
					if (customer[x].equals(HotelRoomBooking.hotel[y])) {

						// printing all the values
						System.out.println("room " + y + " occupied by " + customer[x] + ".");
					}
				}

			}
		}
	}

}
