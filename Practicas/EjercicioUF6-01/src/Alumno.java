
public class Alumno extends Persona {
	private String curso;
	
	//Constructor de la clase Persona mas clase Alumno
	public Alumno (String nif,String nombre,String direccion,String telefono,String curso) {
		super(nif,nombre,direccion,telefono);
		this.curso = curso;
	}
	
	
	//set and get de la clase Alumno
	
	public void setCurso (String curso) {
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}
	
	
	//sobreescribir método abstracto trabajar de la clase Persona
	@Override
	public String trabajar() {
		return "El alumno " + this.getNombre() + " va a estudiar para el " + this.getCurso();
	}
	
	//metodo propio de la clase Alumno
	public String hacerExamen() {
		return "El alumno " + this.getNombre() + " va a hacer su examen.";
	}

	//sobreescribir método toString
	@Override
	public String toString() {
		String mensaje = "Alumno" + "[nif=" + this.getNif() + ",nombre=" + this.getNombre() + ",direccion=" + this.getDireccion() +
				",telefono=" + this.getTelefono() + "]" + "Cursando: " + this.getCurso();
		return mensaje;
	}
	
}
