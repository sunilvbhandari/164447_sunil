package com.lambda.assignment;

import java.util.ArrayList;

public class WordList {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sunilvbk");
		list.add("sunilvb");
		list.add("sunilk");
		list.add("suvbk");
		list.add("silvbk");
		list.add("unibk");
		System.out.println(list);
		list.removeIf(a -> (a.length() % 2 != 0));
		System.out.println(list);
	}
}
