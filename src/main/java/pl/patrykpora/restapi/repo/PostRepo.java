package pl.patrykpora.restapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.patrykpora.restapi.model.Post;


@Repository
public interface PostRepo extends JpaRepository<Post, Integer> {

}
