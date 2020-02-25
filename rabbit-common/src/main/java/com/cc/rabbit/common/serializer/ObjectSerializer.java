package com.cc.rabbit.common.serializer;

import com.cc.rabbit.common.exception.RabbitHunterException;

/**
 * @author Cai Weihao
 * @description 序列化接口
 * @copyright Copyright (C) 2020 SHEIN, Inc. All rights reserved. <br>
 * @company
 * @date 2020年 02月25日 22:51:21
 */
public interface ObjectSerializer {

    byte[] serialize(Object obj) throws RabbitHunterException;

    <T> T deSerialize(byte[] param, Class<T> clazz) throws RabbitHunterException;
}