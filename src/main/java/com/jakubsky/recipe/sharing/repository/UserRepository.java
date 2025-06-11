package com.jakubsky.recipe.sharing.repository;

import com.jakubsky.recipe.sharing.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Collection<Object> findByEmail(String email);
}
