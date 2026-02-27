package com.lkdev.to_do_list.controller;

import com.lkdev.to_do_list.model.Tarefas;
import com.lkdev.to_do_list.service.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tarefas")
@CrossOrigin
public class TarefaController {

    @Autowired
    private TarefaService tarefaService;

    @GetMapping
    public List<Tarefas> getAllTarefas() {
        return tarefaService.listarTarefas();
    }
    @GetMapping("/{id}")
    public Tarefas buscarPorId(@PathVariable int id) {
        return tarefaService.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Tarefas atualizarTarefa(@PathVariable int id , @RequestBody Tarefas tarefaAtualizada) {
        return tarefaService.atualizarTarefa(id,tarefaAtualizada);
    }

    @PostMapping
    public Tarefas criarTarefa(@RequestBody Tarefas tarefaCriada) {
        return tarefaService.criarTarefa(tarefaCriada);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
         tarefaService.deletarTarefa(id);
    }
}
