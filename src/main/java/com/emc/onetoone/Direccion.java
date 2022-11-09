package com.emc.onetoone;

public class Direccion {

	private int id;
	private String calle;
	private String poblacion;
	private String provincia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Direccion(int id, String calle, String poblacion, String provincia) {
		super();
		this.id = id;
		this.calle = calle;
		this.poblacion = poblacion;
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [id=");
		builder.append(id);
		builder.append(", calle=");
		builder.append(calle);
		builder.append(", poblacion=");
		builder.append(poblacion);
		builder.append(", provincia=");
		builder.append(provincia);
		builder.append("]");
		return builder.toString();
	}

}
