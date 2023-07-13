package archivosEyL;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONTokener;


public class JSONUtil{
 

	// ESCRIBIR UN ARCHIVO JSON
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
	
	
	

	// Leer
	public static JSONTokener leer(String archivo) {
		//json tokener permite abrir un arhivo json por medio del file reader
		JSONTokener tokener = null; 
		try {
			tokener = new JSONTokener(new FileReader(archivo));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return tokener;
	}

}