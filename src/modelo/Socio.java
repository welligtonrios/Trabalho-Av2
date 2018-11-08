package modelo;
import java.sql.Date;
import java.util.ArrayList;

public class Socio {
	
	
    private ArrayList<Locacao> historicoFilmes = new ArrayList<Locacao>();
	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;
	private Date adesao;
	
	/////
	public Socio() {
		
	}
	
	
	
	public Socio(ArrayList<Locacao> historicoFilmes, String nome, String cpf, String endereco, String telefone,
			Date adesao) {
		super();
		this.historicoFilmes = historicoFilmes;
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
		this.adesao = adesao;
	}

// alugar um  filme 

	public void alugarFilme(Locacao aluguel) { 
		historicoFilmes.add(aluguel);
	}

//////
	public ArrayList<Locacao> getHistoricoFilmes() {
		return historicoFilmes;
	}





	public void setHistoricoFilmes(ArrayList<Locacao> historicoFilmes) {
		this.historicoFilmes = historicoFilmes;
	}





	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Date getAdesao() {
		return adesao;
	}


	public void setAdesao(Date adesao) {
		this.adesao = adesao;
	}



	@Override
	public String toString() {
		return "Socio historicoFilmes= " + historicoFilmes + ", nome= " + nome;
	}
	
	
	

}
