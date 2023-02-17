package br.com.attornatus.pessoasapi.repository;


import br.com.attornatus.pessoasapi.entidade.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
