package archivosEyL;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import archivosEyL.JSONUtil;

public class App2 {
	public static void main(String[] args) {

		try {
			JSONArray jsonArrayClientes  = new JSONArray(JSONUtil.leer("../Clientes.json")); 

			for (int i = 0; i < jsonArrayClientes.length(); i++) {
				JSONObject jsonObjectClientes = jsonArrayClientes.getJSONObject(i);
				System.out.println("Nombre: " + jsonObjectClientes.getString("nombre"));
				System.out.println("Apellido: " + jsonObjectClientes.getString("apellido"));
				System.out.println("Genero: " + jsonObjectClientes.getString("genero"));
				System.out.println("Nacionalidad: " + jsonObjectClientes.getString("nacionalidad"));
				System.out.println("Ciudad: " + jsonObjectClientes.getString("ciudad"));
				System.out.println("DNI: " + jsonObjectClientes.getInt("dni"));
				System.out.println("Domicilio: " + jsonObjectClientes.getString("domicilio"));
				System.out.println("idClientes: " + jsonObjectClientes.getInt("idClientes"));
				System.out.println("cantPersonas: " + jsonObjectClientes.getInt("cantPersonas"));

				System.out.println("-------------------------------------------");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		

		try {
			JSONArray jsonArrayHabitaciones = new JSONArray(JSONUtil.leer("../Habitaciones.json"));

			for (int i = 0; i < jsonArrayHabitaciones.length(); i++) {
				JSONObject jsonObjectHabitaciones = jsonArrayHabitaciones.getJSONObject(i);
				System.out.println("Numero: " + jsonObjectHabitaciones.getInt("numero"));
				System.out.println("Ocupado: " + jsonObjectHabitaciones.getBoolean("ocupado"));
				System.out.println("Estado: " + jsonObjectHabitaciones.getInt("estado"));

				System.out.println("-------------------------------------------");
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		JSONArray jsonArrayHabitaciones;
		jsonArrayHabitaciones = crearArrayHabitaciones();
		mostrarDisponibles(jsonArrayHabitaciones);
	}
	
	public static JSONArray crearArrayHabitaciones() { //pasa de json a un JSONArray 
		try {
			JSONArray Array = new JSONArray(JSONUtil.leer("../Habitaciones.json"));
			return Array;
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return null;		
	}
	
	public static void mostrarDisponibles(JSONArray arreglo) {
		int num=0;
		for (int i = 0;i < arreglo.length();i++) {
			JSONObject objeto;
			try {
				
				objeto = arreglo.getJSONObject(i);
				int numero = objeto.getInt("numero");
				boolean ocupado = objeto.getBoolean("ocupado");
				int estado = objeto.getInt("estado"); 
				
				System.out.println("Las habitaciones disponibles son:");
				if (ocupado == false ) { //comprueba que no este ocupada
					if (estado == 1) { //comprueba que sea habitable
						num+=1;
						System.out.print(numero + ". ");
					}
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		if (num==0) {
			System.out.println("No hay habitaciones disponibles");
		}
	}
	
	public static void mostrarNoDisponibles(JSONArray arreglo) {
		int num=0;
		for (int i = 0;i < arreglo.length();i++) {
			JSONObject objeto;
			try {
				objeto = arreglo.getJSONObject(i);
				int numero = objeto.getInt("numero");
				boolean ocupado = objeto.getBoolean("ocupado");
				int estado = objeto.getInt("estado");
				
				if (ocupado == true) { //comprueba que este ocupada
					if (estado != 1 ) {
						String motivo = detallarMotivo(estado);
						System.out.println(numero + ". Motivo: " + detallarMotivo(estado));
					}
				} else {
					
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static String detallarMotivo(int i) { // pasa de numero a string el estado
		switch (i) {
		case 2: 
			return "reparación";
		case 3:
			return "desinfección";
		case 4: 
			return "limpieza";
		default: return null;
		}
	}
}