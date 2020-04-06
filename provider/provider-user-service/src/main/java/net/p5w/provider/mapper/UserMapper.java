package net.p5w.provider.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import net.p5w.provider.domain.User;

public interface UserMapper extends BaseMapper<User> {
	int deleteByPrimaryKey(Integer id);

	/**
	 * 添加用户
	 * @param record
	 * @return
	 */
	@Override
	int insert(User record);

	User selectByPrimaryKey(Integer id);

	/**
	 * 更新用户
	 * @param record
	 * @return
	 */
	int update(User record);

}
