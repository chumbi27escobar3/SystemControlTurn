package model;

import Exception.*;

import java.nio.file.attribute.UserPrincipalNotFoundException;
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

	public String buscarPrimerTurno() {
		String m = "";
		int letra = 0;
		int numero1 = 0;
		int numero2 = 0;
		if (turns.size() == 0) {
			letra = 65;
			numero1 = 0;
			numero2 = 0;
		} else {
			String turn = turns.get(turns.size()).getTurno();
			String[] tunrs = turn.split("");
			letra = Integer.parseInt(tunrs[0]);
			numero1 = Integer.parseInt(tunrs[1]);
			numero2 = Integer.parseInt(tunrs[2]);
		}
		m = (char)letra + numero1 + numero2 + "";
		return m; 
	}

	public String inicializarTurno(String turn) {
		String[] ne = turn.split("");
		int numero1 = Integer.parseInt(ne[1]);
		int numero2 = Integer.parseInt(ne[2]);
		int letraNume = Integer.parseInt((ne[0]));
		String m = "";
		if (letraNume == 90 && numero1 == 9 && numero2 == 9) {
			letraNume = 65;
			numero1 = 0;
			numero2 = 0;
		} else if (numero1 == 9 && numero2 == 9) {
			letraNume++;
			numero2 = 0;
			numero1 = 0;
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
	
	public int turnoPorAtender() {
		int i = 0;
		boolean encontroTurno = false;
		for (int j = 0; j < turns.size() && !encontroTurno; j++) {
			if (turns.get(i).getStatus() == true) {
				i = j;
				encontroTurno = true;
			}
		}
		return i;
	}

	public int busquedaUsuario(int id)throws UserNotUnfound {
		int r = 214312;
		for (int i = 0; i < users.size(); i++) {
			if (users.get(i).getId() == id) {
				r = i;
			}
		}
		if (r == 214312) {
			throw new UserNotUnfound();
		}
		return r;
	}

	public void turnoAtendido(int i) {
		turns.get(i).setAtendido(true);
	}

	public void usuarioNoAtendido(int i) {
		turns.get(i).setAtendido(false);
	}
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
