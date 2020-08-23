package org.launchcode.symptomtracker.models.data;

import org.launchcode.symptomtracker.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByUsername(String username);

}
