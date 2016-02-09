package net.mechgear.geekscraft.geekscrafttemplatecreater;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Map;

public class ObjectFileWriter {

	static void objectFileWriter(String path,Map<String,String> t){
		try {
			File f = new File(path);
			FileOutputStream fos = new FileOutputStream(f);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
			oos.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
}
