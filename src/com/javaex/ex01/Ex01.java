package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {

	public static void main(String[] args) throws Exception {

		InputStream in = new FileInputStream("D:\\J\\JavaStudy\\ws\\IOStream\\img.jpg");
		OutputStream out = new FileOutputStream("D:\\J\\JavaStudy\\ws\\IOStream\\byteimg.jpg");

		byte[] buffer = new byte[1024];
		System.out.println("복사시작");

		
		while (true) {
			
			int data = in.read(buffer);
			
			if (data == -1) {
				System.out.println("파일 복사완료"+data);
				break;
			}
			out.write(buffer);
		}

//		System.out.println("복사시작");
//		while (true) {
//
//			int data = in.read();
//
//			if (data == -1) {
//				System.out.println("복사가 완료되었습2니다"+data);
//				break;
//			}
//			out.write(data);
//		}
	in.close();
	out.close();
	}
}
