package net.mechgear.geekscraft.geekscrafttemplatecreater;

import java.util.Map;

public class CreateTemplat {
	
	private Map<String,String> temp;
	
	CreateTemplat(String path){
		temp = new ClientInformation(path).getClientInformation();
	}
	
	Map<String,String> getTemp(){
		return temp;
	}
	
}
