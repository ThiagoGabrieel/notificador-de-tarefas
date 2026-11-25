package com.thiagodev.notificador_de_tarefas.controller.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public record TarefaResponseDTO(
        Long id, 
        String titulo,
        String descricao,
        LocalDate data,
        LocalTime horario
) {
}
