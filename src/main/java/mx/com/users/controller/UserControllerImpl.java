package mx.com.users.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.users.repository.UserRepository;
import mx.com.users.repository.entity.UserEntity;

@RestController
@RequestMapping(path = "/api/v1")
public class UserControllerImpl implements UserController {
	
	@Autowired
	private UserRepository user_repository;

	@Override
	public ResponseEntity<List<UserEntity>> get_all_users() {
		return ResponseEntity.status(HttpStatus.OK).body(user_repository.get_all_users());
	}

}
