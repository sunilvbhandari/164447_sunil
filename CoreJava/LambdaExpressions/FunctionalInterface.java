package com.lambda.assignment;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterface {
	public static void main(String[] args) {
		Order o1 = new Order("shirt", 500, true);
		Supplier<Order> s1 = () -> o1;
		System.out.println(s1.get());
		Consumer<Integer> c1 = (a) -> {
		};
		c1.accept(4);
		Predicate<Integer> p1 = a -> (a > 18);
		System.out.println(p1.test(20));
		Function<Integer, Integer> f1 = a -> a * a;
		System.out.println(f1.apply(3));
	}
}
