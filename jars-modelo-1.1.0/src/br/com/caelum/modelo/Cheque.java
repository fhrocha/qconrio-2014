package br.com.caelum.modelo;

public class Cheque implements MeioDePagamento {
	
	private double valor;

	public Cheque(double valor) {
		System.out.println("Criando Cheque " + Versao.NUMERO);
		System.out.println();
		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}
}