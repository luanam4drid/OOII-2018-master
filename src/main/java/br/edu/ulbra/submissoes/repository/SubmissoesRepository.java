package br.edu.ulbra.submissoes.repository;

import br.edu.ulbra.submissoes.model.Submissoes;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubmissoesRepository extends CrudRepository<Submissoes, Long> {
}
