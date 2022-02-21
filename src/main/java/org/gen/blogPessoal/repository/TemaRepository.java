package org.gen.blogPessoal.repository;

import java.util.List;

import org.gen.blogPessoal.model.Tema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository extends JpaRepository<Tema, Long>{

	public List<Tema> findAllByDescricaoContainingIgnoreCase( String decricao);
}
