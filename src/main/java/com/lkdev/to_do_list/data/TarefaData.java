package com.lkdev.to_do_list.data;

import com.lkdev.to_do_list.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaData extends JpaRepository<Tarefas, Integer>{

}
