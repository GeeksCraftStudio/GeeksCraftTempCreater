package net.mechgear.geekscraft.geekscrafttemplatecreater;

import java.util.Scanner;

public class TempCreaterCore {

	public TempCreaterCore() {
	
	@SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	
	String path ;
	
	w1:
	while(true){
		System.out.println("请输入游戏文件夹(.minecraft)路径:");
		//	String path = "G:\\Minecraft Geekscraft Client-1.7.10.7.1\\.minecraft";
		path = s.nextLine();
		if(path.lastIndexOf(".minecraft") != -1){
			switch (path.length()-path.lastIndexOf(".minecraft")) {
				case 11:
					path = path.substring(0, path.length()-1);
					break w1;
				case 10:
					break w1;
		
				default:
					System.out.println("路径不合法");
					break;
			}
		}else{
			System.out.println("路径不合法");
		}
	}
	
	
	System.out.println("请输入模板输出路径:(默认：Jar路径)");
	String outPath=s.nextLine();
	System.out.println("请输入输出模板文件名(默认:Template.temp)");
	String src =s.nextLine();
	if(src.isEmpty()){
		src ="Template.temp";
	}
	outPath += src;
//	String outPath = "H:\\WorkSpace\\Protection\\Temp.temp";
	
	System.out.println("正在生成模板");
	ObjectFileWriter.objectFileWriter(outPath, new CreateTemplat(path).getTemp());
	System.out.println("模板生成成功");
	}
}
