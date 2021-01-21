/**
 * Copyright © 2020-2021, Glodon Digital Supplier & Purchaser BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.app;

import com.gyoomi.example.autoconfigure.ThirdBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test
 *
 * @author Leon
 * @date 2021-01-21 11:53
 */
@RestController
public class TestController
{

	@Autowired
	private ThirdBeanService thirdBeanService;

	@GetMapping("/test")
	public String test()
	{
		return thirdBeanService.index();
	}

}
