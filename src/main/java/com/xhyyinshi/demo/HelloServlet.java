/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: HeiilServlet
 * Author:   Administrator
 * Date:     2019/6/14 9:11
 * Description: 测试
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xhyyinshi.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author Administrator
 * @create 2019/6/14
 * @since 1.0.0
 */
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {


@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp)
		throws ServletException, IOException {
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String currentTime = dateFormat.format(new Date());
	req.setAttribute("currentTime", currentTime);
	req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req,
			resp);

}
}
