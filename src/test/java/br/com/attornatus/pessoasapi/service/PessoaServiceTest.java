package br.com.attornatus.pessoasapi.service;


import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import jakarta.persistence.EntityNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import br.com.attornatus.pessoasapi.entidade.Endereco;
import br.com.attornatus.pessoasapi.entidade.Pessoa;
import br.com.attornatus.pessoasapi.repository.EnderecoRepository;
import br.com.attornatus.pessoasapi.repository.PessoaRepository;
import br.com.attornatus.pessoasapi.service.execeptions.ResourceNotFoundException;

@ExtendWith(SpringExtension.class)
public class PessoaServiceTest {

    @InjectMocks
    private PessoaService service;

    @Mock
    private PessoaRepository repository;

    @Mock
    private EnderecoRepository enderRepository;

    /**
     *
     */
    @Test
    public void findAll_Success() {

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        when(repository.findAll()).thenReturn(pessoas);

        List<Pessoa> pessoasResp = service.findAll();

        Assertions.assertNotNull(pessoasResp);
    }

    @Test
    public void salvar_Success() {

        Pessoa pessoa = new Pessoa();

        when(repository.save(pessoa)).thenReturn(pessoa);

        Pessoa pessoaResp = service.salvar(pessoa);

        Assertions.assertEquals(pessoaResp, pessoa);
    }

    @Test
    public void findById_Success() {

        Long id = 1l;

        Pessoa p = new Pessoa();
        Optional<Pessoa> pessoa = Optional.of(p);

        when(repository.findById(id)).thenReturn(pessoa);
        List<Endereco> listEnder = new ArrayList<Endereco>();
        when(enderRepository.findByPessoa(id)).thenReturn(listEnder);

        Pessoa pessoaResp = service.findById(id);

        Assertions.assertEquals(pessoaResp, pessoa.get());
    }

    @Test
    public void update_Success() {

        Pessoa pessoa = new Pessoa();

        Long id = 1l;
        when(repository.save(pessoa)).thenReturn(pessoa);
        when(repository.getReferenceById(id)).thenReturn(pessoa);

        Pessoa pessoaResp = service.update(id, pessoa);

        Assertions.assertEquals(pessoaResp, pessoa);
    }

    @Test
    public void update_Erro() {

        Pessoa pessoa = new Pessoa();

        Long id = 1l;

        when(repository.getReferenceById(id)).thenReturn(pessoa);
        when(repository.save(pessoa)).thenThrow(new EntityNotFoundException());

        ResourceNotFoundException iae = Assertions.assertThrows(ResourceNotFoundException.class, () -> service.update(id, pessoa), "");

        Assertions.assertTrue(iae.getMessage().contains("Resource not found. id null"));
    }

    @Test
    public void delete_Success(){
        Long id = 1L;

        service.deletar(id);

    }

}
