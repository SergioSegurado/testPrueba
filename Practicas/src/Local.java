

public class Local {
	
	private String domicilio;
	private int metros;
	private int accesos;
	public Local(String domicilio, int metros, int accesos) {
	
		this.domicilio = domicilio;
		this.metros = metros;
		this.accesos = accesos;
	}
	public String getDomicilio() {
		return domicilio;
	}
	public int getMetros() {
		return metros;
	}
	public int getAccesos() {
		return accesos;
	}

}
