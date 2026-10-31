package com.thiagodev.notificador_de_tarefas.domain.repository;

import com.thiagodev.notificador_de_tarefas.domain.entity.TarefaEntity;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

@Repository
public interface TarefaRepository extends JpaRepository<TarefaEntity, Long> {

    TarefaEntity findById(long id);
    TarefaEntity findByNome(String nome);
    TarefaEntity findyByHorarioDeExecucao(LocalDateTime horarioParaExecutarTarefa);

    boolean existByNome(String nome);

    void deleteByNome(String nome);
}
