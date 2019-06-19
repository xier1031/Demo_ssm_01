/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CustomerService
 * Author:   Administrator
 * Date:     2019/6/14 16:04
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xhyyinshi.demo.service;

import com.xhyyinshi.demo.model.Customer;
import com.xhyyinshi.demo.utils.PropsUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;


import static com.xhyyinshi.demo.utils.PropsUtil.*;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/6/14
 * @since 1.0.0
 */
public class CustomerService {

	private static final String DRIVER;
	private static final String URL;
	private static final String USERNAME;
	private static final String PASSWORD;
	private static final Logger LOGGER = LoggerFactory.getLogger(CustomerService.class);

	static {
		Properties conf= PropsUtil.loadProps("jdbc.properties");
		DRIVER=conf.getProperty("jdbc:driver");
		URL=conf.getProperty("jdbc.url");
		USERNAME= conf.getProperty("jdbc.username");
		PASSWORD=conf.getProperty("jdbc.password");
	}






	/**
	 * 功能描述: <br>
	 * 〈获取用户列表〉
	 *
	 * @param keyword
	 * @return: list
	 * @since: 1.0.0
	 * @Author:Administrator
	 * @Date: 2019/6/14 16:05
	 */

	public List<Customer> getCustomerList (String  keyword) {

		Connection conn =null;
		try{
			List<Customer> customerList=new ArrayList <>();
			String sql="select * from customer";
			conn= DriverManager.getConnection(URL,USERNAME,PASSWORD);
			PreparedStatement pstmt=conn.prepareStatement(sql);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next()){
				Customer customer=new Customer();
				customer.setId(rs.getLong("id"));
				customer.setName(rs.getString("name"));
				customer.setContact(rs.getString("contact"));
				customer.setTelephone(rs.getString("telephone"));
				customer.setEmail(rs.getString("email"));
				customer.setRemark(rs.getString("remark"));
				customerList.add(customer);
			}
			return customerList;
		}catch (SQLException e){
			LOGGER.error("execute sql failure",e);
		}finally {
			if (conn !=null){
				try {
					conn.close();
				}catch (SQLException e){
					LOGGER.error("close connection failure",e);
				}
			}
		}
		return  null;
	}



	/**
	 * 功能描述: <br>
	 * 〈获取指定用户〉
	 *
	 * @param id
	 * @return: customer
	 * @since: 1.0.0
	 * @Author:Administrator
	 * @Date: 2019/6/14 16:06
	 */
	public  Customer getCustomer(long id) {

	return  null;
	}

	/**
	 * 功能描述: <br>
	 * 〈创建用户〉
	 *
	 * @param map
	 * @return: boolean
	 * @since: 1.0.0
	 * @Author:Administrator
	 * @Date: 2019/6/14 16:06
	 */
	public  boolean createCustomer(Map<String,Object> map) {

		return  false;
	}

	/**
	 * 功能描述: <br>
	 * 〈更新用户〉
	 *
	 * @param map
	 * @return: boolean
	 * @since: 1.0.0
	 * @Author:Administrator
	 * @Date: 2019/6/14 16:06
	 */
	public  boolean updateCustomer(long  id ,Map<String,Object> map) {

		return  false;
	}

	/**
	 * 功能描述: <br>
	 * 〈删除用户〉
	 *
	 * @param id
	 * @return: boolean
	 * @since: 1.0.0
	 * @Author:Administrator
	 * @Date: 2019/6/14 16:06
	 */
	public  boolean deleteCustomer(long id) {

		return  false;
	}



}
