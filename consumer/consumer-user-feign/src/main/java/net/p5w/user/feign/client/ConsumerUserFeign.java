package net.p5w.user.feign.client;

import net.p5w.user.feign.client.fallback.ConsumerUserFeignFallback;
import net.p5w.user.feign.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author tboss
 */
@FeignClient(name = "provider-user",path = "user",fallback = ConsumerUserFeignFallback.class)
public interface ConsumerUserFeign {

	/**
	 *
	 * @param id
	 * @return
	 */
	@GetMapping(value = "{id}")
	UserDTO findById(@PathVariable Integer id);
}
