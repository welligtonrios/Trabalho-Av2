package modelo;
import java.sql.Date;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
	
		Filme f[] = new Filme[5];
		
		f[0]= new Filme("naruto", 2012);
		/////
		f[0].setFormato("4k");
		f[0].setDuracao(2);
		
		Copia c = new Copia(f[0],123);
		Copia c1 = new Copia(f[0],124);
		Copia c2 = new Copia(f[0],125);
		Copia c3 = new Copia(f[0],126);
		
		f[0].addCopia(c);
		f[0].addCopia(c1);
		f[0].addCopia(c2);
		f[0].addCopia(c3);
        
		f[0].addAtores("Jeremy Sumpter");
		f[0].addAtores("Jeong ");
        
        //System.out.println(f.toString());
        
        //////
        
		f[1] = new Filme("Dragon ball Super ", 2018);
        System.out.println("\n\n");
        f[1].setFormato("4k");
        f[1].setDuracao(2);
		
		Copia c4 = new Copia(f[1],34);
		Copia c5 = new Copia(f[1],258);
		Copia c6 = new Copia(f[1],874);
		Copia c7 = new Copia(f[1],965);
		
		f[1].addCopia(c4);
		f[1].addCopia(c5);
		f[1].addCopia(c6);
		f[1].addCopia(c7);
       
		f[1].addAtores("Wendel Bezerra");
		f[1].addAtores("Alfredo Rollo");

       
        //System.out.println(f1.toString());
   
		
		Socio socio1= new Socio("joao");
		Socio socio2= new Socio("maria");
		
  Locacao l1 = new Locacao(socio1,c5);	
  Locacao l2 = new Locacao(socio2,c2);	
   l2.addFimes(c7);
	
  
socio2.alugarFilme(l2);  
socio1.alugarFilme(l1);

System.out.println(l2);



	}

}
