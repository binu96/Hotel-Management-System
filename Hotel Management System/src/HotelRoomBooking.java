import java.util.Scanner;

public class HotelRoomBooking {
	// creating a hotel array and initializing it to 10
	static String[] hotel = new String[10];

	public static void main(String[] args) {
		
		// calling the method inizialize
		initialize(hotel);
		
		// creating the object queue and assigning the inizialize method to it
		queue1 com = new queue1();
		com.initialize(com.getQue());
		
		// inizializing a char variable
		char menu = ' ';

		// using a while loop repeat the process until the user input z
		while (menu != 'Z' || menu != 'z') {
			
			// creating a menu system
			System.out.println("--------------------------------------------------------------");
			System.out.println("            Welcome to the Hotel Management System ");
			System.out.println("--------------------------------------------------------------");
			System.out.println("A - Add a new Customer.");
			System.out.println("V - View all the rooms.");
			System.out.println("3 - View the Queue");
			System.out.println("E - Display Empty rooms.");
			System.out.println("D - Delete Customer from a room.");
			System.out.println("F - Find the Room of a Customer.");
			System.out.println("S - Store the data in the storage.");
			System.out.println("L - Load the data from the storage.");
			System.out.println("O - View the data alphabetically.");
			System.out.println("C - To clear the storage.");
			System.out.println("Z - To signout.");
			System.out.println("______________________________________________________________");
			System.out.print("Please Enter Here : ");

			// creating a scanner object
			Scanner sc = new Scanner(System.in);
			
			// getting the char input from the user
			menu = sc.next().charAt(0);
			System.out.println();
			
			// using if conditions to get the proper character needed and to
			// call the right method and to validate the user inputs
			if (menu == 'A' || menu == 'a') {
				System.out.println("--------------------------------------------------------------");
				AddRoom add = new AddRoom();

			} else if (menu == 'V' || menu == 'v') {
				System.out.println("--------------------------------------------------------------");
				System.out.println("View of the occupied rooms and available rooms!");
				viewAllRooms view = new viewAllRooms();

			} else if (menu == '3') {
				System.out.println("--------------------------------------------------------------");
				for(int x = 0; x < 3; x++){
					queue abc = new queue();
					abc.dequeue();
				}

			} else if (menu == 'E' || menu == 'e') {
				System.out.println("--------------------------------------------------------------");
				System.out.println("view of the available rooms!");
				displayEmptyRooms empty = new displayEmptyRooms();

			} else if (menu == 'D' || menu == 'd') {
				System.out.println("--------------------------------------------------------------");
				deleteCustomer del = new deleteCustomer();

			} else if (menu == 'F' || menu == 'f') {
				System.out.println("--------------------------------------------------------------");
				findCustomer find = new findCustomer();

			} else if (menu == 'S' || menu == 's') {
				System.out.println("--------------------------------------------------------------");
				storeToFile store = new storeToFile();
				System.out.println("The data have been successfully added into the storage!");

			} else if (menu == 'L' || menu == 'l') {
				System.out.println("--------------------------------------------------------------");
				loadFile load = new loadFile();
				System.out.println("The data have been successfully loaded into the system!");

			} else if (menu == 'O' || menu == 'o') {
				System.out.println("--------------------------------------------------------------");
				sort sorting = new sort();
				System.out.println("The customers have been sorted alphabetically!");

			} else if (menu == 'C' || menu == 'c') {
				clearTheFile clear = new clearTheFile();
				System.out.println("The data has been cleared in the storage!");

			} else if (menu == 'Z' || menu == 'z') {
				System.out.println("You signed out!");
				System.exit(0);

			} else { // for any other input showing the following error message
				System.err.println("Please enter a valid input!!!");

			}
		}

	}

	public static void initialize(String[] hotelRef) {
		// using a for loop to assign each element to e
		for (int i = 0; i < 10; i++) {
			hotelRef[i] = "e";
		}
	}

}
