package br.com.attornatus.pessoasapi.repository;


import br.com.attornatus.pessoasapi.entidade.Endereco;
import br.com.attornatus.pessoasapi.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {


    @Query("SELECT e FROM Endereco e JOIN e.pessoa p WHERE p.id = :idPessoa")
    List<Endereco> findByPessoa(Long idPessoa);



}
