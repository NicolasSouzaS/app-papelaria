package br.com.papelaria.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.papelaria.projeto.domain.Categoria;

/*
 * Metodos de gravar, listar, atualizar e apagar ações do banco de dados
 * criando o repository desta forma, pulamos a etapa de criar método por método,
 * resultando em mais velocidade de criação. Então nós teremos os metodos de ação
 * dentro do banco de dados através desta interface.
 */
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
