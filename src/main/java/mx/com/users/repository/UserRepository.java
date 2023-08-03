package mx.com.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import mx.com.users.repository.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Long>{

	@Query(nativeQuery = true, value ="SELECT * FROM users")
	public List<UserEntity> get_all_users();
}
