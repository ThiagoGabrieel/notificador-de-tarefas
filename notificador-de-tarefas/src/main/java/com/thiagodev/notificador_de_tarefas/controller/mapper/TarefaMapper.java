package com.thiagodev.notificador_de_tarefas.controller.mapper;

import com.thiagodev.notificador_de_tarefas.controller.dto.TarefaResponseDTO;
import com.thiagodev.notificador_de_tarefas.domain.entity.TarefaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TarefaMapper{

    TarefaResponseDTO paraDto(TarefaEntity tarefaEntity);
    TarefaEntity paraEntity(TarefaResponseDTO tarefaDto);
}
