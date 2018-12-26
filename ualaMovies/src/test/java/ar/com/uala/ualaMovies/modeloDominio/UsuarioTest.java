package ar.com.uala.ualaMovies.modeloDominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.com.uala.ualaMovies.modeloDeDominio.EmpresaUalaMovie;
import ar.com.uala.ualaMovies.modeloDeDominio.Pelicula;
import ar.com.uala.ualaMovies.modeloDeDominio.Usuario;

public class UsuarioTest {
	Pelicula pelicula = null;
	List<Pelicula> peliculas = new ArrayList<Pelicula>();
	EmpresaUalaMovie empresaUalaMovie = null;
	Usuario usuario = null;
	
	@Before
	public void initialize(){
		pelicula = new Pelicula();
		peliculas = new ArrayList<Pelicula>();
		peliculas.add(pelicula);
		empresaUalaMovie = new EmpresaUalaMovie();
		empresaUalaMovie.setPeliculas(peliculas);
		usuario = new Usuario();
		usuario.setEmpresaContratada(empresaUalaMovie);
	}
	
	@Test
	public void testNoEsAntiguo(){
		pelicula.setFechaEstreno(new Date());
		usuario.visualizarProductoRandom();
		Assert.assertFalse(usuario.getEsAntiguo());
	}
	
	@Test
	public void testEsAntiguo(){
		pelicula.setFechaEstreno(new Date(114,01,01));
		usuario.visualizarProductoRandom();
		Assert.assertTrue(usuario.getEsAntiguo());
	}
}
