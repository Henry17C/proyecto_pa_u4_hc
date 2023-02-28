package com.example.demo.funcional;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

public class MainInterfacesFuncionales {
	private static final Logger LOG = (Logger) LoggerFactory.getLogger(MainInterfacesFuncionales.class);

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		/*
		// 1. SUPPLIER
		LOG.info("Supplier ");
		// clases
		IPersonaSupplier<String> supplier1 = new PersonaSupplierImpl();
		LOG.info("Supplier clase " + supplier1.getNombre());
		// LAMBDAS
		IPersonaSupplier<String> supplier2 = () -> "Henry 2";
		LOG.info("Supplier Lambda " + supplier2.getNombre());

		IPersonaSupplier<Integer> supplier3 = () -> Integer.valueOf(5);
		LOG.info("Supplier Lambda " + supplier3.getNombre());

		IPersonaSupplier<Persona> supplier4 = () -> {
			Persona per = new Persona();
			per.setApellido("Coyago");
			per.setNombre("Henry");
			return per;
		};
		LOG.info("Supplier Lambda " + supplier4.getNombre());

		IPersonaSupplier<Persona> supplier5 = new PersonaSupplier2Impl();
		LOG.info("Supplier Lambda " + supplier5.getNombre());

		// 1. CONSUMMER
		LOG.info("Conummer ");
		// Clase
		IPersonaConsummer<String, Integer> consummer1 = new PersonaCosummerImpl();
		consummer1.accept("Procesa este dato", 5);

		// Lambda

		IPersonaConsummer<String, Integer> consummer2 = (cadena, numero) -> {
			LOG.info("mensaje: " + cadena);
			LOG.info("numero: " + numero);
		};
		consummer2.accept("Procesa este dato1", 5);

		IPersonaConsummer<String, Integer> consummer3 = (cadena, numero) -> {
			LOG.info("mensaje1: " + cadena);
			LOG.info("mensaje2: " + cadena);
		};

		consummer3.accept("Procesa este dato3", 6);

		// 3. PREDICATE
		LOG.info("PREDICATE ");
		// lambda
		IPersonaPredicate<String> predicate1 = cadena -> cadena.contains("z");
		LOG.info("Predicate: " + predicate1.evaluar("Henry"));

		IPersonaPredicate<Integer> predicate2 = numero -> {

			if (numero.intValue() > 10) {
				return true;
			} else {
				return false;
			}
		};

		LOG.info("Predicate: " + predicate2.evaluar(Integer.valueOf(8)));

		// 4. FUNTION
		LOG.info("FUNCTION ");
		// (retorno, argumento)
		IPersonaFunction<String, Integer> function1 = numero -> "VAL: " + numero.toString();
		LOG.info(function1.aplicar(10));
		
		IPersonaFunction<Ciudadano, Persona> function2 = per -> {
			Ciudadano ciu = new Ciudadano();
			ciu.setNombreCompleto(per.getNombre() + " " + per.getApellido());
			ciu.setCiudad("Quito");
			return ciu;
		};
		Persona per1 = new Persona();
		per1.setNombre("Henry");
		per1.setApellido("Coyago");

		Ciudadano ciudadanoConvertidoTipo = function2.aplicar(per1);
		LOG.info("Ciudadano Convertido " + ciudadanoConvertidoTipo);

		// 5. UNARYoPERATOR
		LOG.info("UNARYoPERATOR ");
		// lambda
		IPersonaUnaryOperator<String> unaryOperator = cadena -> {
			String cadenaFinal = cadena.concat("-Sufijo");
			return cadenaFinal;
		};

		LOG.info("UnaryOperator: " + unaryOperator.aplicar("Daniel"));
*/
		
		//JAVA
		//supplier
		LOG.info("JAVA SUPPLIER: " );
		Stream<String> lista=Stream.generate(() -> "Henry 2").limit(5);
		lista.forEach(cadena->LOG.info(cadena));
		//consummer
		LOG.info("JAVA CONSUMMER: " );
		
			List<Integer> listaNumeros= Arrays.asList(1,2,3,4,5,6);
			listaNumeros.forEach(numero->LOG.info("Valor: "+numero));
		//predicate	
		LOG.info("JAVA PREDICATE: " );
		
	
			Stream<Integer> listaFiltrada=listaNumeros.stream().filter(numero-> numero>=3);
			listaFiltrada.forEach(numero->LOG.info("Valor : "+numero));
		
		LOG.info("JAVA FUNCTION: " );
		Stream<String> listaCambiada=listaNumeros.stream().map(numeroLista->{
			Integer valorFinal=numeroLista+1;
			String cadena="num: "+ valorFinal.toString();
			return cadena;
		});
		
		
		listaCambiada.forEach(cadena-> LOG.info(cadena)); //no existe implemntada en java
		LOG.info("JAVA UNARYoPERATOR: " );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

	
	
	
	
	
}
