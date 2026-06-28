package dev.api.pdv.services;

import java.util.List;

import org.springframework.stereotype.Service;

import dev.api.pdv.dto.ProdutoDTO;
import dev.api.pdv.entity.Produto;
import dev.api.pdv.exceptions.ProdutoNotFoundException;
import dev.api.pdv.repository.ProdutoRepository;

@Service
public class ProdutoService {

	private final ProdutoRepository repository;

	public ProdutoService(ProdutoRepository repository) {
		this.repository = repository;
	}

	private ProdutoDTO toDTO(Produto produto) {
		return new ProdutoDTO(produto.getId(), produto.getNome(), produto.getValor());
	}

	private Produto toEntity(ProdutoDTO dto) {
		Produto produto = new Produto();
		produto.setNome(dto.getNome());
		produto.setValor(dto.getValor());
		return produto;
	}

	public List<ProdutoDTO> findAllDTO() {
		return repository.findAll().stream().map(this::toDTO).toList();
	}

	public ProdutoDTO findByIdDTO(Long id) {
		return toDTO(findById(id));
	}

	public ProdutoDTO saveDTO(ProdutoDTO dto) {
		Produto produto = toEntity(dto);
		return toDTO(repository.save(produto));
	}

	public ProdutoDTO updateDTO(Long id, ProdutoDTO dto) {

		Produto entity = findById(id);

		if (dto.getNome() != null) {
			entity.setNome(dto.getNome());
		}

		if (dto.getValor() != null) {
			entity.setValor(dto.getValor());
		}

		entity = repository.save(entity);

		return toDTO(entity);
	}

	public Produto findById(Long id) {
		return repository.findById(id).orElseThrow(() -> new ProdutoNotFoundException("Produto não encontrado"));
	}

	public void delete(Long id) {
		Produto produto = findById(id);
		repository.delete(produto);
	}

}