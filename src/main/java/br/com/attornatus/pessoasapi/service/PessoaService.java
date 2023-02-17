package br.com.attornatus.pessoasapi.service;


import br.com.attornatus.pessoasapi.entidade.Endereco;
import br.com.attornatus.pessoasapi.entidade.Pessoa;
import br.com.attornatus.pessoasapi.repository.EnderecoRepository;
import br.com.attornatus.pessoasapi.repository.PessoaRepository;
import br.com.attornatus.pessoasapi.service.execeptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private PessoaRepository repository;


    public List<Pessoa> findAll() {
        return repository.findAll();
    }

    public Pessoa salvar(Pessoa pessoa) {
        return repository.save(pessoa);
    }

    public Pessoa findById(Long id) {
        Optional<Pessoa> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));

    }


    public Pessoa update(Long id, Pessoa obj) {
        try {
            Pessoa entity = repository.getReferenceById(id);
            updateData(entity, obj);
            return repository.save(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(e.getMessage());
        }
    }

    private void updateData(Pessoa entity, Pessoa obj) {
        entity.setNome(obj.getNome());
        entity.setDtNascimento(obj.getDtNascimento());
        entity.setEnderecos(obj.getEnderecos());
    }

}
