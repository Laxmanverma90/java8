package com.java.example;

import java.util.ArrayList;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Java ");
		list.add("DotNet ");
		list.add("Python ");
		list.add("Scala ");
		list.add("DataScience ");
		list.forEach(str -> System.out.print(str));
	}
}
