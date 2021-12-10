package com.javaex.ex03;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		Writer fw=new FileWriter("F:\\J\\JavaStudy\\ws\\IOStream\\song.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("학교종이땡떙떙");
		bw.newLine();
		bw.write("학교종이땡떙2");
		bw.newLine();
		bw.write("학교종이땡떙3");
		bw.newLine();
		bw.write("학교종이땡떙4");
		bw.newLine();
		bw.close();
	}
}
