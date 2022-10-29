package com.praticando.criteriabuilder.spec;

import com.praticando.criteriabuilder.models.PessoaEntity;
import lombok.AllArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

@AllArgsConstructor
public class PessoaComNomeSemelhanteSpec implements Specification<PessoaEntity> {

    private final static long serialVersionUID = 1L;

    private String nome;

    @Override
    public Predicate toPredicate(Root<PessoaEntity> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        return builder.like(root.get("nome"), "%" + nome + "%");
    }
}
