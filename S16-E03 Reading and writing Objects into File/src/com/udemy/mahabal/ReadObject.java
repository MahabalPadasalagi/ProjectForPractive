package com.udemy.mahabal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		try {FileInputStream FIS=new FileInputStream("Mahabal.dat");
		ObjectInputStream bis=new ObjectInputStream(FIS);
		Vehicle v1=(Vehicle)bis.readObject();
		Vehicle v2=(Vehicle)bis.readObject();
		System.out.println(v1);
		System.out.println(v2);
	    System.out.println("Read Object Succefully");
	    bis.close();
		}catch(FileNotFoundException file) {
		  file.printStackTrace();
		}
	}

}
