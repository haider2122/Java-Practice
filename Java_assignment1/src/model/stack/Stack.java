package model.stack;
import java.util.stream.*;

import java.util.*;
public class Stack {

	
	ArrayList<Object> list=new ArrayList<>();
	
	
	
	public Stack() {
		super();
	}

	public Stack(List stack) {
		super();
		this.list=(ArrayList<Object>) stack;
	}

	
	
	public Stack(Object stack[]) {
		super();
		//this.list= (ArrayList<Object>) Arrays.asList(stack);
	
	for(Object obj:stack){
		this.list.add(obj);
	}
	
	}
	
	
	
	
	
	

	public void push(Object val){
		this.list.add(val);
		}
	
	
	
	public Object pop(){
		return list.remove(list.size()-1);
	}
	
	
	
	public List<Object> display(){
		return list;
	}
	
	
	
	
	
	public boolean isEmpty(){
		
		return list.size()==0;
	}
	
	
	
	
public Object peek(){
		
		return list.get(list.size()-1);
	}
	
	
}
