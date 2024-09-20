package springbootmongodb.repositories;


import org.springframework.data.mongodb.repository.MongoRepository;

import springbootmongodb.model.User;

public interface UserRepository extends MongoRepository<User, String> {
    User findByEmail(String email);
}