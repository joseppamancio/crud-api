package com.crud.test.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.test.domain.model.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{
	
	List<Pessoa> findByNomeContaining(String nome);
	Pessoa findByCpf(String cpf);

}
