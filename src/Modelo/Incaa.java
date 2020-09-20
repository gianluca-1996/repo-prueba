package Modelo;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Incaa {
	
	private List<Pelicula> catalogo;
	
	public Incaa() {
	
		setCatalogo(new ArrayList<Pelicula>());
	}

	public List<Pelicula> getCatalogo() {
		return catalogo;
	}

	public void setCatalogo(List<Pelicula> catalogo) {
		this.catalogo = catalogo;
	}
	
	
	//metodo para agregar una nueva pelicula al catalogo. Si ya existe se lanza la excepcion
	public boolean agregarPelicula(String nombre) throws Exception{
		
		Random idRandom = new Random();
		for(Pelicula dato : catalogo)
		{
			if(dato.getNombre().contains(nombre))
				throw new Exception("La pelicula ya se encuentra en el catalogo");
		}
				
		getCatalogo().add(new Pelicula(idRandom.nextInt(), nombre));
		return true;
	}
		
	
	//metodo para traaer una pelicula
	//recorre el catalogo comparando el id de la pelicula, de no encontrarla devuelve null
	public Pelicula traerPelicula(int idPelicula)
	{
		Pelicula pelicula = null;
		
		for(Pelicula dato : catalogo)
		{
			if(dato.getIdPelicula() == idPelicula)
				pelicula = dato;
		}
		
		return pelicula;
	}
	
	
	
	
	public List<Pelicula> traerPelicula(String partePelicula)
	{
		List<Pelicula> pelicula = new ArrayList<Pelicula>();
		
		for(Pelicula dato : catalogo)
		{
			if(dato.getNombre().contains( partePelicula))
				pelicula.add(dato);
		}
		
		if(pelicula.isEmpty())
		{
			pelicula = null;
			return null;
		}
		
		return pelicula;
	}
	
	public void traerIncaa()
	{
		//cuerpo del metodo.
	}
	
	public void nuevaFuncion()
	{
	}
	

	public void nuevoMetodo()
	{
		
	}
	public void nuevaFuncion2()
	{
		
	}
	
}

















