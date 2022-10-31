package com.praticando.criteriabuilder.controllers;

import com.praticando.criteriabuilder.models.PessoaEntity;
import com.praticando.criteriabuilder.repositories.PessoaRepository;
import com.praticando.criteriabuilder.services.PessoaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/pessoas")
@RestController
public class PessoaController {

    @Autowired
    private PessoaService service;

    @Autowired
    private PessoaRepository pessoaRepository;

    @GetMapping
    public List<PessoaEntity> listarPessoas(){
        return service.listar();
    }

    @PostMapping
    public PessoaEntity salvarPessoa(@RequestBody PessoaEntity pessoa){
        return service.salvar(pessoa);
    }

    @GetMapping("/comfiltro")
    public List<PessoaEntity> buscarPersonalizada(String nome, Integer idade){
        return pessoaRepository.BuscaPersonalizadaNomeIdade(nome,idade);
    }

}
