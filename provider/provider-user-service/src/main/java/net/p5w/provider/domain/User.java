package net.p5w.provider.domain;


import lombok.Data;

import java.io.Serializable;

/**
 * user
 * @author
 */
@Data
public class User implements Serializable {
	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 名字
	 */
	private String name;

	/**
	 * 年龄
	 */
	private Integer age;

	/**
	 * 邮箱
	 */
	private String email;

}