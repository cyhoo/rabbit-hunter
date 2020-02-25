package com.cc.rabbit.common.util;

import com.cc.rabbit.common.enums.IValueEnum;

import java.util.Arrays;

/**
 * @author Cai Weihao
 * @description 枚举工具
 * @copyright Copyright (C) 2019 CWH, Inc. All rights reserved. <br>
 * @company
 * @date 2019年 12月16日 14:35:08
 */
public class EnumMatchUtil {

    public static <E extends IValueEnum<V>,V> E matchValue(V value, E[] enums){
        if (value == null){
            return null;
        }
        if (enums == null || enums.length == 0){
            return null;
        }
        return Arrays.stream(enums).filter(f->value.equals(f.getValue())).findFirst().orElse(null);
    }
}
