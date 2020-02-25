package com.cc.rabbit.common.enums;

import com.cc.rabbit.common.serializer.JdkSerializer;
import com.cc.rabbit.common.serializer.ObjectSerializer;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Cai Weihao
 * @description 序列化
 * @copyright Copyright (C) 2020 SHEIN, Inc. All rights reserved. <br>
 * @company 南京领添科技有限公司
 * @date 2020年 02月25日 23:45:47
 */
@AllArgsConstructor
@Getter
public enum SerializerEnum implements IValueEnum<String> {
    JDK("jdk",new JdkSerializer()),

    ;

    private String value;
    private ObjectSerializer serializer;

    @Override
    public String getValue() {
        return this.value;
    }
}