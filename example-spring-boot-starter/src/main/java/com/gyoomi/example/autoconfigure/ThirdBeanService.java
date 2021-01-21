/**
 * Copyright © 2020-2021, Glodon Digital Supplier & Purchaser BU.
 * <p>
 * All Rights Reserved.
 */

package com.gyoomi.example.autoconfigure;

/**
 * 模拟第三方jar中的服务类
 *
 * @author Leon
 * @date 2021-01-21 11:11
 */
public class ThirdBeanService
{

	public String index()
	{
		return "第三方jar服务[OK]";
	}

}
