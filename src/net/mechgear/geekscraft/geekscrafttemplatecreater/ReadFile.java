package net.mechgear.geekscraft.geekscrafttemplatecreater;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
	
	//声明用于保存文件列表的List对象
	private List<File> fileList= new ArrayList<File>();
	
	public ReadFile(String path){
		readFile(path);
	}
	
	
	
	//负责写入的fileList的方法
	private void readFile(String path){
		String root = path;
		fileReader(root+"/mods", fileList);
		fileReader(root+"/versions", fileList);
		fileReader(root+"/libraries", fileList);
		fileList.add(new File(root+"/launcher_profiles.json"));
		
	}
	
	//获取fileList的方法
	List<File> getFileList(){
		return fileList;
	}
	
	
	//文件列表读取通用方法，dir参数为文件索引路径，list参数为索引File对象保存于的List
	private void fileReader(String dir,List<File> list){
		//读取dir目录下的文件，生成File数组
	 	File[] files = new File(dir).listFiles();
	 	//将files中的内容写入list
		for(File i:files){
			//判断是否为文件夹
			if(i.isDirectory()){
				//递归
				fileReader(i.getAbsolutePath(),list);
				
			}else{
				//否则写入list
				list.add(i);
			}
		}
	}
	
}
