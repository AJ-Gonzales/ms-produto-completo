package com.github.annajulia.ms.produto.repositories;

import com.github.annajulia.ms.produto.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
