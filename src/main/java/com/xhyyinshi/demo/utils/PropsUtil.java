/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PropsUtil
 * Author:   Administrator
 * Date:     2019/6/14 16:51
 * Description: 读取配置文件
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xhyyinshi.demo.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * 〈一句话功能简述〉<br> 
 * 〈读取配置文件〉
 *
 * @author Administrator
 * @create 2019/6/14
 * @since 1.0.0
 */
public class PropsUtil {


private  static  final Logger LOGGER= LoggerFactory.getLogger(PropsUtil.class);


	public static Properties loadProps(String fileName) {
		Properties properties = null;
		InputStream inputStream = null;
		try {
			inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(fileName);
			if (inputStream == null) {
				throw new FileNotFoundException(fileName + " file is not found!");
			}
			properties = new Properties();
			properties.load(inputStream);
		} catch (IOException e) {
			LOGGER.error("load properties file failure", e);
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					LOGGER.error("close input stream failure", e);
				}
			}
		}
		return properties;
	}





	/*
	 * 获取字符型属性（默认为空字符串）
	 *
	 * */
	public static String getString(Properties props, String key) {
		return getString(props, key, "");
	}

	/*
	 * 获取字符型属性（可指定默认值）
	 * */
	public static String getString(Properties props, String key, String
			defaultValue) {
		String value = defaultValue;
		if (props.containsKey(key)) {
			value = props.getProperty(key);
		}
		return value;
	}

	/*
	 * 获取数值类型属性（默认为0）
	 * */
	public static int getInt(Properties props, String key) {
		return getInt(props, key, 0);
	}

	/*
	 * 获取数值类型属性（可指定默认值）
	 * */
	public static int getInt(Properties props, String key, int defaultValue) {
		int value = defaultValue;
		if (props.containsKey(key)) {
			value = CastUtil.castInt(props.getProperty(key));
		}
		return value;
	}

	/*
	 * 获取布尔型属性（默认值为false）
	 * */
	public static boolean getBoolean(Properties props, String key) {
		return getBoolean(props, key, false);
	}

	/*
	 * 获取布尔型属性（可指定默认值）
	 * */
	public static boolean getBoolean(Properties props, String key, Boolean defaultValue) {
		boolean value = defaultValue;
		if (props.containsKey(key)) {
			value = CastUtil.castBoolean(props.getProperty(key));
		}
		return value;
	}




}
