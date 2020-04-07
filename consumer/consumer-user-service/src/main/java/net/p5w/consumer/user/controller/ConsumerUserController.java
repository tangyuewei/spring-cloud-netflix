package net.p5w.consumer.user.controller;

import lombok.extern.slf4j.Slf4j;
import net.p5w.user.feign.client.ConsumerUserFeign;
import net.p5w.user.feign.dto.UserDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author tboss
 */
@RestController
@Slf4j
public class ConsumerUserController {

	@Resource
	private ConsumerUserFeign consumerUserFeign;

	@GetMapping(value = "user/{id}")
	public UserDTO findById(@PathVariable Integer id) {
		log.info("进入此方法！id：" + id);
		return consumerUserFeign.findById(id);
	}
}
