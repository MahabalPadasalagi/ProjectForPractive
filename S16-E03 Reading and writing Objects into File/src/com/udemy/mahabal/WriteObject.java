package com.udemy.mahabal;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

	public static void main(String[] args) throws IOException {

		Vehicle v1=new Vehicle("Bike",1234);
		Vehicle v2=new Vehicle("Car",3456);


		try(FileOutputStream FOS=new FileOutputStream("Mahabal.dat")){
			try(ObjectOutputStream obj=new ObjectOutputStream(FOS)){
				obj.writeObject(v1);
				obj.writeObject(v2);

			    System.out.println("Writiting into file is Completed!!");
			}
		}


	}

}
