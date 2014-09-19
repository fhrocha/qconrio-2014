package br.com.caelum.modelo;

import java.util.ArrayList;
import java.util.List;

public class Fatura
{
  private String cliente;
  private double valor;
  private List<Pagamento> pagamentos;
  private boolean pago;

  public Fatura(String cliente, double valor)
  {
    this.cliente = cliente;
    this.valor = valor;
    this.pagamentos = new ArrayList<>();
    this.pago = false;
  }

  public String getCliente()
  {
    return this.cliente;
  }

  public double getValor()
  {
    return this.valor;
  }

  public List<Pagamento> getPagamentos()
  {
    return this.pagamentos;
  }

  public boolean isPago()
  {
    return this.pago;
  }

  public void setPago(boolean paramBoolean)
  {
    this.pago = paramBoolean;
  }
}