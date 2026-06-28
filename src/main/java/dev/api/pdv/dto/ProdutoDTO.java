package dev.api.pdv.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class ProdutoDTO {

	private Long id;

	@NotBlank(message = "Nome obrigatório")
	private String nome;

	@NotNull(message = "Valor obrigatório")
	@Positive(message = "Valor deve ser maior que zero")
	private BigDecimal valor;

	public ProdutoDTO() {
	}

	public ProdutoDTO(Long id, String nome, BigDecimal valor) {
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
