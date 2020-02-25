package com.cc.rabbit.common.serializer;

import com.cc.rabbit.common.exception.RabbitHunterException;

import java.io.*;

/**
 * @author Cai Weihao
 * @description jdk序列化
 * @copyright Copyright (C) 2020 SHEIN, Inc. All rights reserved. <br>
 * @company
 * @date 2020年 02月25日 22:56:52
 */
public class JdkSerializer implements ObjectSerializer {
    public byte[] serialize(Object obj) throws RabbitHunterException {
        try (ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream(); ObjectOutput objectOutput = new ObjectOutputStream(arrayOutputStream)) {
            objectOutput.writeObject(obj);
            objectOutput.flush();
            return arrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new RabbitHunterException("jdk serialize error " + e.getMessage());
        }
    }

    public <T> T deSerialize(byte[] param, Class<T> clazz) throws RabbitHunterException {
        try (ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(param); ObjectInput input = new ObjectInputStream(arrayInputStream)) {
            return (T) input.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RabbitHunterException("jdk deSerialize error " + e.getMessage());
        }
    }
}