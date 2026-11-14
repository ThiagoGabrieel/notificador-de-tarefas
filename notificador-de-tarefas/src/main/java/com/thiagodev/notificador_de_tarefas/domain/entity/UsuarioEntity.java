package com.thiagodev.notificador_de_tarefas.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "usuarios")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "tarefas_id")
    private List<TarefaEntity> tarefaentity;

    private String nome;
    private String email;
    private String senha;
}
