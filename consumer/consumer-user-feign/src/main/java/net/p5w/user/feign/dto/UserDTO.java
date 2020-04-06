package net.p5w.user.feign.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author tboss
 */
@Data
public class UserDTO implements Serializable {
	private Integer id;
	private String name;
	private Integer age;
	private String email;
}
