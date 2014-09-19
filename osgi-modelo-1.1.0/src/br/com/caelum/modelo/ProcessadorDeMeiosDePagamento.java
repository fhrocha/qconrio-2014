package br.com.caelum.modelo;

import java.util.List;

public interface ProcessadorDeMeiosDePagamento<T> {

	public abstract void processa(List<T> meios, Fatura fatura);

}
