package com.northcoders.SecurityPlayground.repository;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.northcoders.SecurityPlayground.model.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<UserEntity,Long> {
public Optional<UserEntity> findBygitHubUserName(String githubUserName);
}
