package org.study;

import java.util.HashMap;
import java.util.Map;

public class HahMap {

	public static void main(String[] args) {
		System.out.println("Welcome to HashMap***");
		Map<String,Integer> country = new HashMap<>();
		country.put("India", 111);
		country.put("China", 332);
		country.put("Usa", 345);
		country.put("Canada", 343);
		country.put("Pakistan", 567);
		System.out.println(country);
		System.out.println(country.get("India"));
		System.out.println(country.containsValue(332));
		System.out.println("The HashMap in iteration");
		for(Map.Entry<String,Integer> map : country.entrySet()) {
			System.out.println("The key is : " + map.getKey());
			System.out.println("The value is : " + map.getValue());
		}
	} 

}
 