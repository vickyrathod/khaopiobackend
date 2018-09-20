package hacker.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import hacker.com.model.Users;

public interface UserJpaRepository extends JpaRepository<Users, Long> {
	
}
