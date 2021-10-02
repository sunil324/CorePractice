package org.com.core;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	
	
	public static void main(String []args) {
		List<Book>list=new ArrayList<Book>();
		List<Copy>list1=new ArrayList<Copy>();
		Book b1=new Book(101,"Let us C","Yashwant","BPB",8);
		Copy c1=new Copy("sunil","singh");
		list1.add(c1);
		list.add(b1);
				
			System.out.println(c1.name+""+c1.lastname);
			
			System.out.println(b1.id+""+b1.name+""+b1.author+""+b1.publisher+""+b1.quantity);
		}
	

}
