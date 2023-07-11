package hotel;

public class Cliente extends Personas {

	// atributos
	int idCliente; // con el id se si el cliente ya vino alguna vez
	byte cantPersonas;

	// constructor
	public Cliente(String nombre, String apellido, String genero, String nacionalidad, String ciudad, String dni,
			String domicilio, int idCliente, byte cantPersonas) {
		super(nombre, apellido, genero, nacionalidad, dni, ciudad, domicilio);
		this.idCliente = idCliente;
		this.cantPersonas = cantPersonas;
	}

	// Accedo a los datos con getter

	public int getIdCliente() {
		return idCliente;
	}

	public byte getCantPersonas() {
		return cantPersonas;
	}

}