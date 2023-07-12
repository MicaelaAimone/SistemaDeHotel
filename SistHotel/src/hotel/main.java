package hotel;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		boolean salir = false;
		int opcion = 0;
		int eleccion = 0;

		do {

			System.out.println("Bienvenido, ingrese la opcion que desea realizar");
			System.out.println("1. Reservar");
			System.out.println("2. Habitaciones");
			System.out.println("3. Clientes");
			System.out.println("4. Empleados");
			System.out.println("5. Check in/Check out");
			System.out.println("6. Salir");

			try {
				opcion = tc.nextInt();

				switch (opcion) {
				case 1:
					salir = false;
					System.out.println("Elegiste reservas");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Hacer una nueva reserva");
					System.out.println("2. Ver una reserva");
					System.out.println("3. Volver al menu");
					eleccion = tc.nextInt();
					break;

				case 2:
					salir = false;
					System.out.println("Elegiste habitaciones");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Lista de habitaciones disponibles"); //mostramos tipos d habitaciones y precios
					System.out.println("2. Lista de habitaciones ocupadas");
					System.out.println("3. Volver al menu");
					eleccion = tc.nextInt();
					break;

				case 3:
					salir = false;
					System.out.println("Elegiste clientes");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Mirar mis datos y reservas");
					System.out.println("2. Actualizar mis datos");
					System.out.println("3. Volver al menu");
					eleccion = tc.nextInt();
					break;

				case 4:
					salir = false;
					System.out.println("Elegiste empleados");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Buscar datos de un empleado");
					System.out.println("2. Listar empleados");
					//System.out.println("3. Agregar/sacar empleados");
					System.out.println("3. Volver al menu");
					eleccion = tc.nextInt();
					break;

				case 5:
					salir = false;
					System.out.println("Elegiste check in/check out");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Check in");
					System.out.println("2. Check out");
					System.out.println("3. Volver al menu");
					eleccion = tc.nextInt();
					break;

				case 6:
					salir = true;
					break;

				default:
					System.out.println("Solo números entre 1 y 6");
				} // fin switch

			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un numero");
				tc.next();
			} // fin try

		} while (!salir && (opcion == 6)); // fin while

	} // fin main
}
