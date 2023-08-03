package mx.com.users.repository.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_user;
	
	@Column(nullable = false)
	private String user_name;
	
	@Column(nullable = false)
	private Integer age;
	
	@Column(nullable = false, length = 1, columnDefinition ="VARCHAR")
	private Character gender;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate creation_date;
	
	@Column(nullable = false, columnDefinition = "DATE")
	private LocalDate last_update_date;
	
	

}
