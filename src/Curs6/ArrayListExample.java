package Curs6;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		//List<String> --> generic type
		
		
		list.add("oana");
		list.add("Mariaa");
		list.add("Ion");
		list.add("Gabi");
		
		
		System.out.println(list.size());
		System.out.println(list.get(0));
		
		for(String nume : list) { 
			System.out.println("------------------------");
			System.out.println(nume);
		}
	}

}
