package com.prado.contas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prado.contas.model.Titulo;

public interface Titulos extends JpaRepository<Titulo, Long> {

}
