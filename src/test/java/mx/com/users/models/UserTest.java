package mx.com.users.models;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.regex.Pattern;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest {
	
	private User user;
	private final String AGE = "29";
	private final String GENDER = "H";
	private final String GENDER_PATTERN = "[H|M]";
	private final String AGE_PATTERN = "^\\d{1,2}$";
	private final String NAME = "Diego Alejandro Rodriguez Solano";
	private final String NAME_PATTERN = "^([A-ZÑÁÉÍÓ]{1}[a-záéíóúñ]+\\s?)+$";

	
	@BeforeEach
	void create_user() {
		user = User.builder()
		.full_name(NAME)
		.age(AGE)
		.gender(GENDER)
		.build();
	}
	
	@Test
	@DisplayName("empty_constructor_test")
	void empty_constructor_test() {
		User user_empty = new User();
		assertAll(
				()-> assertNotNull(user_empty),
				()-> assertNull(user_empty.getFull_name()));
	}

	@Test
	@DisplayName("regex_name_validation_test")
	void name_validation_test() {
		assertTrue(Pattern.compile(NAME_PATTERN)
				.matcher(user.getFull_name())
				.find());
		
	}
	
	@Test
	@DisplayName("regex_age_validation_test")
	void age_validation_test() {
		assertTrue(Pattern.compile(AGE_PATTERN)
				.matcher(user.getAge())
				.find());
	}
	
	@Test
	@DisplayName("regex_gender_validation_test")
	void gender_validation_test() {
		assertTrue(Pattern.compile(GENDER_PATTERN)
				.matcher(user.getGender())
				.find());
	}

}
