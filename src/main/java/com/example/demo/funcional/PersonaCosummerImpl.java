package com.example.demo.funcional;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class PersonaCosummerImpl implements IPersonaConsummer<String,Integer> {
  private static final Logger Log= (Logger) LoggerFactory.getLogger(PersonaCosummerImpl.class);

	@Override
	public void accept(String arg1, Integer arg2) {
		// TODO Auto-generated method stub
		Log.info("mensaje: "+arg1);
	}

}
