package model;

import Exception.*;
import java.util.ArrayList;

public class Company {

	private ArrayList<Turn> turns;
	private ArrayList<User> users;

	public Company() {
		users = new ArrayList<User>();
		turns = new ArrayList<Turn>();
	}

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}

	public ArrayList<Turn> getTurns() {
		return turns;
	}

	public void setTurns(ArrayList<Turn> turns) {
		this.turns = turns;
	}

	public String inicializarTurno(String turn) {
		String[] ne = turn.split("");
		int numero1 = Integer.parseInt(ne[1]);
		int numero2 = Integer.parseInt(ne[2]);
		int letraNume = Integer.parseInt((ne[0]));
		String m = "";
		if (numero1 == 9 && numero2 == 9) {
			letraNume++;
		} else if (letraNume == 90 && numero1 == 9 && numero2 == 9) {
				letraNume = 65;
		} else if (numero2 == 9) {
				numero1++;
				numero2 = 0;
		} else {
			numero2++;
		}
		
		m = (char)letraNume + numero1 + numero2 + "";
		return m;
	}

	public void addUser(String TD, int id, String name, String lastName, int phone, String address)
			throws IdUsedException {
		boolean encontro = false;
		for (int i = 0; i < users.size() && !encontro; i++) {
			if (users.get(i).getId() == id) {
				encontro = true;
			}
		}
		if (encontro == false) {
			users.add(new User(TD, id, name, lastName, phone, address));
		} else if (encontro == true) {
			throw new IdUsedException();
		}
	}
	
	public String darUltimoTurn() {
		String m = "";
		m = turns.get(turns.size()) + "";
		return m;
	}

//		for (int i = 0; i < turns.size(); i++) {
//			m = (char) letraNume + "";
//						numero2++;
//			if (numero2 == 9) {
//				numero1++;
//			}
//			if (numero1 == 9 && numero2 == 9) {
//				letraNume++;
//			}
//
//		}
//
//		return m;
//	}

//	public boolean asignarTurno(int t) {
//		boolean r = false;
//		if (turns.get(t).getStatus() == true) {
//			r = true;
//		}
//		return r;
//	}
//
//
//	public int busquedaUsuario(int id) {
//		int r = 0;
//		for (int i = 0; i < turns.size(); i++) {
//			if (turns.get(i).getUser().getId() == id) {
//				r = i;
//			}
//		}
//		return r;
//	}
//
//	public String contadorTurnoActual() {
//		String m = "";
//		return m;
//	}
//
//	public void turnoAtendido() {
//
//	}
//
//	public void usuarioNoAtendido() {
//
//	}
//
//	public int unicoId(int p) {
//		boolean oe = false;
//		int e = 0;
//		for (int i = 0; i < turns.size() && !false; i++) {
//			if (turns.get(i).getUser().getId() == p) {
//				new throw UsuarioYaCreado; 	pillar como crear la excepcion y que la coga y la pase y que en el main ya la coga correctamente
//				oe = true;
//
//			} else {
//				return p;
//			}
//		}
//		return e;
//	}

}
