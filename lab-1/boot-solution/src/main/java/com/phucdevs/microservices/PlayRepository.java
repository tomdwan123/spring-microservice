package microservices.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "players", rel = "players")
public interface PlayRepository extends CrudRepository<Player, Long> {

    List<Player> findAll();

    Player findByName(String name);
}
