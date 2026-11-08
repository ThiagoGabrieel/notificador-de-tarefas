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

    private LocalDate data;
    private LocalTime horario;

    private boolean tarefaNotificada;
    private boolean tarefaConcluida;

    public TarefaEntity(UsuarioEntity usuario, String titulo, String descricao, LocalDate data,
                        LocalTime horario) {
        this.usuario = Objects.requireNonNull(usuario, "Usuario é obrigatório");
        this.titulo = Objects.requireNonNull(titulo, "Titulo é obrigatório");
        this.descricao = descricao;
        definirLembrete(data, horario);
    }
}
