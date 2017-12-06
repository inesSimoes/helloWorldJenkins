package myProject;

import java.io.Serializable;

public class Class1 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int id=0;
	private String nome;
	
	Class1(){
		id++;
	};
	
	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void initNome(String nomeCompleto) {
		this.nome = nomeCompleto;
	}
	
	public String[] divideNomes() {
		String[] nomesSeparados = null;
		
		nomesSeparados = this.nome.split(" ");
		
		return nomesSeparados; 
	}
}
