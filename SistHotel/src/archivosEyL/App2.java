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

	}
}
