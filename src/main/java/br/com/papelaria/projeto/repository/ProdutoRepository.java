package br.com.papelaria.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.papelaria.projeto.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
