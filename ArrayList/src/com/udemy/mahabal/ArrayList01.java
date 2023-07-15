package com.udemy.mahabal;

import java.util.ArrayList;

public class ArrayList01 {

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
		ArrayList01 arrayList01= new ArrayList01();
		arrayList01.displayArrayElements(listNames);
		System.out.println("**********");
		arrayList01.removeElementByPosition(1);
		arrayList01.displayArrayElements(listNames);
		/*System.out.println("***********");
		arrayList01.removeElementByName("Vikas");
		arrayList01.displayArrayElements(listNames);
		arrayList01.modifyList(2, "Vikas GL");
		arrayList01.displayArrayElements(listNames);*/
	}
	void displayArrayElements(ArrayList<String> names) {
		for(String name:names) {
			System.out.println(name);
		}

	}
	
	void removeElementByPosition(int position) {
		listNames.remove(position);
	}
	
	void removeElementByName(String name) {
		listNames.remove(name);
	}
	
	void modifyList(int position,String newName) {
		listNames.set(2,newName);
	}

}
