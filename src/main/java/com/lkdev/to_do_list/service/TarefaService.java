package com.lkdev.to_do_list.service;

import com.lkdev.to_do_list.data.TarefaData;
import com.lkdev.to_do_list.model.Tarefas;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class TarefaService {

    private final TarefaData tarefaData;

    public TarefaService(TarefaData tarefaData) {
        this.tarefaData = tarefaData;
    }

    public Tarefas criarTarefa(Tarefas tarefa) {
        return tarefaData.save(tarefa);
    }

    public List<Tarefas> listarTarefas() {
        return tarefaData.findAll();
    }

    public Tarefas buscarPorId(int id) {
        return tarefaData.findById(id)
                .orElseThrow(() ->
                        new ResponseStatusException(
                                HttpStatus.NOT_FOUND,
                                "Tarefa não encontrada"
                        )
                );
    }

    public Tarefas atualizarTarefa(int id, Tarefas tarefaAtualizada) {

        Tarefas tarefaExistente = buscarPorId(id);

        tarefaExistente.setNome(tarefaAtualizada.getNome());
        tarefaExistente.setDescricao(tarefaAtualizada.getDescricao());

        return tarefaData.save(tarefaExistente);
    }

    public void deletarTarefa(int id) {
        Tarefas tarefa = buscarPorId(id);
        tarefaData.delete(tarefa);
    }
}