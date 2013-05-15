package generic;

import java.util.ArrayList;

public class GenericMain {	
	
	public static void main(String[] args) {
		
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");
		
		System.out.println(p1.getKey() +"=" + p1.getValue());
		System.out.println(p2.getKey() +"=" + p2.getValue());
		
		Box<Integer> intBox = new Box<Integer>();
		Box<String> strBox = new Box<String>();
		
		ArrayList<Integer> intArryList = new ArrayList<Integer>();
		intArryList.add(10);
		
		ArrayList<String> strArryList = new ArrayList<String>();
		strArryList.add("aaa");
		
		intBox.setArrayList2(intArryList);
		//intBox.setArrayList2(strArryList);
		intBox.setArrayList3(strArryList);
		
		intBox.set(10);
		intBox.set(20);
	
		System.out.println(intBox.get());
		//strBox.set("Hello World");
		//System.out.println(strBox.get());
		
		intBox.set(new Integer(100));
		intBox.inspect(100);
		//intBox.inspect("hello");
		
		//Box<Book> bookBox = new Box<Book>();
		//bookBox.set(new Book("Java"));
		//Book book = bookBox.get();
		//System.out.println(book.getName());
		
		Box<Integer> intBox2 = new Box<Integer>();
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
		intBox2.setArrayList(intArray);
		
		ArrayList<String> strArray = new ArrayList<String>();
		strArray.add("a");
	
		
		//strBox.setArrayList(intArray);
		
		//ArrayList<? extends Number> resultArray = strBox.getArr();
		
		//for (Number a : resultArray) {
		//	System.out.println(a);
		//}

	}
}
