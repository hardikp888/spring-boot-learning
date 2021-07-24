package com.hardik.springbootjpa.database;

import com.hardik.springbootjpa.database.entity.User;
import com.hardik.springbootjpa.model.UserStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findUserByStatus(UserStatus status);

}
