package filepackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

import customutil.CustomDateFormat;

public class FileReadDemo {
	
	StringBuffer fileReadget(){
	StringBuffer sb = new StringBuffer();
	CustomDateFormat cdf = new CustomDateFormat();
	String date = cdf.mydateFormat();
		try {
			File file = new File("D:/JAVASOURCE/skytome.txt");
			String fileName = file.getName();
			int index = fileName.lastIndexOf(".");
			System.out.println(fileName.substring(0,index));
			System.out.println(fileName.substring(index+1));
			FileInputStream ins = new FileInputStream(file);
			InputStreamReader insr = new InputStreamReader(ins,"euc-kr");
			BufferedReader br = new BufferedReader(insr);
			String line = null;
			while( (line = br.readLine()) !=null){
				sb.append(line+"\n");
			}
			date = date.substring(0, 10);
			String orgfile = fileName.substring(0,index);
			String extension = fileName.substring(index+1);
			String fileName2 = orgfile+date+"."+extension;
			FileInputStream fis = new FileInputStream( file) ;
			FileOutputStream fos = new FileOutputStream("d:/filecopy/"+fileName2);
			int data =0;
			while ( (data = fis.read()) != -1){
				fos.write(data);
			}
			br.close();
			fis.close();
			fos.close();
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		}
		return sb;
	}
}
