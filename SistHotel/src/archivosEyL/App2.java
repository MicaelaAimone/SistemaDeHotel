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
		System.out.println("Las habitaciones disponibles son:");
		for (int i = 0;i < arreglo.length();i++) {
			JSONObject objeto;
			try {
				
				objeto = arreglo.getJSONObject(i);
				int numero = objeto.getInt("numero");
				boolean ocupado = objeto.getBoolean("ocupado");
				int estado = objeto.getInt("estado"); 
				
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
		System.out.println("Las habitaciones no disponible son:");
		for (int i = 0;i < arreglo.length();i++) {
			JSONObject objeto;
			try {
				objeto = arreglo.getJSONObject(i);
				int numero = objeto.getInt("numero");
				boolean ocupado = objeto.getBoolean("ocupado");
				int estado = objeto.getInt("estado");
				
				if (ocupado == false) { //comprueba que este ocupada
					if (estado != 1 ) {
						num+=1;
						String motivo = detallarMotivo(estado);
						System.out.println(numero + ". Motivo: " + detallarMotivo(estado));
					} 
					} else {
						num+=1;
						System.out.println("La habitacion " + numero + " esta ocupada");
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (num==0) {
			System.out.println("Todas las habitaciones estan disponibles");
		}
	}
	
	public static String detallarMotivo(int i) { // pasa de numero a string el estado
		switch (i) {
		case 2: 
			return "reparacion";
		case 3:
			return "desinfeccion";
		case 4: 
			return "limpieza";
		default: return null;
		}
	}
}