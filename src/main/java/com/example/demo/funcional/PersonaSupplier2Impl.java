package com.example.demo.funcional;

public class PersonaSupplier2Impl implements IPersonaSupplier<Persona>{

	@Override
	public Persona getNombre() {
		// TODO Auto-generated method stub
		Persona per=new Persona();
		per.setApellido("Coyago1");
		per.setNombre("Henry1");
		return per;
	}

}
