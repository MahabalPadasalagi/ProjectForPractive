package com.udemy.mahabal;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class App {
	public static void main(String[] args) throws IOException {
		File file= new File("AchieveSomething");
		file.mkdir();
		System.out.println("Created Directory!!!");
		
		
		// if you are using the Buffer Writer and File Writer no need ot create the file directly you can give the file name the file will be created automatically and it will write into that file;
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("AchieveSomething\\Golas of life.txt"))) {
			bw.write("Grow Step by Step");
			bw.newLine();
			bw.write("Don't Except More money While learing");
			bw.newLine();
			bw.write("Don't trust on Early Success");
			bw.newLine();
			bw.write("Don't depend on anyone");
			bw.newLine();
			bw.write("Do work and get money");
			bw.close();
			System.out.println("Write into the file as well!!!");
		}
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("AchieveSomething\\Golas of life.txt"));
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
				
			}
			System.out.println("Readed from the File!!!!");
			br.close();
		}catch(FileNotFoundException file1) {
			file1.printStackTrace();
		}
	}

}
