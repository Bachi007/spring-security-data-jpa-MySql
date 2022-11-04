package com.securelogin;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<user,Integer>{

	Optional<user> findByUsername(String uname);
	
}
