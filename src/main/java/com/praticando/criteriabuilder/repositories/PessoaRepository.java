package com.praticando.criteriabuilder.repositories;

import com.praticando.criteriabuilder.models.PessoaEntity;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, UUID>, PessoaRepositoryQueries, JpaSpecificationExecutor<PessoaEntity> {
    List<PessoaEntity> BuscaPersonalizadaNomeIdade(String nome, Integer idade);
}
