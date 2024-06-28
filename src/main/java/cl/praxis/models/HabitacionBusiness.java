package cl.praxis.models;

import cl.praxis.models.Habitacion;
import java.util.ArrayList;
import java.util.List;

public class HabitacionBusiness {
	
	private List<Habitacion> habitaciones;
	
	public HabitacionBusiness() {
		
		habitaciones = new ArrayList<>();
		
		habitaciones.add(new Habitacion(1, "Habitación Simple", "1 dormitorio con 1 cama de 2 plazas y 1 baño.", "simple.jpg", 80000, 1, 20));
		habitaciones.add(new Habitacion(2, "Habitación Doble", "1 dormitorio, 2 camas de 2 plazas, 2 baños.", "doble.jpg", 160000, 1, 40));
		habitaciones.add(new Habitacion(3, "Habitación Premium", "2 dormitorios, 1 cama de 2 plazas cada uno, 2 baños.", "doblePremium.jpg", 190000, 2, 60));
		habitaciones.add(new Habitacion(4, "Habitación Individual", "1 dormitorio, 1 cama de 1 plaza, 1 baño.", "individual.png", 65000, 1, 20));
	
	}
	
	public List<Habitacion> obtenerHabitaciones() {
		return habitaciones;
	}
	
	public Habitacion obtenerHabitacionesSegunID(int id) {
		for (Habitacion habitacion : habitaciones) {
			if(habitacion.getId() == id) {
				return habitacion;
			}
		}
		return null; //
	}
	
	public void agregarHabitacion (Habitacion habitacion) {
		habitaciones.add(habitacion);
	}
	
	public void eliminarHabitaciones(int id) {
		habitaciones.removeIf(habitacion -> habitacion.getId() == id);
	}
	
	public void actualizarHabitacion (Habitacion habitacionActualizada) {
		for (Habitacion habitacion : habitaciones) {
			if (habitacion.getId() == habitacionActualizada.getId()) {
				habitacion.setNombre(habitacionActualizada.getNombre());
				habitacion.setDescripcion(habitacionActualizada.getDescripcion());
				habitacion.setImagen(habitacionActualizada.getImagen());
				habitacion.setPrecio(habitacionActualizada.getPrecio());
				habitacion.setHabitaciones(habitacionActualizada.getHabitaciones());
				habitacion.setMetraje(habitacionActualizada.getMetraje());
			}
		}
	}
}
