package com.emc.one_to_one_uuid;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Principle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// HashMap<UUID, Estudiante> estudianteMap = new HashMap<>();
		Map<UUID, Estudiante> estudianteMap = new HashMap<>();

		Direccion direccion = new Direccion(1, "Calle Prim", "Badalona",
				"Barcelona");

		Estudiante estudiante = new Estudiante(1, "Pepe", "Soto",
				"Curso de Programación", direccion);

		estudianteMap.put(estudiante.getUuid(), estudiante);

		Estudiante estudianteBuscado = estudianteMap.get(estudiante.getUuid());

		System.out.println(estudianteBuscado);
		System.out.println("El uuid es " + estudiante.getUuid());

	}

}
