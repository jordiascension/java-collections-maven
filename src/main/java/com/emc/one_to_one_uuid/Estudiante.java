package com.emc.one_to_one_uuid;

import java.util.UUID;

public class Estudiante {

	private UUID uuid;
	private Integer id;
	private String nombre;
	private String apellidos;
	private String curso;
	// Relación 1 a 1
	private Direccion direccion;

	public UUID getUuid() {
		return uuid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public Estudiante() {
		this.uuid = java.util.UUID.randomUUID();
	}

	public Estudiante(Integer id, String nombre, String apellidos, String curso,
			Direccion direccion) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.direccion = direccion;

	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Estudiante [uuid=");
		builder.append(uuid);
		builder.append(", id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellidos=");
		builder.append(apellidos);
		builder.append(", curso=");
		builder.append(curso);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}

}
