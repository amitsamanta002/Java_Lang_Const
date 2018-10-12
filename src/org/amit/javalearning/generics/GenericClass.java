package org.amit.javalearning.generics;

public class GenericClass<T> {
	T obj;
	
	public void add(T obj){
		this.obj = obj;
	}
	
	public T get(){
		return this.obj;
	}
	
}

