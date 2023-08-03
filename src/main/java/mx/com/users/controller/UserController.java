package mx.com.users.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import mx.com.users.repository.entity.UserEntity;

public interface UserController {

	@GetMapping(value = "/users")
	public ResponseEntity<List<UserEntity>> get_all_users();
}
