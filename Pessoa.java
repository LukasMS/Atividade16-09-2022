package exercicio3;

import java.util.ArrayList;

public class Pessoa {
	
	private String nome;
	private Pessoa pai = null;
	private Pessoa mae = null;
    private ArrayList<Carro> carros =  new ArrayList<>(); 
    
    public void comprar_carro(Carro  c) {
    	
    	carros.add(c);
    	
    }   
    public void vender_carro(Carro c) {
    	
    	carros.remove(c);
    	
    }
	public Pessoa(String nome) {
		super();
		this.nome = nome;
	}
	public Pessoa() {
		super();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa getPai() {
		return pai;
	}
	public void setPai(Pessoa pai) {
		this.pai = pai;
	}
	public Pessoa getMae() {
		return mae;
	}
	public void setMae(Pessoa mae) {
		this.mae = mae;
	}
	public ArrayList<Carro> getCarros() {
		return carros;
	}
	public void setCarros(ArrayList<Carro> c) {
		this.carros = c;
	}
    
       
}
