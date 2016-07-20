package filepackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileRead {
	StringBuffer fileRead(){
		StringBuffer sb = new StringBuffer();
		
		try {
			File file = new File("D:/JAVASOURCE/skytome.txt");
			BufferedReader br = new BufferedReader(new InputStreamReader(
					new FileInputStream(file),"euc-kr"));
			String line = null;
			while ((line = br.readLine()) !=null){
				sb.append(line + "\n");
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return sb;
	}
}
