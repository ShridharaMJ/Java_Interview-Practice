package com.java.practice.collectordrill;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java.practice.basicobject.People;

public class CollectorsPractice {

	public static List<People> createPeople() {
		return List.of(new People("Raj Kumar", 74, 'M'), new People("Vishnuvardhan", 65, 'M'),
				new People("Jayanti", 44, 'F'), new People("Lilavathi", 55, 'F'), new People("Abmirish", 68, 'M'),
				new People("Geetha", 39, 'F'), new People("Ramesh", 67, 'M'), new People("Sarithaa", 66, 'F'),
				new People("Manjulaa", 58, 'F'), new People("Shankar Nag", 66, 'M'), new People("Ananth Nag", 55, 'M'),
				new People("Ramesh", 44, 'M'));
	}

	public static void main(String[] args) {

		// get all names where age is >50

		List<String> collect = createPeople().stream().filter(ppl -> ppl.getAge() >= 50).map(People::getName)
				.collect(Collectors.toList());

		System.out.println("50+ names are :-" + collect);

		// System.out.println(collect);
		long count = createPeople().stream().filter(ppl -> ppl.getAge() >= 50).map(People::getName).count();
		System.out.println("Total ages >=50:- " + count);

		// get all names as key and age as values
		Map<String, Integer> collect5 = createPeople().stream().distinct()
				.collect(Collectors.toMap(People::getName, People::getAge,(a,b)->a));
		System.out.println("Ppl detaisl in map :" + collect5);

		Map<Boolean, List<String>> collect2 = createPeople().stream().collect(Collectors
				.partitioningBy((ppl -> ppl.getAge() > 50), Collectors.mapping(People::getName, Collectors.toList())));
		System.out.println(collect2);

		Double collect3 = createPeople().stream().collect(Collectors.averagingDouble(People::getAge));
		System.out.println(new DecimalFormat("##.##").format(collect3));

		Map<Character, List<String>> collect4 = createPeople().stream().collect(
				Collectors.groupingBy(People::getGender, Collectors.mapping(People::getName, Collectors.toList())));
		System.out.println("Group by gender : " + collect4);

	}

}
