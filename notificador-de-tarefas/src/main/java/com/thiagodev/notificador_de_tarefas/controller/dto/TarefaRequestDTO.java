package com.thiagodev.notificador_de_tarefas.controller.dto;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalTime;

public record TarefaRequestDTO(
        @NotBlank(message = "O Titulo é obrigatório")
        @Size(max = 200, message = "O titulo deve ter no máximo 200 caracteres")
        String titulo,

        @Size(max = 200, message = "A descrição deve ter no máximo 200 caracteres")
        String descricao,

        @NotNull(message = "A Data é obrigatório")
        @FutureOrPresent
        LocalDate data,

        @NotNull(message = "O Horario é obrigatório")
        @Future
        LocalTime horario
) {
}
