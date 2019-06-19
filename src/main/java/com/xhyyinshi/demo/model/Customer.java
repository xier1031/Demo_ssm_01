/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Customer
 * Author:   Administrator
 * Date:     2019/6/14 15:32
 * Description: 顾客
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.xhyyinshi.demo.model;

import lombok.Data;


import java.io.Serializable;

/**
 * 〈一句话功能简述〉<br> 
 * 〈顾客〉
 *
 * @author Administrator
 * @create 2019/6/14
 * @since 1.0.0
 */
@Data
public class Customer implements Serializable {

private Long id;
private  String  name ;
private  String  contact;
private  String  telephone;
private String  email;
private   String remark;

}
