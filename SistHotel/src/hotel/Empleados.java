package hotel;

public class Empleados extends Personas {

	// atributos
	byte idPersonal;
	float sueldo;
	int horasSemanales;
	String estado;

	// constructor
	public Empleados(String nombre, String apellido, String genero, String nacionalidad, String ciudad, String dni,
			String domicilio, byte idPersonal, float sueldo, int horasSemanales, String estado) {
		super(nombre, apellido, genero, nacionalidad, ciudad, dni, domicilio);
		this.idPersonal = idPersonal;
		this.sueldo = sueldo;
		this.horasSemanales = horasSemanales;
		this.estado = estado;
	}

	// Accedo a los datos con getter

	public byte getIdPersonal() {
		return idPersonal;
	}

	public float getSueldo() {
		return sueldo;
	}

	public int getHorasSemanales() {
		return horasSemanales;
	}

	public String getEstado() {
		return estado;
	}

	@Override
	public String toString() {
		return "Empleados [idPersonal=" + idPersonal + ", sueldo=" + sueldo + ", horasSemanales=" + horasSemanales
				+ ", estado=" + estado + "]";
	}
	
	
}
