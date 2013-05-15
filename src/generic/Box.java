package generic;

import java.util.ArrayList;

public class Box<T> {
	private T t;
	private ArrayList<? extends Number> arr;
	private ArrayList<T> arr2;
	private ArrayList<?> arr3;
	public void set(T t) {
		this.t = t;
	}
	public T get() {
		return t;
	}

	
	public <U extends Number> void inspect(U u) {
		System.out.println("T : " + t.getClass().getName());
		System.out.println("U : " +u.getClass().getName());
	}
		
	public void setArrayList(ArrayList<? extends Number> arr) {
		this.arr = arr;
	}
	
	public void setArrayList2(ArrayList<T> arr) {
		this.arr2 = arr;
	}
	
	public void setArrayList3(ArrayList<? extends String> arr) {
		this.arr3 = arr;
	}
	
	public ArrayList<? extends Number> getArr() {
		return arr;
	}
	
	public ArrayList<T>getArr2() {
		return arr2;
	}
	
	
}
