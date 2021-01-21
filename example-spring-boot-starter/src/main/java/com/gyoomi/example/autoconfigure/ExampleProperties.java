/**
 * Copyright © 2020-2021, Glodon Digital Supplier & Purchaser BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.example.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Example - 配置类
 *
 * @author Leon
 * @date 2021-01-21 10:33
 */
@ConfigurationProperties(prefix = "example")
public class ExampleProperties
{
	/**
	 * name
	 */
	private String name;

	/**
	 * age
	 */
	private Integer age;

	/**
	 * hobby
	 */
	private List<String> hobby;

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public Integer getAge()
	{
		return age;
	}

	public void setAge(Integer age)
	{
		this.age = age;
	}

	public List<String> getHobby()
	{
		return hobby;
	}

	public void setHobby(List<String> hobby)
	{
		this.hobby = hobby;
	}

}
