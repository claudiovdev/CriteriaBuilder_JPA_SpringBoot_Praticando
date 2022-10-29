package com.praticando.criteriabuilder.repositories;

import com.praticando.criteriabuilder.models.PessoaEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface PessoaRepositoryQueries {
     List<PessoaEntity> BuscaPersonalizadaNomeIdade(String nome, Integer idade);


}
