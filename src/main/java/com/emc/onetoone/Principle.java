package com.emc.onetoone;

import java.util.HashMap;

public class Principle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, Estudiante> estudianteMap = new HashMap<>();
		// Map<Integer, Estudiante> estudianteMap2 = new HashMap<>();

		Direccion direccion = new Direccion(1, "Calle Prim", "Badalona",
				"Barcelona");

		Estudiante estudiante = new Estudiante(1, "Pepe", "Soto",
				"Curso de Programación", direccion);

		estudianteMap.put(estudiante.getId(), estudiante);

		Estudiante estudianteBuscado = estudianteMap.get(1);

		System.out.println(estudianteBuscado);

	}

}
