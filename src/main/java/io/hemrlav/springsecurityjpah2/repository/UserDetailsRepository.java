package io.hemrlav.springsecurityjpah2.repository;

import io.hemrlav.springsecurityjpah2.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserDetailsRepository extends CrudRepository<User, Integer> {

    Optional<User> findByUserName(String userName);

}
