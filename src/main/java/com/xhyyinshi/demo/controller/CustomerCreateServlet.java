/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CustomerCreateServlet
 * Author:   Administrator
 * Date:     2019/6/14 15:58
 * Description: 创建
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xhyyinshi.demo.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 〈一句话功能简述〉<br> 
 * 〈创建〉
 *
 * @author Administrator
 * @create 2019/6/14
 * @since 1.0.0
 */
@WebServlet("/customer_create")
public class CustomerCreateServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doGet(req, resp);
	}


}
