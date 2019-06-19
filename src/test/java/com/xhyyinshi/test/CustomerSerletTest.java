/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CustomerSerletTest
 * Author:   Administrator
 * Date:     2019/6/14 16:14
 * Description: test
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xhyyinshi.test;

import com.xhyyinshi.demo.model.Customer;
import com.xhyyinshi.demo.service.CustomerService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈test〉
 *
 * @author Administrator
 * @create 2019/6/14
 * @since 1.0.0
 */
public class CustomerSerletTest {

	private  final CustomerService customerService;


	public CustomerSerletTest (){
		customerService= new CustomerService();
	}
	@Before
	public void init(){


	}

	@Test
	public void  getCustomerListTest() throws  Exception {
		List<Customer> customerList = customerService.getCustomerList("");
		Assert.assertEquals(2,customerList.size());


	}

	@Test
	public void  getCustomerTest() throws  Exception {
		long id =1;
		Customer customer=customerService.getCustomer(id);
		Assert.assertNotNull(customer);


	}

	@Test
	public void  createCustomerTest() throws  Exception {
		Map<String,Object> fieldMap= new HashMap <>(16);
		fieldMap.put("name","customer10");
		fieldMap.put("contact","John");
		fieldMap.put("telephone","13512345678");
		boolean result = customerService.createCustomer(fieldMap);
		Assert.assertTrue(result);


	}

	@Test
	public void  updateCustomerTest() throws  Exception {
		Map<String,Object> fieldMap= new HashMap <>(16);
		long id =1 ;
		fieldMap.put("contact","Ehpson");

		boolean result = customerService.updateCustomer(id,fieldMap);
		Assert.assertTrue(result);


	}

	@Test
	public void  deleteCustomerTest() throws  Exception {
		Map<String,Object> fieldMap= new HashMap <>(16);
		long id =1 ;


		boolean result = customerService.deleteCustomer(id);
		Assert.assertTrue(result);


	}





}
