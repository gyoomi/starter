/**
 * Copyright © 2020-2021, Glodon Digital Supplier & Purchaser BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.example.autoconfigure;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * {@link EnableAutoConfiguration Auto-Configuration} for Example.
 *
 * @author Leon
 * @date 2021-01-21 10:50
 */
@Configuration
@ConditionalOnProperty(value = "example.name")
@EnableConfigurationProperties(ExampleProperties.class)
public class ExampleAutoConfiguration
{

	@Bean
	public ThirdBeanService thirdBeanService()
	{
		System.out.println("ThirdBeanService initial OK!");
		return new ThirdBeanService();
	}

}
