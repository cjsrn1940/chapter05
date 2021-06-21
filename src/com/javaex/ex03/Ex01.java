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
		
		InputStream is = new FileInputStream("C:\\javaStudy\\file\\PhoneDB_원본.txt");
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		
		Writer fw = new FileWriter("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		List<Person> pList = new ArrayList<Person>();
		
		String line = "";
		String[] spLine;
		String name, hp, company;
		
		while(true) {
			line = br.readLine();
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
			System.out.println(pp.write());
		}
		
		
		String data="";
		for(Person pp:pList) {
			data = pp.write();
			if(data == null) {
				break;
			}
			bw.write(data);
			bw.newLine();
		}
		
		br.close();
		bw.close();
		
		
	}

}
