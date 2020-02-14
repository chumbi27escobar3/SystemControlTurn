package model;

import java.util.ArrayList;

public class User {

	//Constantes
	public static final String CEDULA_DE_CUIDADANIA = "Cedula de cuidadania";
	public static final String TARJETA_DE_IDENTIDAD = "Tarjeta de Identidad";
	public static final String REGISTRO_CIVIL = "Registro Civil";
	public static final String PASAPORTE = "Pasaporte";
	public static final String CEDULA_DE_EXTRANJERIA = "Cedula de Extranjeria";

	//Atributos
	private int id;
	private String name;
	private String lastName;
	private int phone;
	private String address;
	private String TD;

	//Relations
	private ArrayList<Turn> turnss;

	public User(String TD, int id, String name, String lastName, int phone, String address) {

		this.TD = TD;
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;

		turnss = new ArrayList<Turn>();
	}

	public ArrayList<Turn> getTurnss() {
		return turnss;
	}

	public void setTurnss(ArrayList<Turn> turnss) {
		this.turnss = turnss;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTD() {
		return TD;
	}

	public void setTD(String tD) {
		TD = tD;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", lastName=" + lastName + ", phone=" + phone + ", address="
				+ address + ", TD=" + TD + "]";
	}

}
