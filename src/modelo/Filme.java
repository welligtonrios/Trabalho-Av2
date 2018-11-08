package modelo;
import java.util.ArrayList;

import java.util.List;

public class Filme {
	
private String titulo;
private int duracao;
private int anoLancamento;
private String formato;

private ArrayList<Copia> listcopias = new ArrayList<>();


private List<String> listAtores = new ArrayList<>();

//contrutor

public Filme( String titulo ,int ano) {
	this.titulo = titulo;
	this.anoLancamento = ano;
}



public Filme(String titulo, int duracao, int anoLancamento, List<String> listAtores) {
	super();
	this.titulo = titulo;
	this.duracao = duracao;
	this.anoLancamento = anoLancamento;
	this.listAtores = listAtores;
}

//gets sets 

public String getTitulo() {
	return titulo;
}



public void setTitulo(String titulo) {
	this.titulo = titulo;
}



public int getDuracao() {
	return duracao;
}



public void setDuracao(int duracao) {
	this.duracao = duracao;
}



public int getAnoLancamento() {
	return anoLancamento;
}



public void setAnoLancamento(int anoLancamento) {
	this.anoLancamento = anoLancamento;
}



public String getFormato() {
	return formato;
}



public void setFormato(String formato) {
	this.formato = formato;
}



public List<String> getAtores() {
	return listAtores;
}


public void setListAtores(List<String> listAtores) {
	this.listAtores = listAtores;
}



public void setListcopias(ArrayList<Copia> listcopias) {
	this.listcopias = listcopias;
}



public ArrayList<Copia> getListcopias() {
	return listcopias;
}


//add copias 
public void addCopia(Copia cop) {
	listcopias.add(cop);
}

public void addAtores(String a) {
	listAtores.add(a);
}


@Override
public String toString() {
	return "Filme\n titulo= " + titulo + ", duracao= " + duracao + "Hrs"+ ", anoLancamento= " + anoLancamento + ", formato= "
			+ formato + ", atores= " + listAtores + "  numero de copias :  " +  listcopias.size();
}







	
	
	
}
