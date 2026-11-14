package com.thiagodev.notificador_de_tarefas.domain.repository;

import com.thiagodev.notificador_de_tarefas.domain.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

    Optional<UsuarioEntity> findByEmail(String email);
    boolean existsByEmail(String email);
}
