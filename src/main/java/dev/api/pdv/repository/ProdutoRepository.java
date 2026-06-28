package dev.api.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.api.pdv.entity.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

}
