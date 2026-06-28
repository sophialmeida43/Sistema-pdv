package dev.api.pdv.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import dev.api.pdv.dto.ProdutoDTO;
import dev.api.pdv.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

	private final ProdutoService service;

	public ProdutoController(ProdutoService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<ProdutoDTO>> findAll() {
		return ResponseEntity.ok(service.findAllDTO());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ProdutoDTO> findById(@PathVariable Long id) {
		return ResponseEntity.ok(service.findByIdDTO(id));
	}

	@PostMapping
	public ResponseEntity<ProdutoDTO> save(@RequestBody ProdutoDTO dto) {
		ProdutoDTO produtoSalvo = service.saveDTO(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalvo);
	}

	@PutMapping("/{id}")
	public ResponseEntity<ProdutoDTO> update(@PathVariable Long id, @RequestBody ProdutoDTO dto) {

		ProdutoDTO produtoAtualizado = service.updateDTO(id, dto);
		return ResponseEntity.ok(produtoAtualizado);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}