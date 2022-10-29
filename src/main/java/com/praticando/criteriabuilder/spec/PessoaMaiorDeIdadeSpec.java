package com.praticando.criteriabuilder.spec;

import com.praticando.criteriabuilder.models.PessoaEntity;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.math.BigDecimal;
import java.math.BigInteger;

public class PessoaMaiorDeIdadeSpec implements Specification<PessoaEntity> {

    private final static long serialVersionUID = 1L;


    @Override
    public Predicate toPredicate(Root<PessoaEntity> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        return builder.greaterThanOrEqualTo(root.get("idade"), 18);
    }
}
