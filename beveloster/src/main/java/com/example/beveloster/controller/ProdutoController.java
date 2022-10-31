
package com.example.beveloster.controller;


import com.example.beveloster.model.Produto;
import com.example.beveloster.repository.ProdutoRepository;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ProdutoController {

	ProdutoRepository repository;
	
	@GetMapping("/produto")
	public List<Produto> getAllProdutos(){
		return repository.findAll();
	}
	
	@GetMapping("/produto/{id}")
	public Produto getProdutoById(@PathVariable int id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/produto")
	public Produto saveProduto(@RequestBody Produto produto) {
		return repository.save(produto);
	}
	
	@DeleteMapping("/produto/{id}")
	public String deleteProduto(@PathVariable int id) {
		repository.deleteById(id);
                return "Produto Removido!!";
	}
	
	
}
