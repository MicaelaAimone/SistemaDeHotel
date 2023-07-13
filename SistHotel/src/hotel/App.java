package hotel;

//import hotel.Cliente;
//import hotel.ControladorImpl;
//import hotel.Empleados;
//import hotel.Habitacion;
//import hotel.Personas;
//import hotel.Reserva;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);

		boolean salir = false;
		int opcion = 0;

		while ( !salir ) {
			System.out.println("Bienvenido, ingrese la opcion que desea realizar");
			System.out.println("1. Reservar");
			System.out.println("2. Habitaciones");
			System.out.println("3. Clientes");
			System.out.println("4. Empleados");
			System.out.println("5. Check in/Check out");
			System.out.println("6. Salir");

			opcion = tc.nextInt();
			try {

				switch (opcion) {
				case 1:
					salir = false;
					int opcionReserva;
					System.out.println("Elegiste reservas");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Hacer una nueva reserva");
					System.out.println("2. Ver una reserva");
					System.out.println("3. Volver al menu");
					opcionReserva = tc.nextInt();
					switch (opcionReserva) {
					case 1:
						System.out.println("reserva nuevaa");
						break;
					case 2:
						System.out.println("viendo reservas");
						break;
					}
					break;

				case 2:
					salir = false;
					int opcionHabitacion;
					System.out.println("Elegiste habitaciones");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Lista de habitaciones disponibles"); // mostramos tipos d habitaciones y
																				// precios
					System.out.println("2. Lista de habitaciones ocupadas");
					System.out.println("3. Volver al menu");
					opcionHabitacion = tc.nextInt();
					switch (opcionHabitacion) {
					case 1:
						System.out.println("opciones disp");
						break;
					case 2:
						System.out.println("opciones ocupadas");
						break;
					}
					break;

				case 3:
					salir = false;
					int opcionClientes;
					System.out.println("Elegiste clientes");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Mirar mis datos y reservas");
					System.out.println("2. Actualizar mis datos");
					System.out.println("3. Volver al menu");
					opcionClientes = tc.nextInt();
					switch (opcionClientes) {
					case 1:
						System.out.println("datitos y reserva");
						break;
					case 2:
						System.out.println("actualizar datitos");
						break;
					}
					break;

				case 4:
					salir = false;
					int opcionEmpleados;
					System.out.println("Elegiste empleados");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Buscar datos de un empleado");
					System.out.println("2. Listar empleados");
					// System.out.println("3. Agregar/sacar empleados");
					System.out.println("3. Volver al menu");
					opcionEmpleados = tc.nextInt();
					switch (opcionEmpleados) {
					case 1:
						System.out.println("datitos empleado");
						break;
					case 2:
						System.out.println("listado empleados");
						break;
					}
					break;

				case 5:
					salir = false;
					int opcionCheck;
					System.out.println("Elegiste check in/check out");
					System.out.println("Que deseas hacer? Selecciona una opcion");
					System.out.println("1. Check in");
					System.out.println("2. Check out");
					System.out.println("3. Volver al menu");
					opcionCheck = tc.nextInt();
					switch (opcionCheck) {
					case 1:
						System.out.println("check in");
						break;
					case 2:
						System.out.println("check out");
						break;
					}
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

		} // fin do

		System.out.println("Ya esta fuera del menu");
		tc.close();

	} // fin main
}
