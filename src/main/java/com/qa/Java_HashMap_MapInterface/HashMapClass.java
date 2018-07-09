package com.qa.Java_HashMap_MapInterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMap<String, String> hashmapdemo=new HashMap<String,String>();
		hashmapdemo.put("1", "January");
		hashmapdemo.put("2", "February");
		hashmapdemo.put("3", "March");
		hashmapdemo.put("4", "April");
		hashmapdemo.put("5", "May");
		
		for(Map.Entry<String, String> data: hashmapdemo.entrySet())
		{
			System.out.println("Key:"+data.getKey()+" Value:"+data.getValue());
		}
	}
}
