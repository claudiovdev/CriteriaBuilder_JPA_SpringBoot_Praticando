package com.praticando.criteriabuilder.repositories.impl;

import com.praticando.criteriabuilder.models.PessoaEntity;
import com.praticando.criteriabuilder.repositories.PessoaRepositoryQueries;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class PessoaRepositoryImpl implements PessoaRepositoryQueries {
    @PersistenceContext
    private EntityManager manager;


    @Override
    public List<PessoaEntity> BuscaPersonalizadaNomeIdade(String nome, Integer idade) {
        var builder = manager.getCriteriaBuilder();
        var criteria = builder.createQuery(PessoaEntity.class);
        var query = manager.createQuery(criteria);
        return query.getResultList();
    }

}
