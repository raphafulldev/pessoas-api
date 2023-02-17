package br.com.attornatus.pessoasapi.service;

import br.com.attornatus.pessoasapi.entidade.Endereco;
import br.com.attornatus.pessoasapi.entidade.Pessoa;
import br.com.attornatus.pessoasapi.repository.EnderecoRepository;
import jakarta.persistence.ManyToOne;
import org.hibernate.metamodel.model.domain.EmbeddableDomainType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
public class EnderecoServiceTest {

    @InjectMocks
    private EnderecoService service;

    @Mock
    private EnderecoRepository repository;

    @Test
    public void findAll_Success(){
        List<Endereco> enderecos = new ArrayList<>();

        when(repository.findAll()).thenReturn(enderecos);
        List<Endereco> list = service.findAll();

        Assertions.assertNotNull(list);

    }

    @Test
    public void salvar_Success (){

        Endereco endereco = new Endereco();

        when(repository.save(endereco)).thenReturn(endereco);

        Endereco end = service.salvar(endereco);

        Assertions.assertEquals(end, endereco);

    }

    @Test
    public void findById_Success (){

        Long id = 1L;

        Endereco end = new Endereco();
        Optional<Endereco> endereco = Optional.of(end);

        when(repository.findById(id)).thenReturn(endereco);

        List<Endereco> listEnder = new ArrayList<Endereco>();
        when(repository.findByPessoa(id)).thenReturn(listEnder);

        Endereco endResp = service.findById(id);

        Assertions.assertEquals(endResp, endereco.get());

    }
    @Test
    public void delete_Success(){
        Long id = 1L;

        service.deletar(id);

    }

    @Test
    public void findByPessoa_Success(){

        Long id = 1L;

        List<Endereco> list = new ArrayList<>();

        when(service.findByPessoa(id)).thenReturn(list);

        List<Endereco> listSuccess = service.findByPessoa(id);

        Assertions.assertEquals(listSuccess, list);

    }


}
