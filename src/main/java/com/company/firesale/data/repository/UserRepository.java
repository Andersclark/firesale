package com.company.firesale.data.repository;

import com.company.firesale.data.entity.User;
import com.company.firesale.json_classes.UserDetailsJsonClass;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findDistinctFirstByUsernameIgnoreCase(String username);

}