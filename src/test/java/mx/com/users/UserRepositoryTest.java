package mx.com.users;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import mx.com.users.repository.UserRepository;
import mx.com.users.repository.entity.UserEntity;

@DataJpaTest
class UserRepositoryTest {
	
	@Autowired
	private UserRepository user_repository;

	@Test
	@DisplayName("get_all_user_operation_test")
	void get_all_user_test() {
		List<UserEntity> user_entity_list = user_repository.get_all_users();
		assertFalse(user_entity_list.isEmpty());
	}

}
