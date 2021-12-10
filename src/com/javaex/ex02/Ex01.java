package com.javaex.ex02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws IOException{
		
		InputStream in = new FileInputStream("F:\\J\\JavaStudy\\ws\\IOStream\\song.txt");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("F:\\J\\JavaStudy\\ws\\IOStream\\song.txt");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		while(true) {
			
			int data = bin.read();
			if(data == -1) {
				System.out.println("복사가 완료 되었습니다." + data);
				break;
			}
			
			bout.write(data);
		}
		
		
		bin.close();
		bout.close();
	}

}