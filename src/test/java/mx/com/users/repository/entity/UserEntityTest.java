package mx.com.users.repository.entity;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserEntityTest {
	
	private final String NAME = "Diego Alejandro Rodriguez Solano";
	private final Integer AGE = 29;
	private final Character GENDER = 'H';

	@Test
	@DisplayName("create_user_entity_test")
	void create_user_entity() {
		UserEntity user_entity = UserEntity.builder()
				.user_name(NAME)
				.age(AGE)
				.gender(GENDER)
				.creation_date(LocalDate.now())
				.last_update_date(LocalDate.now())
				.build();
		assertNotNull(user_entity);
	}
	
	@Test
	@DisplayName("constructor_empty_test")
	void user_constructor_empty_test() {
		UserEntity user_entity_empty = new UserEntity();
		assertNotNull(user_entity_empty);
	}
	

}
