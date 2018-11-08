package modelo;

public class Copia {

	private Filme filme;
	private String numero;
	private Boolean status = true;
	
	
	/////
	
	public Copia(Filme filme, String i) {
		this.filme = filme;
		this.numero = i;
	}


////

	public Filme getFilme() {
		return filme;
	}




	public void setFilme(Filme filme) {
		this.filme = filme;
	}




	public String getNumero() {
		return numero;
	}




	public void setNumero(String numero) {
		this.numero = numero;
	}




	public Boolean getStatus() {
		return status;
	}




	public void setStatus(Boolean status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return " filme = " + filme + ",numero = " + (String) numero ;
	}
	
	
	
	
	
}
