package model;

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

	public void addTurn(int id) {
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == id && users.get(i).getTurnss().get(i).getStatus() == false) {
//				users.get(i).getTurnss().get(i).setTurno(turno);
			}
		}
	}

	public String inicializarTurno(String turn) {
		String[] ne = turn.split("");
		int numero1 = Integer.parseInt(ne[1]);
		int numero2 = Integer.parseInt(ne[2]);
		int letraNume = (int)(ne[0].charAt(0));
		String m = "";
		if (numero2 == 9) {
			numero1++;
		}
		if (numero1 == 9 && numero2 == 9) {
			letraNume++;
		}
		m = (char)letraNume + numero1 + numero2 + "";
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
