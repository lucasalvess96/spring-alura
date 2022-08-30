package br.com.alura.forumteste.repository;

import br.com.alura.forumteste.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * topico é a classe
 * Long é o tipo da PK
 * **/
public interface TopicoRepository extends JpaRepository<Topico, Long> {

    /**
     * filtra o curso por nome
     * Curso é uma classe
     * nome é um atributo da classe Curso
     * */
    List<Topico> findByCursoNome(String nomeCurso);
}
