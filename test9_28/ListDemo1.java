package test9_28;

import java.util.ArrayList;
import java.util.List;

public class ListDemo1 {

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Go");
		System.out.println(list.size());
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
		System.out.println("******************");
		list.remove(2);
		list.remove("C");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+",");
		}
		

	}

}
