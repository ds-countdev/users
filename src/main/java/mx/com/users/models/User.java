package mx.com.users.models;

import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {

	@JsonProperty("name")
	@Pattern(regexp ="^([A-Z—¡…Õ”]{1}[a-z·ÈÌÛ˙Ò]+\\s?)+$")
	private String full_name;
	
	@Pattern(regexp = "^\\d{1,2}$")
	private String age;
	
	@Pattern(regexp = "[H|M]")
	private String gender;
}
