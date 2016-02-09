package net.mechgear.geekscraft.geekscrafttemplatecreater;

import java.util.Scanner;

public class TempCreaterCore {

	public TempCreaterCore() {
	
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	System.out.println("请输入游戏文件夹(.minecraft)路径:");
	String path = s.nextLine();
	System.out.println("请输入模板输出路径:");
	String outPath=s.nextLine();
	
	ObjectFileWriter.objectFileWriter(outPath, new CreateTemplat(path).getTemp());
	
	}
	
}
