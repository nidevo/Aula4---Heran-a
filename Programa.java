package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaComercial;
import entidade.ContaPoupanca;
import entidade.enums.Cores;

public class Programa {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		String nome = null;
		int numero = 0, color = 0;
		double saldo = 0, limite = 0;
		Cores cor = null;
		
		
		System.out.print("Digite quantas contas deseja cadastrar: ");
		int escolha = scn.nextInt();
		
		Conta p = new ContaPoupanca(nome, numero, saldo, cor);
		Conta c = new ContaComercial(nome, numero, saldo, cor, limite);
		List<Conta> lista = new ArrayList<>();
		
		while(escolha != 0) {
				System.out.println("Digite o tipo de conta: \n 1. Poupança\n 2. Comercia1");
				saldo = 0;
				int tipo = scn.nextInt();
				if(tipo == 1) {
	
					System.out.println("Nome: ");
					nome = scn.next();
					
					System.out.println("Número: ");
					numero = scn.nextInt();
					
					System.out.println("Depósito: ");
					saldo = p.depositar(scn.nextDouble());
					
					System.out.println("Saque: ");
					saldo = p.sacar(scn.nextDouble());
		
					
					System.out.println("Digite um número para a cor: \n1. Preto\n 2. Pink\n 3. Red");
					color = scn.nextInt();
					if(color == 1) {
						cor = Cores.BLACK;
					}
					
					if(color == 2) {
						cor = Cores.PINK;
					}
					
					if(color == 3) {
						cor = Cores.RED;
					}
					
					p = new ContaPoupanca(nome, numero, saldo, cor);
					
			
					lista.add(p);

					escolha--;
				}
				
				if(tipo == 2) {

					System.out.println("Nome: ");
					nome = scn.next();
					
					System.out.println("Número: ");
					numero = scn.nextInt();
					
					System.out.println("Depósito: ");
					saldo = c.depositar(scn.nextDouble());
					
					System.out.println("Saque: ");
					saldo = c.sacar(scn.nextDouble());
					
					System.out.println("Digite o limite da conta: ");
					limite = scn.nextDouble();
					
					System.out.println("Digite um número para a cor: \n1. Preto\n 2. Pink\n 3. Red");
					color = scn.nextInt();
					
					if(color == 1) {
						cor = Cores.BLACK;
					}
					
					if(color == 2) {
						cor = Cores.PINK;
					}
					
					if(color == 3) {
						cor = Cores.RED;
					}
					
					c = new ContaComercial(nome, numero, saldo, cor, limite);
					lista.add(c);
					escolha --;
					
				}
				
				
			for(Conta e : lista) {
				System.out.println(e);
			}
		}
	}

}
