package ui;

import java.util.Scanner;

import model.Company;

public class Main {

	private Company com;
	private Scanner s;

	public Main() {

		s = new Scanner(System.in);
		com = new Company();

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
				System.out.println("Tipo de documento del usuario es: ");
				System.out.println("1. Cedula de ciudadania.");
				System.out.println("2. Tarjeta de Identidad.");
				System.out.println("3. Pasaporte.");
				System.out.println("4. Cedula Extranjera.");
				int o = Integer.parseInt(s.nextLine());
				String TD = "";
				if (o == 1) {
					TD = com.getTurns().get(0).getUser().CEDULA_DE_CUIDADANIA;
				} else if (o == 2) {
					TD = com.getTurns().get(0).getUser().TARJETA_DE_IDENTIDAD;
				} else if (o == 3) {
					TD = com.getTurns().get(0).getUser().REGISTRO_CIVIL;
				} else if (o == 4) {
					TD = com.getTurns().get(0).getUser().PASAPORTE;
				} else if (o == 5) {
					TD = com.getTurns().get(0).getUser().CEDULA_DE_EXTRANJERIA;
				}
				System.out.println("It is mandatory to enter the first 4 attributes");
				System.out.print("digite numero del documento: ");
				int id = Integer.parseInt(s.nextLine());
				System.out.print("Digite los nombre: ");
				String name = s.nextLine();
				System.out.print("Digite los apellidos: ");
				String lastName = s.nextLine();
				System.out.println("Digite the phone: ");
				int phone = Integer.parseInt(s.nextLine());
				System.out.println("Digite the address: ");
				String address = s.nextLine();
				try {
					com.addUser(TD, id, name, lastName, phone, address);
				} catch(ArithmeticException exce) {
						// falta colocarle la expecion de los primeros 4
				} catch(Exception exce) {
						// falta colocarle la expecion de los primeros 4
				}
				}
				// falta la excepcion de que se vea si ya esta creado el  usuario
				System.out.println("the user has been created correctly");
				break;
			case 2:
				System.out.print("Consultar el documentos: ");
				int ida = Integer.parseInt(s.nextLine());
				int r = com.busquedaUsuario(ida);
				System.out.println("");
				if (com.asignarTurno(r) == true) {
					System.out.println("El Turno asignado para " + com.getTurns().get(r).getUser().getName() + " es:  "
							+ com.getTurns().get(r));
				} else if (com.asignarTurno(r) == false) {
					System.out.print("TD: " + com.getTurns().get(r).getUser().getTD()+ '\n' + "Nombre Completo: " + com.getTurns().get(r).getUser().getName() + '\n' + "Telefono: " + com.getTurns().get(r).getUser().getPhone() + '\n' +  "Asignar Turno dele enter papu");
				}

				break;

			case 3:
				System.out.println("Turno Actual: " + com.contadorTurnoActual());
				System.out.println("Digita alguna de las opciones siguientes: ");
				System.out.println("1. Turno atendido");
				System.out.println("2. Usuario no esta se fue puej");
				int si = Integer.parseInt(s.nextLine());
				if (si == 1) {
					com.turnoAtendido();
					System.out.println("Vuelva Pronto papu!!");
				} else if (si == 2) {
					com.usuarioNoAtendido();
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

}
