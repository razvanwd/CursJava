package curs8;

import java.awt.PrintGraphics;
import java.util.Iterator;

public class VarargsExample {

	public static void main(String[] args) {
		//printStringArguments("unu", "doi", "trei");
		//printInArguments(1, 2, 3 ,4);
		//printMultipleArguments("Ceva", 33, 44, 55);
		
		printGenerics(1, 2, 3, "unu", 33, 22.45, 'c');
	}
	
	public static<T> void printGenerics(T...values){
		for(T value: values) {
			System.out.println(value);
		}
	}
	
	public static void printStringArguments(String...values) {
		
		for(String value: values) {
			System.out.println(value);
		}
	}
	public static void printInArguments(int...values) {
		
		for(int value: values) {
			System.out.println(value);
		}
	}
	
	public static void printMultipleArguments(String text, int...values) {
		System.out.println(text);
		for(int value: values) {
			System.out.println(value);
		}
	}
}
