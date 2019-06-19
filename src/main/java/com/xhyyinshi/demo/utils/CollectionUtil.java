/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: CollectionUtil
 * Author:   Administrator
 * Date:     2019/6/14 17:15
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xhyyinshi.demo.utils;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.Collection;
import java.util.Map;

/**
 * 〈一句话功能简述〉<br> 
 * 〈集合工具类〉
 *
 * @author Administrator
 * @create 2019/6/14
 * @since 1.0.0
 */
public class CollectionUtil {
	/**
	 * 判断Collection是否为空
	 */
	public static boolean isEmpty(Collection <?> collection){
		return CollectionUtils.isEmpty(collection);
	}
	/**
	 *判断Collection是否非空
	 */
	public static boolean isNotEmpty(Collection<?> collection){
		return !isEmpty(collection);
	}
	/**
	 * 判断Map是否为空
	 */
	public static boolean isEmpty(Map<?,?> map ){
		return MapUtils.isEmpty(map);
	}
	/**
	 * 判断Map是否非空
	 */
	public static boolean isNotEmpty(Map<?,?> map){
		return !isEmpty(map);
	}


}
