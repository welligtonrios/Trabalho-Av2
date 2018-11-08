package modelo;
import java.sql.Date;
import java.util.ArrayList;

public class Locacao {

	private Socio socio;
	private ArrayList<Copia> filmes= new ArrayList<Copia>();
	private Date data;
	private int valor;
	
	
	//construtores para add filme e socio
	
	
	
	public Locacao(Socio socio ,Copia filme) {
		
		this.socio= socio;
		filmes.add(filme);
		filme.setStatus(false);
		
		
	}
	
	public Locacao(Socio socio, ArrayList<Copia> filmes) {
		super();
		this.socio = socio;
		this.filmes = filmes;
	}
	

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Cliente = :" + socio + ", filmes = : " + filmes.get(0).getFilme();
	}
	
	
	
		
	
	
	
	
	
	
	
	
}
