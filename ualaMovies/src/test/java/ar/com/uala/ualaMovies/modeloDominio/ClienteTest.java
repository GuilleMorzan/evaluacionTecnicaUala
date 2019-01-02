package ar.com.uala.ualaMovies.modeloDominio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ar.com.uala.ualaMovies.modeloDeDominio.Cliente;
import ar.com.uala.ualaMovies.modeloDeDominio.Documental;
import ar.com.uala.ualaMovies.modeloDeDominio.EmpresaUalaMovie;
import ar.com.uala.ualaMovies.modeloDeDominio.Oscar;
import ar.com.uala.ualaMovies.modeloDeDominio.Pelicula;

public class ClienteTest {
	Pelicula pelicula = null;
	List<Pelicula> peliculas = new ArrayList<Pelicula>();
	Documental documental = null;
	List<Documental> documentales = new ArrayList<Documental>();
	EmpresaUalaMovie empresaUalaMovie = null;
	Cliente cliente = null;
	Oscar oscar = null;
	
	@Before
	public void initialize(){
		pelicula = new Pelicula();
		pelicula.setFechaEstreno(new Date());
		peliculas = new ArrayList<Pelicula>();
		peliculas.add(pelicula);
		documental = new Documental();
		documental.setFechaEstreno(new Date());
		documentales.add(documental);
		empresaUalaMovie = new EmpresaUalaMovie();
		empresaUalaMovie.setPeliculas(peliculas);
		empresaUalaMovie.setDocumentales(documentales);
		cliente = new Cliente();
		cliente.setEmpresaContratada(empresaUalaMovie);
		oscar = new Oscar();
	}
	
	@Test
	public void testNoEsAntiguo(){
		pelicula.setFechaEstreno(new Date());
		cliente.visualizarPeliculaRandom();
		Assert.assertFalse(cliente.getEsAntiguo());
	}
	
	@Test
	public void testEsAntiguo(){
		pelicula.setFechaEstreno(new Date(114,01,01));
		cliente.visualizarPeliculaRandom();
		Assert.assertTrue(cliente.getEsAntiguo());
	}
	
	@Test
	public void testMiraPeliculaInteresante(){
		pelicula.getOscarsObtenidos().add(oscar);
		cliente.visualizarPeliculaRandom();
		Assert.assertTrue(cliente.miraAlgoInteresante());
	}

	@Test
	public void testNoMiraPeliculaInteresante(){
		cliente.visualizarPeliculaRandom();
		Assert.assertFalse(cliente.miraAlgoInteresante());
	}
	
	@Test
	public void testMiraDocumentalInteresante(){
		documental.setTitulo("Contiene unofficial en el título");
		cliente.visualizarDocumentalRandom();
		Assert.assertTrue(cliente.miraAlgoInteresante());
	}

	@Test
	public void testNoMiraDocumentalInteresante(){
		documental.setTitulo("No contiene esa palabra en el título");
		cliente.visualizarDocumentalRandom();
		Assert.assertFalse(cliente.miraAlgoInteresante());
	}
}
