
public class Principal {
	public static void main (String[]args) {
		//creamos o instanciamos objetos de las clases
		Profesor prof1 = new Profesor ("516632211R","Carlos Robles","C/Pez Volador,35","616669922","Matematicas y Lenguaje");
		Alumno alum1 = new Alumno ("532224411A","Alicia Torres","C/ Luna Lunera,45","639889999","Grado Superior Infierno Programacion")	;
		Administrativo adm1 = new Administrativo("123454411B","Rosa León","C/Montera,14","639043353","Hacer matriculas , controlar asistencias");
		
	System.out.println("--------------------Ejecutar metodo toString sobre cada uno de los objetos creados ------------------------------------");
		System.out.println(prof1.toString());
		System.out.println(alum1.toString());
		System.out.println(adm1.toString());
	System.out.println();	
		
	System.out.println("--------------------Ejecutar metodo trabajar() sobre cada uno de los objetos creados-----------------------------------");	
		System.out.println(prof1.trabajar());
		System.out.println(alum1.trabajar());
		System.out.println(adm1.trabajar());
		System.out.println();
		
	System.out.println("--------------------Ejecuta el método llamar(Persona p) para que el alumno llame al profesor.--------------------------");
	
		System.out.println (alum1.llamar(prof1));
	
	System.out.println();
	System.out.println ("--------------------Ejecuta el método ponerNotas() del objeto Profesor.------------------------------------------------");
	
		System.out.println(prof1.ponerNotas());
		
	System.out.println();
	System.out.println("---------------------Ejecuta el método hacerExamen() del objeto Alumno.-------------------------------------------------");

			System.out.println(alum1.hacerExamen());
	
	System.out.println();
	System.out.println("---------------------Ejecuta el método gestionarMatricula() del objeto Administrativo.----------------------------------");

			System.out.println(adm1.gestionarMatricula());
	}
	}


