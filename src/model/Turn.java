package model;

public class Turn {

	private String turno;
	private boolean status;
	private boolean atendido;
	
//	relacion
	private User user;

	public Turn(String turno, boolean status) {
		
		this.turno = turno;
		this.status = status;
		
	}

	public boolean getAtendido() {
		return atendido;
	}

	public void setAtendido(boolean atendido) {
		this.atendido = atendido;
	}



	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public boolean getStatus() {
		return false;
	}

	public boolean setStatus(boolean status) {
		return true;
	}

	@Override
	public String toString() {
		return "Turn [turno=" + turno + ", status=" + status + "]";
	}	

	
	
}
