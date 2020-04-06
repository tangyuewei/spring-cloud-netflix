package net.p5w.user.feign.client.fallback;

import net.p5w.user.feign.client.ConsumerUserFeign;
import net.p5w.user.feign.dto.UserDTO;
import org.springframework.stereotype.Component;

/**
 * @author tboss
 */
@Component
public class ConsumerUserFeignFallback implements ConsumerUserFeign {

	@Override
	public UserDTO findById(Integer id) {
		UserDTO userDTO = new UserDTO();
		userDTO.setAge(0);
		userDTO.setEmail(null);
		userDTO.setId(null);
		userDTO.setName(null);
		return userDTO;
	}
}
