package com.tuespot.jwt.repositoryjwt;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tuespot.jwt.modelsjwt.ERole;
import com.tuespot.jwt.modelsjwt.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
