package org.study;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

class Data<T>{
	private T datas;

	public Data(T datas) {
		super();
		this.datas = datas;
	}

	public T getDatas() {
		return datas;
	}
	
}

public class GenericList {

	public static void main(String[] args) {
		List<Data<Object>> lst = new LinkedList<>();
		lst.add(new Data<Object>("Vishnu"));
		lst.add(new Data<Object>(24));
		lst.add(new Data<Object>(5.9));
		lst.add(new Data<Object>("male"));
		lst.add(new Data<Object>(true));
		System.out.println(lst.get(0).toString());
		
	} 
	

}
