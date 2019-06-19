/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: StringUtil
 * Author:   Administrator
 * Date:     2019/6/14 17:14
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xhyyinshi.demo.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author Administrator
 * @create 2019/6/14
 * @since 1.0.0
 */
public class StringUtil {


	/*
	 * 判断字符串是否为空
	 * */
	public static boolean isEmpty(String str){
		if(str != null){
			str=str.trim();
		}
		return StringUtils.isEmpty(str);
	}
	/*
	 * 判断字符串是否非空
	 * */
	public static boolean isNotEmpty(String str){
		return !isEmpty(str);
	}


}
