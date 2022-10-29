package com.praticando.criteriabuilder.repositories.impl;

import com.praticando.criteriabuilder.models.PessoaEntity;
import com.praticando.criteriabuilder.repositories.PessoaRepositoryQueries;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PessoaRepositoryImpl implements PessoaRepositoryQueries {
    @PersistenceContext
    private EntityManager manager;


    @Override
    public List<PessoaEntity> BuscaPersonalizadaNomeIdade(String nome, Integer idade) {
        var fabrica = manager.getCriteriaBuilder();
        var criterios = fabrica.createQuery(PessoaEntity.class);
        var root = criterios.from(PessoaEntity.class);
        var predicados = new ArrayList<Predicate>();

        if(nome != null){
            Predicate nomePredicate = fabrica.like(root.get("nome"), nome);
            predicados.add(nomePredicate);
        }
        if (idade != null){
            Predicate idadePredicate = fabrica.greaterThanOrEqualTo(root.get("idade"), idade);
            predicados.add(idadePredicate);
        }

        criterios.where(predicados.toArray(new Predicate[0]));
        var query = manager.createQuery(criterios);

        return query.getResultList();
    }

}
