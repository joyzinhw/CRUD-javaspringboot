package com.joyzinhw.useratividadde.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.joyzinhw.useratividadde.intitides.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
