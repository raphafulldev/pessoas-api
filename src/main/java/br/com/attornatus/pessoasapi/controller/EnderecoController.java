package br.com.attornatus.pessoasapi.controller;


import br.com.attornatus.pessoasapi.entidade.Endereco;
import br.com.attornatus.pessoasapi.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<List<Endereco>> findAll() {
        List<Endereco> list = enderecoService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Endereco> salvar(@RequestBody Endereco obj) {
        obj = enderecoService.salvar(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Endereco> findById (@PathVariable Long id){
        Endereco pessoa = enderecoService.findById(id);
        return ResponseEntity.ok().body(pessoa);
    }

}
