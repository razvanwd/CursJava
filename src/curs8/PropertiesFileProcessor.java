package curs8;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;


public class PropertiesFileProcessor {
	
	public void writePropertiesFile() throws IOException {
		
		try {
			OutputStream outPutStream = new FileOutputStream("test.properties");
			
			Properties file = new Properties();
			file.setProperty("username", "oana");
			file.setProperty("password", "admin123");
			file.setProperty("email", "oana@oana.com");
			
			file.store(outPutStream, "Am salvat fisierul test.properties");
			System.out.println(file);
			
			
		} catch (FileNotFoundException e) {
			//
			e.printStackTrace();
		}
		
		public void readPropertiesFile(String key) throws IOException {
			
			InputStream inputStream = new FileInputStream("test.properties");
		}
	}

}
