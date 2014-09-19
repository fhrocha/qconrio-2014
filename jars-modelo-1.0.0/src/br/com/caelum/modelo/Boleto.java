package br.com.caelum.modelo;

public class Boleto implements MeioDePagamento {
	
	private double valor;

	public Boleto(double valor) {
		
		System.out.println("Criando Boleto " + Versao.NUMERO);
		System.out.println();

		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}
}
