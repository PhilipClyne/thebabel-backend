package springbootmongodb.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import springbootmongodb.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {
    List<Student> findByName(String name);
    
    List<Student> findByCity(String city);
    
    List<Student> findByNameAndCity(String name, String city);
}
