package com.cc.rabbit.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author Cai Weihao
 * @description
 * @copyright Copyright (C) 2020 SHEIN, Inc. All rights reserved. <br>
 * @company
 * @date 2020年 02月25日 22:45:31
 */
@AllArgsConstructor
public enum RabbitActionEnum implements IValueEnum<String>{
    PREPARE("prepare"),
    COMMIT("commit")
    ;

    private String value;

    @Override
    public String getValue() {
        return this.value;
    }
}