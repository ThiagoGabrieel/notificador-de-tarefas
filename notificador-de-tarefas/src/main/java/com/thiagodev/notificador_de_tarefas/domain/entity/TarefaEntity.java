package com.thiagodev.notificador_de_tarefas.domain.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Objects;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "tarefas")
public class TarefaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "usuarios_id")
    private UsuarioEntity usuario;

    private String titulo;
    private String descricao;
    private LocalDate dataDeCriacaoDaTarefa;
    private LocalDateTime horarioParaExecutarTarefa;

    private LocalDate data;
    private LocalTime horario;

}
