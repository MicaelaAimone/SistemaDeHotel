package main;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;

public class App {

	//ESCRIBIR UN ARCHIVO JSON
	public static void grabar(JSONArray array) { // recibe un JSON Array
		try {
			FileWriter file = new FileWriter("test.json");
			file.write(array.toString()); // invoco para poder escribir en el archivo y con el .tostring lo convierto
											// todo en texto
			file.flush(); // limpio memoria
			file.close(); // cierro archivo y q se guarde

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}
