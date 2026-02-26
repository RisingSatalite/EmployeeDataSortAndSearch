package util;

import java.io.FileWriter;
import java.io.IOException;

public class saveFile {
	public void saveToNewFile(String where, String data) {
		try (FileWriter writer = new FileWriter(where)) {
            writer.write(data);
            System.out.println("File saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
