	
public class Profesor extends Persona {
	private String competencias;
	
	//constructores de la clase heredada mas de la clase Profesor
	public Profesor(String nif, String nombre, String direccion, String telefono, String competencias) {
		super(nif, nombre, direccion, telefono);
		this.competencias = competencias;
	}

	
	
	// set and get de la clase Profesor
	public String getCompetencias() {
		return competencias;
	}
	
	public void setCompetencias(String competencias) {
		this.competencias = competencias;
	}


	
	//sobreescribir método abstracto trabajar de la clase Persona
	@Override
	public String trabajar() {
		return "El profesor " + this.getNombre() + " va a impartir su clase.";
	}
	
	//metodo propio de la clase Profesor
	public String ponerNotas() {
		return "El profesor " +this.getNombre() + " va a corregir los exámenes.";
		
	}


	//sobreescribir método toString
	@Override
	public String toString() {
		 String mensaje = "Profesor [nif=" + this.getNif() + ",nombre=" +this.getDireccion() + ",telefono=" + this.getTelefono() +"]" 
				 + "Competencias: " + this.getCompetencias();
		 return mensaje;
	}



	
	
	
	
	
	
}
