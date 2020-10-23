package com.pedro.workshopmongo.domain.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.pedro.workshopmongo.domain.User;

@Repository
public interface UserRespository extends MongoRepository<User, String> {

}
