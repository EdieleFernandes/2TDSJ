package br.com.fiap.teste;

import br.com.fiap.bean.Estado;

public class EnumTeste {

	public static void main(String arg[]){
		Estado uf = Estado.SP;
		if (uf == Estado.SP ){
			System.out.println("Vc � paulista");
		}else{
			System.out.println("Vc n�o � paulista");
		}
	}
	
}




