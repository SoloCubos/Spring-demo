package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@GetMapping("/status")
	public String status() {
		return "Si Funciona!!!";
	}
	
	@GetMapping
	public String allCategorias() {
		return "Listar Categorias";
	}
	
	@GetMapping("/{id}")
	public String categoriaById(@PathVariable String id) {
		return "categoria by " + id;
	}
	
	@PostMapping
	public String addCategorias(@RequestBody Categoria categoria){
		return "Post Categorias";
	}
	
	@PutMapping("/{id}")
	public String updateCategorias(@PathVariable String id, @RequestBody String descripcion){
		return "Put Categorias " + id;
	}
	
	@DeleteMapping("/{id}")
	public String deleteCategorias(@PathVariable String id){
		return "Delete Categorias " + id;
	}
	
}
