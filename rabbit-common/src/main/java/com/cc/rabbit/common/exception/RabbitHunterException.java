package com.cc.rabbit.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author Cai Weihao
 * @description
 * @copyright Copyright (C) 2020 SHEIN, Inc. All rights reserved. <br>
 * @company
 * @date 2020年 02月25日 22:53:50
 */
public class RabbitHunterException extends RuntimeException{

    public RabbitHunterException(String message) {
        super(message);
    }

    public RabbitHunterException(String message, Throwable cause) {
        super(message, cause);
    }
}