package com.scaler.suman.UserAuthService1.repos;

import com.scaler.suman.UserAuthService1.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
