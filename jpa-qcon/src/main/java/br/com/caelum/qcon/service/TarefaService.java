package br.com.caelum.qcon.service;

import br.com.caelum.qcon.modelo.Tarefa;

public interface TarefaService {

	public abstract void geraTarefa(Tarefa tarefa);

	public abstract Tarefa getTarefa(String nome);

}
