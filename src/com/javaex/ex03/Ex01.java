package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	
	public static void main(String[] args) throws IOException {
		
		InputStream pIn = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		InputStreamReader pIsr = new InputStreamReader(pIn);
		BufferedReader pBr = new BufferedReader(pIsr);
		
		Writer pFw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter pBw = new BufferedWriter(pFw);
		
		List<Person> pList = new ArrayList<Person>();
		
		String line = "";
		String[] spLine;
		String name, hp, company;
		
		while(true) {
			line = pBr.readLine();
			if(line == null) {
				break;
			}
			
			spLine = line.split(",");
			name = spLine[0];
			hp = spLine[1];
			company = spLine[2];
			
			Person p = new Person(name, hp, company);
			pList.add(p);
		}
		
		Person myP = new Person("차예진", "010-7113-9176", "000");
		pList.add(myP);
		
		for(Person pp : pList) {
			System.out.print(pp.write());
		}
		
		
		String data="";
		for(Person pp:pList) {
			data = pp.write();
			if(data == null) {
				break;
			}
			
			pFw.write(data);
		}
	
			
	
//		
//		int data;
//		System.out.println("복사시작");
//		while(true) {
//			data = bin.read();
//			if(data == -1) {
//				System.out.println("복사끝: " + data);
//				break;
//			}
//			
//			bout.write(data);
//		}
		
		pBr.close();
		pFw.close();
		
		
	}

}
