package modelo;

public class Copia {

	private Filme filme;
	private int numero;
	private Boolean status = false;
	
	
	/////
	
	public Copia(Filme filme, int i) {
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




	public int getNumero() {
		return numero;
	}




	public void setNumero(int numero) {
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
		return  filme.toString() + ", numero = " +  numero + "                                           filme: " + status; 
	}
	
	
	
	
	
}
