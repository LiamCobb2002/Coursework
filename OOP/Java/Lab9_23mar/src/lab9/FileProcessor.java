package lab9;

import java.io.File;
import java.util.*;

public class FileProcessor {

	 Boolean match = true;

	public FileProcessor(){
		
	}

	public Boolean Run(String role) {
		
		try {
			File myFile = new File("roles.txt");


			String s = "";
			Scanner reader = new Scanner("roles.txt");
			
			while(reader.hasNextLine()) {
				s=reader.nextLine();
				s+=",";
				
			
				if(s.contains(role)) {
					match=true;
				}
				reader.close();
				
				
				

			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return match;
	
	}

	
}


