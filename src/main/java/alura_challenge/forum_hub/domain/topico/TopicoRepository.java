package alura_challenge.forum_hub.domain.topico;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
    // Aqui verificamos se já existe um tópico com o mesmo título E mesma mensagem
    boolean existsByTituloAndMensagem(String titulo, String mensagem);
}
