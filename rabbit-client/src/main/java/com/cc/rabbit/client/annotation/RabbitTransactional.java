package com.cc.rabbit.client.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Cai Weihao
 * @description
 * @copyright Copyright (C) 2020 CWH, Inc. All rights reserved. <br>
 * @company
 * @date 2020年 02月25日 23:24:06
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface RabbitTransactional {

}