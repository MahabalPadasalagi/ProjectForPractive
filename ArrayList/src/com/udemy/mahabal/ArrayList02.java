//Check the name Presence and modify the name if exist

package com.udemy.mahabal;

import java.util.ArrayList;

public class ArrayList02 {

	static ArrayList<String> listNames=new ArrayList<>();

	public static void main(String[] args) {
		listNames.add("Mahabal");
		listNames.add("Vikas");
		listNames.add("Raju");
		listNames.add("Lavanya");
		listNames.add("Sahana");
		listNames.add("Renuka");
		listNames.add("Vikas G L");
		listNames.add("Kiran");
		ArrayList02 arrayList02= new ArrayList02();
		arrayList02.displayArrayElements(listNames);
		System.out.println("**********");
		/*arrayList01.removeElementByPosition(1);
		arrayList01.displayArrayElements(listNames);
		System.out.println("***********");
		arrayList01.removeElementByName("Vikas");
		arrayList01.displayArrayElements(listNames);
		arrayList01.modifyList(2, "Vikas GL");
		arrayList01.displayArrayElements(listNames);*/
		int position= arrayList02.checkName("Sangamesh");
		if(position>0) {
			arrayList02.modifyList(position, "SomeOne");
			System.out.println(listNames);
		}else {
			listNames.add("Sangamesh");
			System.out.println(listNames);
		}
	}
	void displayArrayElements(ArrayList<String> names) {
		for(String name:names) {
			System.out.println(name);
		}

	}

	void modifyList(int position,String newName) {
		listNames.set(2,newName);
	}
	
	int checkName(String name) {
		return listNames.indexOf(name);
	}

}
