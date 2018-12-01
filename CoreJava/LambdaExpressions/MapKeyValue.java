package com.lambda.assignment;

import java.util.HashMap;
import java.util.Set;

public class MapKeyValue {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Sunil");
		map.put(2, "Suni");
		map.put(3, "Sun");
		Set set = map.entrySet();
		System.out.println(set);
		StringBuilder sbi = new StringBuilder();
		set.forEach(l -> {
			sbi.append((l));
		});
		System.out.println(set);
	}
}
