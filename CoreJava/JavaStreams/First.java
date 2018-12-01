package com.stream.assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class First {

	public static void main(String[] args) {
		ArrayList<Fruit> fruit = new ArrayList<Fruit>();
		fruit.add(new Fruit("Apple", "red", 100, 150));
		fruit.add(new Fruit("Mango", "green", 70, 90));
		fruit.add(new Fruit("Orange", "orange", 50, 50));
		fruit.add(new Fruit("Grapes", "red", 70, 90));
		System.out
				.println("-----------------------------------------------------");
		fruit.stream().filter(x -> (x.getCalories() < 100))
				.sorted((p1, p2) -> {
					if (p1.getCalories() < p2.getCalories()) {
						return 1;
					}
					return -1;
				}).forEach(x -> System.out.println(x));
		System.out
				.println("-----------------------------------------------------");
		Set<Entry<String, List<Fruit>>> list2 = fruit.stream()
				.collect(Collectors.groupingBy(Fruit::getColor)).entrySet();// .forEach(x->System.out.println(x.getKey()+"\t"+x.getValue()));
		System.out.println();
		System.out.println(list2 + "\n");
/*		fruit.stream()
				.sorted((p1, p2) -> p1.getColor().compareTo(p2.getColor()))
				.forEach(
						x -> System.out.println(x.getColor() + " :"
								+ x.getName()));*/
		System.out
				.println("-----------------------------------------------------");
		fruit.stream().filter(x -> (x.getColor().equals("red")))
				.sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
				.forEach(x -> System.out.println(x));

		System.out
				.println("-----------------------------------------------------");

		ArrayList<Transaction> tr = new ArrayList<Transaction>();
		tr.add(new Transaction(new Trader("Trader1", "Banglore"), 2011, 500000));
		tr.add(new Transaction(new Trader("Trader2", "Pune"), 2012, 54000));
		tr.add(new Transaction(new Trader("Trader3", "Banglore"), 2011, 56000));
		tr.add(new Transaction(new Trader("Trader4", "Mumbai"), 2013, 102000));
		tr.add(new Transaction(new Trader("Trader5", "Mumbai"), 2011, 15000));
		tr.add(new Transaction(new Trader("Trader6", "Pune"), 2012, 54000));
		tr.add(new Transaction(new Trader("Trader7", "Pune"), 2012, 5000));
		tr.add(new Transaction(new Trader("Trader8", "Mumbai"), 2011, 15000));
		tr.add(new Transaction(new Trader("Trader9", "Delhi"), 2011, 15000));
		tr.add(new Transaction(new Trader("Trader10", "Delhi"), 2011, 1000));
		StringBuilder str = new StringBuilder();

		tr.stream().filter(x -> (x.getYear() == 2011)).sorted((p1, p2) -> {
			if (p1.getValue() > (p2.getValue())) {
				return 1;
			}
			return -1;
		}).forEach(x -> System.out.println(x));

		System.out
				.println("-----------------------------------------------------");

		tr.stream().map(x -> x.getTrader().getCity()).distinct()
				.forEach(x -> System.out.println(x));
		System.out
				.println("-----------------------------------------------------");

		tr.stream()
				.filter(x -> (x.getTrader().getCity().equals("Pune")))
				.sorted((p1, p2) -> (p1.getTrader().getName().compareTo(p2
						.getTrader().getName())))
				.forEach(x -> System.out.println(x.getTrader().getName()));

		System.out
				.println("-----------------------------------------------------");

		tr.stream()
				.sorted((p1, p2) -> (p1.getTrader().getName().compareTo(p2
						.getTrader().getName())))
				.forEach(x -> str.append(" " + x.getTrader().getName()));
		System.out.println(str);
		System.out
				.println("-----------------------------------------------------");

		if (tr.stream().filter(x -> (x.getTrader().getCity().equals("Indore")))
				.findAny() != null) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		System.out
				.println("-----------------------------------------------------");

		tr.stream().filter(x -> (x.getTrader().getCity().equals("Delhi")))
				.forEach(x -> System.out.println(x.getValue()));
		System.out
				.println("-----------------------------------------------------");

		System.out.println(tr.stream().map(p1 -> p1.getValue())
				.sorted((p1, p2) -> {
					if (p1 < (p2)) {
						return 1;
					}
					return -1;
				}).findFirst());
		System.out
				.println("-----------------------------------------------------");

		System.out.println(tr.stream().map(p1 -> p1.getValue())
				.sorted((p1, p2) -> {
					if (p1 > (p2)) {
						return 1;
					}
					return -1;
				}).findFirst());
		System.out
				.println("-----------------------------------------------------");

	}

}
