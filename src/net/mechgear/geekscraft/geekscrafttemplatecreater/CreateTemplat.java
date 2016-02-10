package net.mechgear.geekscraft.geekscrafttemplatecreater;

import java.util.Map;

public class CreateTemplat {
	
	private Map<String,String> temp;
	
	CreateTemplat(String path){
		temp = new ClientInformation(path).getClientInformation();
	}
	CreateTemplat(String path,String seed) {
		temp = new ClientInformation(path, seed).getClientInformation();
		temp.put("seed", seed);
	}
	
	Map<String,String> getTemp(){
		return temp;
	}
	
}
