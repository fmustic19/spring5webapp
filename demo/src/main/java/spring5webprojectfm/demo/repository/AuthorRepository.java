package spring5webprojectfm.demo.repository;

import org.springframework.data.repository.CrudRepository;
import spring5webprojectfm.demo.domain.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
