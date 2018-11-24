
import java.util.Scanner;



public class Principal {

	private static Scanner lector;

	private static Obra obra =

			new Obra("La cena de los idiotas", "Comedia", 95);

	private static Teatro teatro = new Teatro("C/ Sol, 45", 300, 2, obra, 30);

	public static void main(String[] args) {

		lector = new Scanner(System.in);

		char opc;

		do {

			opc = mostrarMenu();

			int fila = 0;
			int butaca = 0;
			Espectador e = null;
			switch (opc) {

			case '1':
				teatro.verProgramacion();
				break;
			case '2':
				teatro.verLocalidades();
				System.out.println("\n");
				break;

			case '3':
				teatro.verLocalidadesOcupadas();
				break;

			case '4':
				teatro.venderLocalidad(fila, butaca, e);
				break;
			case '5':
				teatro.cancelarLocalidad(fila, butaca);
				break;
			case '6':
				teatro.consultarLocalidad(fila, butaca);
				break;
			case '7':
				teatro.calcularRecaudacion();
				break;
			case '8':
				System.out.println("\n" + "Hasta pronto");
				break;
			default:

			}

		} while (opc != '8');

		lector.close();

	}

	public static char mostrarMenu() {

		String opcion;

		System.out.println("TEATRO LA BOMBILLA DE DON BLAS");

		System.out.println("------------------------------");

		System.out.println("1. Ver la programación actual");

		System.out.println("2. Mostrar todas las localidades");

		System.out.println("3. Mostrar localidades ocupadas");

		System.out.println("4. Vender localidad");

		System.out.println("5. Cancelar localidad");

		System.out.println("6. Consultar localidad");

		System.out.println("7. Calcular recaudación");

		System.out.println("8. Terminar programa");

		System.out.println("------------------------------");

		System.out.println("¿Qué opción deseas?");

		opcion = lector.nextLine();

		return opcion.charAt(0); // Devuelvo el primer caracter tecleado.

	}

}