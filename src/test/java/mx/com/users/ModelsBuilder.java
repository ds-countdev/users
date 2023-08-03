package mx.com.users;

import mx.com.users.models.User;

public class ModelsBuilder {
	
	private static final String NAME = "Diego Alejandro Rodriguez Solano";
	private static final String AGE = "29";
	private static final String GENDER = "H";

	public static User create_user_model() {
		return User.builder()
			.full_name(NAME)
			.age(AGE)
			.gender(GENDER)
			.build();
	}
}
