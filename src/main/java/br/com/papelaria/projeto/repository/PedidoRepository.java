package br.com.papelaria.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.papelaria.projeto.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
