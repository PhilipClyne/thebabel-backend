package springbootmongodb.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import springbootmongodb.model.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
