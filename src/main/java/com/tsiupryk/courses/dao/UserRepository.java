package com.tsiupryk.courses.dao;

import com.tsiupryk.courses.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Vitaliy on 24.10.2017.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
