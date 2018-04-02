package com.infotech.client;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ClientTest1 {
	public static void main(String[] args) {
		NavigableSet<String> citySet = new ConcurrentSkipListSet<String>();
        citySet.add("New Delhi");
        citySet.add("Mumbai");
        citySet.add("Chennai");
        citySet.add("Hyderabad");
        
        System.out.println("------ Traversing the set -------");
        Iterator<String> itr = citySet.iterator();
        while(itr.hasNext()){
            System.out.println("Value -  " + itr.next());
        }
	}
}
