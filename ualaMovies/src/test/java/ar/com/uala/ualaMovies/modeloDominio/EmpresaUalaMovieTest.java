package ar.com.uala.ualaMovies.modeloDominio;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import ar.com.uala.ualaMovies.excepciones.FondosInsuficientesException;
import ar.com.uala.ualaMovies.modeloDeDominio.Cliente;
import ar.com.uala.ualaMovies.modeloDeDominio.EmpresaUalaMovie;

public class EmpresaUalaMovieTest {

	private EmpresaUalaMovie empresaUalaMovie = null;
	private Cliente cliente = null;
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	@Before
	public void initialize(){
		cliente = new Cliente();
		clientes.add(cliente);
		empresaUalaMovie = new EmpresaUalaMovie();
		empresaUalaMovie.setClientes(clientes);
		empresaUalaMovie.setDinero(new BigDecimal(5000));
	}
	
	@Test
	public void testClientePaga() throws IOException, FondosInsuficientesException{
		cliente.setDineroDisponible(new BigDecimal(10000));
		empresaUalaMovie.cobrarTodosLosClientes();
		Assert.assertTrue(cliente.getDineroDisponible().equals(new BigDecimal(9900)));
		Assert.assertTrue(empresaUalaMovie.getDinero().equals(new BigDecimal(5100)));
	}
	
	@Test(expected=FondosInsuficientesException.class)
	public void testClienteSinDinero() throws IOException, FondosInsuficientesException{
		cliente.setDineroDisponible(new BigDecimal(10));
		empresaUalaMovie.cobrarTodosLosClientes();
	}
}
