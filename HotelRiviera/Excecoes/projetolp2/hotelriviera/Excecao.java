package projetolp2.hotelriviera;

public class Excecao extends Exception{
	private static final long serialVersionUID = 1L;
	private String message;
	
	public Excecao(String message) {
		super(message);
        this.message = message;
	}
	public String getMessage(){
		return message;
	}
}