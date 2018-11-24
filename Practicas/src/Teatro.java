

import java.util.Scanner;



import interfaceSala.Sala;

public abstract class Teatro extends Local implements Sala {
	private Obra obra;
	private double precio;
	private Espectador[][] localidades;

	public Teatro(String domicilio, int metros, int accesos, Obra obra, double precio) {
		super(domicilio, metros, accesos);
		this.obra = obra;
		this.precio = precio;
		this.localidades = new Espectador[5][10];

	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setLocalidades(Espectador[][] localidades) {
		this.localidades = localidades;
	}

	@Override
	public String verProgramacion() {
		String prog = "";

		prog = "Hoy representamos " + obra.getTitulo() + "," + " genero : " + obra.getGenero() + " Duración : "
				+ obra.getMinutosDuracion() + "\n En " + getDomicilio() + " local de " + getMetros() + " , con "
				+ getAccesos() + " accesos " + "\nPrecio " + getPrecio();
		System.out.println(prog);
		return prog;

	}

	@Override
	public String verLocalidades() {
		String asiento = "";

		for (int i = 0; i < localidades.length; i++) {
			System.out.print("\n" + "\n");

			for (int j = 0; j < localidades[i].length; j++) {
				asiento = " " + i + "." + j;
				String plaza = (this.localidades[i][j] == null) ? " Libre " : " Ocupado ";
				asiento = asiento.concat(plaza);
				System.out.print(asiento);// asi no hay salto de linea

			}
		}
		return asiento;
	}

	@Override
	public String verLocalidadesOcupadas() {

		String texto = null;
		String listado = "";
		

		for (int i = 0; i < localidades.length; i++) {
			for (int j = 0; j < localidades[i].length; j++) {

				if ((localidades[i][j]) != null) {
					Espectador e = localidades[i][j];
					texto = i + "." + j + " " + e.getNombre().toUpperCase() + " Telf : " + e.getTelf() + " , Tipo : "
							+ e.rangoEdad(e.getEdad()).toUpperCase();
					String texto2 = "";
					texto = texto2.concat(texto).concat("\n");
					listado = texto.concat(listado).concat("\n");// lo agreagamos a una lista
					System.out.println(listado);
				} else {
					String sinVenta = "No hemos vendido nada";
					System.out.println(sinVenta);
					return sinVenta;
				}

			}
		}

		return listado;//
	}

	@Override
	public String venderLocalidad(int fila, int butaca, Espectador e) {
		Scanner opt = new Scanner(System.in);

		System.out.println("¿En que fila quieres sentarte? 0-4");
		fila = opt.nextInt();
		System.out.println("¿En que butaca? 0-9");
		butaca = opt.nextInt();
		if (fila >= 5 || butaca >= 10) {
			String nohay = "No disponemos de estos asientos";
			System.out.println(nohay);
			return nohay;
		}
		String locVendida = "";
		Espectador esp = new Espectador();
		setPrecio(30);// lo volvemos a poner a 30 euros

		if (localidades[fila][butaca] != null) {
			String lococu="";
			System.out.println("Localidad ocupada");
			return lococu;
		}

		if (localidades[fila][butaca] == null) {
			this.localidades[fila][butaca] = esp;

			Scanner entrada = new Scanner(System.in);

			System.out.println("¿Como se llama?");
			esp.setNombre(entrada.nextLine());

			System.out.println("¿Su telefono?");
			esp.setTelf(entrada.nextLine());
			System.out.println("¿Cuantos años tienes?");
			esp.setEdad(entrada.nextInt());

		}
		if ("INFANTIL".equalsIgnoreCase(esp.rangoEdad(esp.getEdad()))) {
			setPrecio(getPrecio() - 50 * (getPrecio()) / 100);

		} else if ("MENOR".equalsIgnoreCase(esp.rangoEdad(esp.getEdad()))) {
			setPrecio(getPrecio() - 20 * (getPrecio()) / 100);

		} else if ("MAYOR".equalsIgnoreCase(esp.rangoEdad(esp.getEdad()))) {
			setPrecio((getPrecio()));

		} else if ("JUBILADO".equalsIgnoreCase(esp.rangoEdad(esp.getEdad()))) {
			setPrecio(getPrecio() - 66 * (getPrecio()) / 100);

		}

		locVendida = "Se ha vendido la localidad " + fila + "." + butaca + " a " + esp.getNombre().toUpperCase()
				+ " por " + getPrecio() + " euros ";
		System.out.println(locVendida);
		return locVendida;

	}

	@Override
	public String cancelarLocalidad(int fila, int butaca) {
		Scanner cancelar = new Scanner (System.in);
   		System.out.println("¿Que fila desea cancelar? 0-4");
   		fila=cancelar.nextInt();
   		System.out.println("¿Que butaca desea cancelar? 0-9");
   		butaca=cancelar.nextInt();
   		if (fila>=5 || butaca>=10) {
   		System.out.println("Error al cancelar asiento no disponible");
   		}else {
   			if  ( localidades [fila][butaca] !=null ) 
   		
			this.localidades[fila][butaca]= null;
   		System.out.println("Se ha liberado la localidad");
   		}
		return null;  
   		
		}
	
		@Override
	public String consultarLocalidad(int fila, int butaca) {
		Scanner consultar= new Scanner(System.in);
		System.out.println("¿Qué fila desea consultar?");
		fila = consultar.nextInt();
		System.out.println("¿Qúe butaca desea consultar de la fila " + fila + "?");
		butaca= consultar.nextInt();
		if (fila >=5 || butaca >=9) {
			System.out.println("Error al consultar una localidad inexistente");
		} else  if (localidades[fila][butaca] != null) {
		 System.out.println("La Localidad  está ocupada");
		} else {
			System.out.println("La localidad  está libre");
		}	
			return null;
		}
		
		
		@Override
	public double calcularRecaudacion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
