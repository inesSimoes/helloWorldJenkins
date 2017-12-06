package myProject;

import java.util.Scanner;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class MyTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Class1 o1 = new Class1();
		Class2 o2 = new Class2();
		Class2 o3 = new Class2();
		Class2 o4 = new Class2();
		Class2 o5 = new Class2();
		
		o1.initNome("Ines Isabel Alexandre Simoes");
		System.out.println(o1.divideNomes());
		
		o2.initNome("Ines Isabel Alexandre Simoes");
		o2.initCategoria("Pessoa");
		o2.mostra();
		o3.initNome("Ines");
		o4.initNome("");
		System.out.println("Indique um nome:");
		o5.initNome(sc.nextLine());

		
        System.out.println(o2.getId());
        o3.mostra();
        o4.mostra();
        o5.mostra();
	}

}
