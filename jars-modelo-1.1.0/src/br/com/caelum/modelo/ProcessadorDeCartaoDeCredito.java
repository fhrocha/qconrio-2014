package br.com.caelum.modelo;

import java.util.Iterator;
import java.util.List;

public class ProcessadorDeCartaoDeCredito implements ProcessadorDeMeiosDePagamento<ParcelaCartao> {

	public void processa(List<ParcelaCartao> parcelas, Fatura fatura) {

		Iterator<ParcelaCartao> it = parcelas.iterator();
		
		while (it.hasNext()) {
			MeioDePagamento localMeioDePagamento = (MeioDePagamento) it.next();
			Pagamento localPagamento = new Pagamento(localMeioDePagamento.getValor(),
					MeiosDePagamento.CARTAO);
			fatura.getPagamentos().add(localPagamento);
		}
	}
}
