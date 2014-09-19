package br.com.caelum.qcon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.caelum.qcon.modelo.Tarefa;
import br.com.caelum.qcon.service.TarefaService;

@Controller
public class TarefasController {
 
	@Autowired
	TarefaService tarefaService;

	@RequestMapping({ "adicionaTarefa" }) 
	public String adiciona(Tarefa tarefa) {
		this.tarefaService.geraTarefa(tarefa);
		return "tarefa/adicionada";
	}

	@RequestMapping({ "/formulario" })
	public String formulario() {
		return "tarefa/formulario";
	}
}