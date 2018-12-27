package com.jonasrosa.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jonasrosa.cursomc.domain.Categoria;
import com.jonasrosa.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

		@Autowired
		private CategoriaRepository repo;
		
		public Optional<Categoria> buscar(Integer id) {
			Optional<Categoria> obj = repo.findById(id);
			return obj;
		}
}
