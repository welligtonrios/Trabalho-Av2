package modelo;
import java.sql.Date;
import java.util.ArrayList;

public class Locacao {

	private Socio socio;
	private ArrayList<Copia> filmes= new ArrayList<Copia>();
	private Date data;
	private int valor;
	
	
	//metodos especiais 
	
	
	
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


	
	
	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public ArrayList<Copia> getFilmes() {
		return filmes;
	}

	public void setFilmes(ArrayList<Copia> filmes) {
		this.filmes = filmes;
	}

	@Override
	public String toString() {
		return "Cliente: " +socio.getNome() +  "\nfilmes alugados: " +  filmes.size() + "\nfilmes: " + filmes.toString();
	}
	
	//metodos publicos 
	
	public void addFimes(Copia filme ) {
		
		filmes.add(filme);
		
	}
	
		
	
	
	
	
	
	
	
	
}
