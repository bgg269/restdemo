package fi.haagahelia.course.domain;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Book, Long> {

    List<Book> findByLastName(String lastName);
    
}