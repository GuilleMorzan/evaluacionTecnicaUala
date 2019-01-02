package ar.com.uala.ualaMovies.excepciones;

public class FondosInsuficientesException extends Exception{
	private static final long serialVersionUID = -2177103551045327054L;
	public String message;
	
	public FondosInsuficientesException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}

}
