package br.com.caelum.qcon.impl;

import javax.persistence.EntityManager;

import br.com.caelum.qcon.modelo.Tarefa;
import br.com.caelum.qcon.service.TarefaService;

public class TarefaServiceImpl implements TarefaService {
	
	private EntityManager entityManager;

	public EntityManager getEntityManager() {
		return this.entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public Tarefa getTarefa(String nome) {
		return (Tarefa) this.entityManager
				.createQuery("select t from Tarefa where t.nome like :pNome",
						Tarefa.class).setParameter("pNome", nome)
				.getSingleResult();
	}

	public void geraTarefa(Tarefa tarefa) {
		this.entityManager.persist(tarefa);
	}
}