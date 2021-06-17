package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Ex02 {

	public static void main(String[] args) throws IOException {
		
		Reader fr = new FileReader("C:\\javaStudy\\file\\song.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String str = "";
		while(true) {
			str = br.readLine(); // 한줄씩 읽어옴 --> 줄바꿈기호는 제외
			if(str == null) {
				break;
			}
			System.out.println(str);
		}
		
		br.close();

	}

}
