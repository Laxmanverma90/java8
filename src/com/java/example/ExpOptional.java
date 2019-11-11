package com.java.example;

import java.util.Optional;

public class ExpOptional {

	public static void main(String[] args) {

		/*
		 * String[] words = new String[10]; String word =
		 * words[5].toLowerCase(); System.out.print(word);
		 */

		String[] words = new String[10];
		words[1] = "Bangalore";
		Optional<String> checkNull = Optional.ofNullable(words[1]);
		if (checkNull.isPresent()) {
			String word = words[1].toUpperCase();
			System.out.println(word);
		} else
			System.out.println("word is null");

		Optional<String> optionalString = Optional.of("Hello");
		if (optionalString.isPresent()) {
			System.out.println(optionalString.get());
		} else {
			System.out.println("Value not present");
		}

		Optional<Integer> op = Optional.empty();
		System.out.println("Empty Optional test = " + op);
	}
}
