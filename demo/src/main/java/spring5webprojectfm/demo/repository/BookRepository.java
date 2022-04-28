package spring5webprojectfm.demo.repository;

import org.springframework.data.repository.CrudRepository;
import spring5webprojectfm.demo.domain.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
