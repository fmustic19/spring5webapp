package spring5webprojectfm.demo.repository;

import org.springframework.data.repository.CrudRepository;
import spring5webprojectfm.demo.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
