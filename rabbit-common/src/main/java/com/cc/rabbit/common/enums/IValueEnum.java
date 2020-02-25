package com.cc.rabbit.common.enums;

import java.util.Arrays;

/**
 * @author Cai Weihao
 * @description 字符串值枚举接口
 * @copyright Copyright (C) 2019 SHEIN, Inc. All rights reserved. <br>
 * @company
 * @date 2019年 12月16日 14:26:11
 */
public interface IValueEnum<V> {

    /**
     * 获取值
     * @param
     * @return V
     * @author Cai Weihao
     * @date 2019/12/16 14:27
     */
    V getValue();

}
