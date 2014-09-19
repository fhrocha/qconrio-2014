package br.com.caelum.modelo;

public class ParcelaCartao implements MeioDePagamento {
	
	private double valor;

	public ParcelaCartao(double valor) {
		System.out.println("Criando ParcelaCartao " + Versao.NUMERO);
		System.out.println();

		this.valor = valor;
	}

	public double getValor() {
		return this.valor;
	}
}
