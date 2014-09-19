package br.com.caelum.comercial;

import java.util.List;

import br.com.caelum.modelo.Cheque;
import br.com.caelum.modelo.Fatura;
import br.com.caelum.modelo.ProcessadorDeCheque;

public class ServicoComercial
{
  public void verificaFaturaComCheques(List<Cheque> cheques, Fatura fatura)
  {
    new ProcessadorDeCheque().processa(cheques, fatura);
  }
}
