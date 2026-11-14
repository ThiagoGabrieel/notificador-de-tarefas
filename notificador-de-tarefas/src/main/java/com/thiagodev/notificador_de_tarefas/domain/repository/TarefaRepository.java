package com.thiagodev.notificador_de_tarefas.domain.repository;

import com.thiagodev.notificador_de_tarefas.domain.entity.TarefaEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {

    List<TarefaEntity> findByTitulo(String titulo);
    List<TarefaEntity> findByData(LocalDate data);
    List<TarefaEntity> findByHorario(LocalTime horario);
    
    void deleteByTitulo(String titulo);
}
