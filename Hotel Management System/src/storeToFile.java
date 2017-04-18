import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class storeToFile {

	public storeToFile() {

		try {// opening a try to catch the exceptions

			// creating a file object and assigning the file name
			File customerList = new File("CustomerList.txt");

			// creating the file writer object and flushing it with a boolean
			// variable
			FileWriter fw = new FileWriter(customerList, true);

			// wrapping the file writer object with printwriter and flushing
			PrintWriter pw = new PrintWriter(fw, true);

			// for loop to navigate in the string array
			for (int i = 0; i < 10; i++) {

				// using a if condition to eleminate the empty rooms
				if (!(HotelRoomBooking.hotel[i].equals("e"))) {

					// writing the data in the file
					pw.println(i + "     " + HotelRoomBooking.hotel[i]);
				}
			}
			pw.close(); // closing the print writer

			// catching the exceptions
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found.");

		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "File not found.");
		}
	}

}
