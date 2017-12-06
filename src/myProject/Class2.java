package myProject;

import java.io.Serializable;

public class Class2 extends Class1 implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    //construtor vazio
	Class2(){
		idC2++;
	};
	
	private static int idC2=0;
	public static int getIdC2() {
		return idC2;
	}

	private String categoria;
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public  void initCategoria(String categoria) {
		this.categoria= categoria;
	}
	
	public void mostra() {
		String pNome=this.divideNomes()[0];
		
		int iuNome=this.divideNomes().length;
		if(this.divideNomes().length > 1) {
			String uNome=this.divideNomes()[iuNome-1];
			String cat = getCategoria();
			System.out.println("Primeiro Nome " + pNome + "\nUltimo Nome: " + uNome + "\n" + "Categoria:  " +  cat);
		}
		else if(this.divideNomes().length == 1 && !this.divideNomes()[0].equals(""))  {
			System.out.println("Nome Próprio: " + pNome);
		}
		else {
			System.out.println("Pessoa sem Nome!");
		}
			
	}
}
