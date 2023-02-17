package br.com.attornatus.pessoasapi.service;


import br.com.attornatus.pessoasapi.entidade.Endereco;
import br.com.attornatus.pessoasapi.repository.EnderecoRepository;
import br.com.attornatus.pessoasapi.service.execeptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {

    @Autowired
    private EnderecoRepository repository;

    public List<Endereco> findAll() {
        return repository.findAll();
    }

    public Endereco salvar(Endereco Endereco) {
        return repository.save(Endereco);
    }

    public Endereco findById(Long id) {
        Optional<Endereco> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public List<Endereco> findByPessoa(Long id) {
        List<Endereco> obj = repository.findByPessoa(id);
        return obj;
    }

    public void deletar (Long id){
        repository.deleteById(id);
    }

}
