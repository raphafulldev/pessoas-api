package br.com.attornatus.pessoasapi.controller;


import br.com.attornatus.pessoasapi.entidade.Pessoa;
import br.com.attornatus.pessoasapi.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value = "/pessoas")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    public ResponseEntity<List<Pessoa>> findAll() {
        List<Pessoa> list = pessoaService.findAll();
        return ResponseEntity.ok().body(list);
    }

    @PostMapping
    public ResponseEntity<Pessoa> salvar(@RequestBody Pessoa obj) {
        obj = pessoaService.salvar(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pessoa> findById (@PathVariable Long id){
        Pessoa pessoa = pessoaService.findById(id);
        return ResponseEntity.ok().body(pessoa);
    }
    @PutMapping(value = "/{id}")
    public ResponseEntity<Pessoa> update (@PathVariable Long id, @RequestBody Pessoa obj){
        obj = pessoaService.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deletar (@PathVariable Long id){
        pessoaService.deletar(id);
        return ResponseEntity.noContent().build();
    }

}
