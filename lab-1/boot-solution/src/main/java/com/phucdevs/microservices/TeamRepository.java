package microservices.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RestResource(path = "teams", rel = "teams")
public interface TeamRepository extends CrudRepository<Team, Long> {

    List<Team> findAll();

    Team findByName(String name);
}
