package com.example.demo.funcional;


@FunctionalInterface
public interface IPersonaConsummer <T,V>{
	
	public void accept(T arg1,V arg2);

}
