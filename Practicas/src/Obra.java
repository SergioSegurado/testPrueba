

public class Obra {
	
	private String titulo;
	private String genero;
	private int minutosDuracion;
	public Obra(String titulo, String genero, int minutosDuracion) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.minutosDuracion = minutosDuracion;
	}
	
	
	public String getTitulo() {
		return titulo;
	}


	public String getGenero() {
		return genero;
	}


	public int getMinutosDuracion() {
		return minutosDuracion;
	}


	@Override
	public String toString() {
		return "Obra [titulo=" + titulo + ", genero=" + genero + ", minutosDuracion=" + minutosDuracion + "]";
	}
	
}
