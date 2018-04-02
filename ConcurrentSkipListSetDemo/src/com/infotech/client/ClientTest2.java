package com.infotech.client;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.concurrent.ConcurrentSkipListSet;

public class ClientTest2 {

	public static void main(String[] args) {
		NavigableSet<String> citySet = new ConcurrentSkipListSet<String>();
		citySet.add("New Delhi");
		citySet.add("Mumbai");
		citySet.add("Chennai");
		citySet.add("Hyderabad");

		System.out.println("------ Traversing the set --------");
		Iterator<String> itr = citySet.iterator();
		while (itr.hasNext()) {
			System.out.println("Value -  " + itr.next());
		}

		System.out.println("Higher - " + citySet.higher("C"));
		System.out.println("Lower - " + citySet.lower("Mumbai"));
		System.out.println("------Tail Set --------");

		Set<String> set = citySet.tailSet("Hyderabad");

		itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println("Value -  " + itr.next());
		}
	}
}
