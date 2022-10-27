package com.praticando.criteriabuilder.services;

import com.praticando.criteriabuilder.models.PessoaEntity;
import com.praticando.criteriabuilder.repositories.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public List<PessoaEntity> listar(){
        return pessoaRepository.findAll();
    }

    public PessoaEntity salvar(  PessoaEntity pessoa){
        pessoaRepository.save(pessoa);
        return pessoa;
    }
}
