package net.p5w.provider.controller;

import net.p5w.provider.domain.User;
import net.p5w.provider.mapper.UserMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author tboss
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

	@Resource
	private UserMapper UserMapper;

	@GetMapping("{id}")
	public User findById(@PathVariable Integer id) {
		User user = UserMapper.selectByPrimaryKey(id);
		return user;
	}
}
