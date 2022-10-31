
package com.example.beveloster.controller;


import com.example.beveloster.model.Usuario;
import com.example.beveloster.repository.UsuarioRepository;
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
public class UsuarioController {

	UsuarioRepository repository;
	
	@GetMapping("/usuario")
	public List<Usuario> getAllUsuarios(){
		return repository.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario getUsuarioById(@PathVariable int id) {
		return repository.findById(id).get();
	}
	
	@PostMapping("/usuario")
	public Usuario saveUsuario(@RequestBody Usuario usuario) {
		return repository.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public String deleteUsuario(@PathVariable int id) {
		repository.deleteById(id);
                return "Usuário Removido!!";
	}
	
	
}
