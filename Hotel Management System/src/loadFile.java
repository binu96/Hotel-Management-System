import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JOptionPane;

public class loadFile {

	public loadFile() {

		// initializing a string variable
		String line = null;
		try {// opening a try to catch the exceptions

			// invoking the file input stream and wrapping it with buffered
			// reader
			FileInputStream in = new FileInputStream("CustomerList.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(in));

			// looping until the elements of the file becomes null
			while ((line = br.readLine()) != null) {
				
				// creating a array and using lines split to divide the elements
				// by space
				String[] token = line.split("\\s+");
				
				// assigning those splitted elements into array
				String variable1 = token[0];
				String variable2 = token[1];

				// navigating through the elements
				for (int i = 0; i < 10; i++) {
					
					// checking whether the each element matches the
					// correspoding variables
					if (i == Integer.parseInt((variable1))) {
						
						// adding the string variables to hotel array
						HotelRoomBooking.hotel[i] = variable2;
					}
				}

			}
			br.close();// closing the buffered reader

			// catching all the exceptions
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File not found.");

		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "IO exception.");

		} catch (NullPointerException ex) {
			JOptionPane.showMessageDialog(null, "Null value.");
		}
	}

}
