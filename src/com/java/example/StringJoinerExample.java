package com.java.example;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
		OnlyDelimiter onlyDelimiter = new OnlyDelimiter();
		DelimiterWithPrefixSuffix dps = new DelimiterWithPrefixSuffix();
		MergeTwoStringJoiner merge  = new MergeTwoStringJoiner();
		onlyDelimiter.commaDel();
		dps.hyphenDelimiter();
		merge.mergeStringJoiners();
	}
}

class OnlyDelimiter{
	public void commaDel(){
		System.out.println(" -------- Comma delimiter -----------");
		StringJoiner joinNames = new StringJoiner(",");   
        joinNames.add(" Core Java ");  
        joinNames.add(" Spring ");  
        joinNames.add(" Boot ");  
        System.out.println(joinNames); 
	}
}

class DelimiterWithPrefixSuffix{
	public void hyphenDelimiter(){
		System.out.println(" -------- hyphen delimiter with prefix sufix -----------");
		StringJoiner joinNames = new StringJoiner("-","[","]");   
        joinNames.add(" Core Java ");  
        joinNames.add(" Spring ");  
        joinNames.add(" Boot ");  
        System.out.println(joinNames); 
	}
}

class MergeTwoStringJoiner{
	public void mergeStringJoiners(){
		System.out.println(" -------- merge two String joiners -----------");
		StringJoiner joinNames = new StringJoiner("~", "[", "]");   
        joinNames.add(" String ");  
        joinNames.add(" Collection ");  
  
        StringJoiner joinNames2 = new StringJoiner("*", "[", "]");   
        joinNames2.add(" Core java ");  
        joinNames2.add(" Spring boot ");  
        StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println(merge);  
	}
}

