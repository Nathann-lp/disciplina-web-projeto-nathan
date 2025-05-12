package br.ueg.desenvolvimento.web.projetonathan.controllers;


import br.ueg.desenvolvimento.web.projetonathan.controllers.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
    List<Aluno> findByNomeContainingIgnoreCase(String nome);
}


