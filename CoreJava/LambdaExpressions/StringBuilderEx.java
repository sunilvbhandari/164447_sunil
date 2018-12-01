package com.lambda.assignment;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StringBuilderEx {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("sunlvbk");
		list.add("aunilvb");
		list.add("bnilk");
		list.add("cisuvbk");
		list.add("lsilvbk");
		list.add("vunibk");
		System.out.println(list);
		Consumer<String> c1 = (a) -> {
		};
		StringBuilder sbi = new StringBuilder();

		list.forEach(l -> {
			c1.accept(l);
			sbi.append((l.charAt(0)));
		});
		System.out.println(sbi);
	}

}
