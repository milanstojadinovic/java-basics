package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	private static void printNumbers(List<Integer> list) {
		list.stream().forEach(System.out::print);
	}

	private static List<Integer> doubleNumbersByTwo(List<Integer> list) {
		return list.stream().map(n -> n * 2).collect(Collectors.toList());
	}

	private static List<Integer> divisibleByTwo(List<Integer> list) {
		return list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
	}

	private static Integer sumNumbers(List<Integer> list) {
		return list.stream().reduce(0, (n, m) -> n + m);
	}

	public static void main(String[] args) {

		Integer[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		List<Integer> numbersAsList = new ArrayList<Integer>(Arrays.asList(numbers));
		System.out.println(numbersAsList);

		List<Integer> doubledNumbers = doubleNumbersByTwo(numbersAsList);
		System.out.println(doubledNumbers);

		List<Integer> divisibleByTwo = divisibleByTwo(numbersAsList);
		System.out.println(divisibleByTwo);

		Integer sum = sumNumbers(numbersAsList);
		System.out.println(sum);

		printNumbers(numbersAsList);
	}

}
