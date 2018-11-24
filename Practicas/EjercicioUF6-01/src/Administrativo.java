
public class Administrativo extends Persona{
	private String tareas;
	
	
	//constructor de la clase hererada Persona mas Clase Administrativo
	public Administrativo (String nif,String nombre,String direccion,String telefono,String tareas ) {
	super(nif,nombre,direccion,telefono);
	this.tareas =tareas;
	
	}
	
	//set and get Clase Administrativo
	
	public void setTareas(String tareas) {
		this.tareas = tareas;
	}
	public String getTareas() {
		return tareas;
	}
	
	//sobreescribir método abstracto trabajar de la clase Persona
	public String trabajar () {
		return "El administrativo " + this.getNombre() + " va a realizar estas " + this.getTareas() + " :hacer matriculas,controlar asistencia";
	}
	
	//metodo propio de la clase Profesor
	
	public String gestionarMatricula() {
		return "El administrativo " + this.getNombre() + " va a gestionar una matricula.";
	}

	
	
	
	//sobreescribir método toString
	
@Override
	public String toString() {
		String mensaje = "Administrativo [nif=" + this.getNif() + ",nombre= " + this.getNombre() + ",direccion=" + this.getDireccion() +
				",telefono=" + this.getTelefono() + "]";
		return mensaje;
		
	}
	
}
