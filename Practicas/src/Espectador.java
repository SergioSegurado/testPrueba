

public class Espectador {
	private String nombre;
	private String telf;
	private int edad;
	public Espectador(String nombre, String telf, int edad) {
		
		this.nombre = nombre;
		this.telf = telf;
		this.edad = edad;
	}
	public Espectador() {

}
	public String rangoEdad(int edad) {
			String rango;
			if (edad>=65) {
				rango="Jubilado";
				return rango;}
				else if( (edad>=18) && (edad<=65)) {
					rango="Mayor";
					return rango;}
					else if ((edad>=13) && (edad<=17)) {
						rango="Menor";
						return rango;}
						else 
							rango="Infantil";
							return rango;
			}
	
	public String toString() {
	return"";
}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTelf() {
		return telf;
	}
	public void setTelf(String telf) {
		this.telf = telf;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}