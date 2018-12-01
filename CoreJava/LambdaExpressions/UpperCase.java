package com.lambda.assignment;

import java.util.ArrayList;

public class UpperCase {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sunilvbk");
		list.add("aunilvb");
		list.add("bnilk");
		list.add("cisuvbk");
		list.add("lsilvbk");
		list.add("vunibk");
		System.out.println(list);
		list.replaceAll(String::toUpperCase);
		System.out.println(list);

	}
}
