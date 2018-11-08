package modelo;
import java.sql.Date;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
	
		Filme f = new Filme("naruto",2010);
		Filme f1 = new Filme("Dragon Ball",2018);
		/////
		f.setFormato("4k");
		f.setDuracao(2);
		
		Copia c = new Copia(f,"123");
		Copia c1 = new Copia(f,"124");
		Copia c2 = new Copia(f,"125");
		Copia c3 = new Copia(f,"126");
		
        f.addCopia(c);
        f.addCopia(c1);
        f.addCopia(c2);
        f.addCopia(c3);
        
        f.addAtores("Jeremy Sumpter");
        f.addAtores("Jeong ");
        
        //System.out.println(f.toString());
        
        //////
        
        System.out.println("\n\n");
        f1.setFormato("4k");
		f1.setDuracao(2);
		
		Copia c4 = new Copia(f1,"126");
		Copia c5 = new Copia(f1,"127");
		Copia c6 = new Copia(f1,"128");
		Copia c7 = new Copia(f1,"129");
		
		f1.addCopia(c4);
        f1.addCopia(c5);
        f1.addCopia(c6);
        f1.addCopia(c7);
       
        f1.addAtores("Wendel Bezerra");
        f1.addAtores("Alfredo Rollo");

        
        //System.out.println(f1.toString());
        
      Socio socio1 = new Socio();
      socio1.setNome("well");
      socio1.setCpf("115544455544");

	
  Locacao alugar = new Locacao(socio1, c5);                      
	
  socio1.alugarFilme(alugar);
  
    System.out.println(alugar);
		
		

		

	}

}
