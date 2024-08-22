package entidade;

import entidade.enums.Cores;

public class ContaComercial extends Conta {
	
	private double limite = 0;
	
	public ContaComercial(String nome, int numero, double saldo, Cores cor, double limite) {
		super(nome, numero, saldo, cor);
		this.limite = limite;
	}

	


	
}
