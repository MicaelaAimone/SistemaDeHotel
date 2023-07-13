package hotel;

//import hotel.Habitacion;
//import hotel.Cliente;

public class Reserva{

	//atributos
	int idReserva;
	int infoCliente; //idcliente
	int infoHabitacion; //idhabitacion
	//fechaInicio = checkIn; java time
	//fechaFin = checkout; java time
	
	//constructor
	public Reserva( int idReserva, int infoCliente, int infoHabitacion) {
		this.idReserva = idReserva;
		this.infoCliente = infoCliente;
		this.infoHabitacion = infoHabitacion;

	}	
	
	//Accedo a los datos con getter
	

	public int getIdReserva() {
		return idReserva;
	}

	public int getInfoCliente() {
		return infoCliente;
	}

	public int getInfoHabitacion() {
		return infoHabitacion;
	}
	
	


}