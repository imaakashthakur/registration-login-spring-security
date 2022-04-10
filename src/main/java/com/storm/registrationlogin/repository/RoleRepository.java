package com.storm.registrationlogin.repository;

import com.storm.registrationlogin.models.ERole;
import com.storm.registrationlogin.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
        Optional<Role> findByName(ERole name);

}
