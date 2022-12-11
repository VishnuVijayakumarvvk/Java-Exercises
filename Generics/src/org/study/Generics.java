package org.study;
//class GenericClass<T>{
//	private T data;
//
//	public GenericClass(T data) {
//		this.data = data;
//	}
//
//	public T getData() {
//		return data;
//	}
//	
//}
class GenericClass<T>{
	private T data;

	public GenericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}
	
}

public class Generics {
	public static void main(String[] args) {
		GenericClass<String> datas= new GenericClass<String>("Namae = Vishnu");
		String values = datas.getData();
		System.out.println(values);
	
		GenericClass<Integer> st =  new GenericClass<Integer>(24);
		int AgeOfPerson = st.getData();
		System.out.println(AgeOfPerson);
	}
}
