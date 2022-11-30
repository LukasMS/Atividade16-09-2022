package exercicio3;

public class Carro {
    
   private String nome;
   private Pessoa dono = null;
      
   
public Carro() {
	super();
}
public Carro(String nome) {
	super();
	this.nome = nome;
}
public Carro(String nome, Pessoa dono) {
	super();
	this.nome = nome;
	this.dono = dono;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public Pessoa getDono() {
	return dono;
}
public void setDono(Pessoa dono) {
	this.dono = dono;
}
   
   

}