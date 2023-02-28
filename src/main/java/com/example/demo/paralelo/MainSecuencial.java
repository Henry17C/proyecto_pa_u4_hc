package com.example.demo.paralelo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainSecuencial {

	public static void main(String[] args) {
	
		List<Integer> idEstudiantes= new ArrayList<Integer>();
		
		for(int i=1;i<=10;i++) {
			
			idEstudiantes.add(i);
		}
		
		idEstudiantes.forEach(numero->System.out.println("Estudiante: "+numero));
		
		//Programacion en un unico hilo
		//procesar cada estudinate
		
		long tiempoInicial=System.currentTimeMillis();
		List<String> listaFinal= new ArrayList<>();
		for(Integer id: idEstudiantes) {
			procesarIdEstuduante(id);
	
		
		}
		long tiempoFinal=System.currentTimeMillis();
		long tiempoTrascurrido=(tiempoFinal-tiempoInicial)/1000;
		
		
		listaFinal.forEach(cadena-> System.out.println(cadena));
		
		System.out.println("tiempo TRascurrido en segundos: "+tiempoTrascurrido);
		

		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	public static void procesarIdEstuduante(Integer idEstudiante) {
		
		
		//convetir a sTring
		String idConvertido= "E"+idEstudiante.toString();
		//Insertar en la base
		
		System.out.println("Insertabdo Estudinate: "+idConvertido+"| Hilo:"+Thread.currentThread().getName());
		//1Segundo
		 try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	

}
