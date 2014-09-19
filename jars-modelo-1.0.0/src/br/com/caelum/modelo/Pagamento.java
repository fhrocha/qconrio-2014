package br.com.caelum.modelo;

public class Pagamento {
	private double valor;
	private MeiosDePagamento forma;

	public Pagamento(double valor, MeiosDePagamento meiosDePagamento) {
		this.valor = valor;
		this.forma = meiosDePagamento;
	}

	public double getValor() {
		return this.valor;
	}

	public MeiosDePagamento getForma() {
		return this.forma;
	}

	public boolean equals(Object paramObject) {
		if (!(paramObject instanceof Pagamento))
			return false;
		Pagamento localPagamento = (Pagamento) paramObject;
		return (this.forma == localPagamento.forma)
				&& (Double.doubleToLongBits(this.valor) == Double
						.doubleToLongBits(localPagamento.valor));
	}
}
