import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JOptionPane;

public class clearTheFile {

	public clearTheFile() {
		
		try { // opening a try to catch all the exceptions

			// creating a object file writer and wrapping it with print writer
			// and flushing it with a boolean variable
			FileWriter fw = new FileWriter("CustomerList.txt", false);
			PrintWriter pw = new PrintWriter(fw, false);
			pw.flush();
			
			// closing the print writer and file writer
			pw.close();
			fw.close();

			// catching the IO exception
		} catch (IOException ex) {
			JOptionPane.showMessageDialog(null, "File not found.");
		}
	}

}
