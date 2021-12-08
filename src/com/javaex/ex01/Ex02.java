package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("D:\\J\\JavaStudy\\ws\\IOStream\\img.jpg");
		BufferedInputStream bin=new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("D:\\J\\JavaStudy\\ws\\IOStream\\byteimg.jpg");
		BufferedOutputStream bout=new BufferedOutputStream(out);
		
		while(true) {
			int data=bin.read();
			if(data==-1) {
		System.out.println("복사완료");
		break;
		}
			bout.write(data);
		}
		
		bin.close();
		bout.close();
	}

}
