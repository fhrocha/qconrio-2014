package br.com.caelum.qcon.modelo;

import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tarefas")
public class Tarefa
{

  @Id
  private Long id;
  private String descricao;
  private boolean finalizado;
  private Calendar dataFinalizacao;

  public Long getId()
  {
    return this.id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getDescricao() {
    return this.descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public boolean isFinalizado() {
    return this.finalizado;
  }

  public void setFinalizado(boolean finalizado) {
    this.finalizado = finalizado;
  }

  public Calendar getDataFinalizacao() {
    return this.dataFinalizacao;
  }

  public void setDataFinalizacao(Calendar dataFinalizacao) {
    this.dataFinalizacao = dataFinalizacao;
  }

  public String toString()
  {
    return "Tarefa [id=" + this.id + "]";
  }
}