package Modelo;

public class Pelicula {
	
	private int idPelicula;
	private String nombre;
	
	public Pelicula(int id, String nombre)
	{
		setIdPelicula(id);
		setNombre(nombre);
	}

	public int getIdPelicula() {
		return idPelicula;
	}

	public void setIdPelicula(int idPelicula) {
		this.idPelicula = idPelicula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

		
	
}
