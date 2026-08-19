package com.github.annajulia.ms.produto.dto;

import com.github.annajulia.ms.produto.entities.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CategoriaResponseDto {

    private Long id;
    private String nome;

    public CategoriaResponseDto(Categoria categoria) {
        id = categoria.getId();
        nome = categoria.getNome();
    }
}
