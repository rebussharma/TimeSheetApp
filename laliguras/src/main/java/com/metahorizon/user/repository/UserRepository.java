package com.metahorizon.user.repository;

import com.metahorizon.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Asus on 5/16/2018.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
