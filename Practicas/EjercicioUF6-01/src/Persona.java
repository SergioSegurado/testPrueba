	//clase Persona abstracta
public abstract class  Persona {
	// propiedades abstractas de la clase Persona
	
	private String nif;
	private String nombre;
	private String direccion;
	private String telefono;
	
	
	//constructor de la clase Padre de Persona
	public Persona(String nif, String nombre, String direccion, String telefono) {
		super();
		this.nif = nif;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	// constructor por defecto
	public Persona () {
		
	}

	// getter and setter de la clase persona
	public void setNif (String nif) {
		this.nif = nif;
	}

	public String  getNif() {
		return nif;
	}
	 
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	
	public void setdireccion (String direccion) {
		this.direccion = direccion;
	}
	public String getDireccion () {
		return direccion;
	}
	
	public void setTelefono (String telefono) {
		this.telefono = telefono;
	}
	public  String getTelefono() {
		return telefono;
	}
	
	//  crear metodos de la clase Persona
	
	public  String llamar (Persona p) {
		return this.nombre + " llamando a " + p.nombre;
	}
	
	public String toString() {
		return null;
	}
		
	
	 // metodo asbtracto que debemos especializar en cada clase
	public abstract String trabajar();
	

		
	
}
