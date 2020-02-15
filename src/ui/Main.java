package ui;

import java.util.InputMismatchException;
import java.util.Scanner;

import Exception.*;
import model.*;

public class Main {

	private Company com;
	private Scanner s;

	public Main() {

		s = new Scanner(System.in);
		com = new Company();
		try {
			com.addUser("ss", 123, "ca", "es", 123 ,"asa");
		} catch (IdUsedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.showOption();
	}

	private void showMenu() {

		System.out.println("welcome to the shift control system");
		System.out.println("Please enter an option");
		System.out.println("1. Add user.");
		System.out.println("2. Register the turn.");
		System.out.println("3. take turns.");
		System.out.println("4. Exit.");

	}

	private void showOption() {

		boolean e = false;
		while (!e) {
			showMenu();
			int a = Integer.parseInt(s.nextLine());
			switch (a) {
			case 1:
				try {
					casoUno();
				} catch (UnfilledSpacesException e4) {
					e4.getMessage();
					e4.printStackTrace();
				} catch (IdUsedException ece) {
					ece.getMessage();
					ece.printStackTrace();
				} catch (NumberFormatException ee) {
					ee.getMessage();
					ee.printStackTrace();
				} catch (InputMismatchException ee) {
					ee.getMessage();
					ee.printStackTrace();
				} catch (Exception exce) {
					exce.getMessage();
					exce.printStackTrace();
				}
				System.out.println("the user has been created correctly");

				break;
			case 2:
				System.out.print("Consultar el documentos: ");
				int ida = Integer.parseInt(s.nextLine());
				int r = 12413413;
				try {
					r = com.busquedaUsuario(ida);
				} catch (UserNotUnfound e2) {
					e2.getMessage();
					e2.printStackTrace();
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				System.out.println("Resultado de busqueda: ");
				System.out.println("TD                        " + "Nombre Completo     " + "Telefono");
				System.out.println(com.getUsers().get(r).getTD() + "      " + com.getUsers().get(r).getName() + " " + com.getUsers().get(r).getLastName() + "                 " + com.getUsers().get(r).getPhone());
				System.out.print("1. Asignar Turno:  ");
				int en = Integer.parseInt(s.nextLine());
				if (en == 1) {
					String turnoo = "";
					if (com.getTurns() == null) {
						turnoo = com.buscarPrimerTurno();
					} else {
						turnoo = com.inicializarTurno(com.buscarPrimerTurno());
					}
					com.getTurns().add(new Turn(turnoo, true));
					com.getUsers().get(r).getTurnss().add(new Turn(turnoo, true));
					System.out.println("El Turno asignado para " + com.getUsers().get(r).getName()
							+ com.getUsers().get(r).getLastName() + " es:  " + turnoo);
				} else {
					System.out.println("ok.");
				}

				break;

			case 3:
				System.out.println("Turno Actual: " + com.getTurns().get(com.turnoPorAtender()).getTurno());
				System.out.println("Digita alguna de las opciones siguientes: ");
				System.out.println("1. Turno atendido");
				System.out.println("2. Usuario no esta se fue puej");
				int sii = Integer.parseInt(s.nextLine());
				if (sii == 1) {
					com.turnoAtendido(com.turnoPorAtender());
					System.out.println("Vuelva Pronto papu!!");
				} else if (sii == 2) {
					com.usuarioNoAtendido(com.turnoPorAtender());
					System.out.println("Egh este sorucio!!!");
				}
				break;
			case 4:
				e = true;
				System.out.println("Good Bye");

				break;
			}
		}
	}

	public void casoUno()
			throws InputMismatchException, UnfilledSpacesException, IdUsedException, NumberFormatException {
		System.out.println("Tipo de documento del usuario es: ");
		System.out.println("1. Cedula de ciudadania.");
		System.out.println("2. Tarjeta de Identidad.");
		System.out.println("3. Pasaporte.");
		System.out.println("4. Cedula Extranjera.");
		int o = Integer.parseInt(s.nextLine());
		String TD = "";

		if (o == 1) {
			TD = "Cedula de Ciudadania";
		} else if (o == 2) {
			TD = "Tarjeta de Identidad";
		} else if (o == 3) {
			TD = "Registro Civil";
		} else if (o == 4) {
			TD = "Pasaporte";
		} else if (o == 5) {
			TD = "Cedula de Extranjeria";
		}
		System.out.println("It is mandatory to enter the first 4 attributes");
		System.out.print("digite numero del documento: ");
		int id = Integer.parseInt(s.nextLine());
		System.out.print("Digite los nombre: ");
		String name = s.nextLine();
		System.out.print("Digite los apellidos: ");
		String lastName = s.nextLine();
		System.out.print("Digite the phone: ");
		int phone = Integer.parseInt(s.nextLine());
		System.out.print("Digite the address: ");
		String address = s.nextLine();
		if (id == 0) {
			throw new UnfilledSpacesException();
		}
		com.addUser(TD, id, name, lastName, phone, address);

	}
}
