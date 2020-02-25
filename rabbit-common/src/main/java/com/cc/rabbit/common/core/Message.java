package com.cc.rabbit.common.core;

import java.io.Serializable;

/**
 * @author Cai Weihao
 * @description
 * @copyright Copyright (C) 2020 CWH, Inc. All rights reserved. <br>
 * @company
 * @date 2020年 02月25日 23:30:52
 */
public class Message implements Serializable {

    private String serializer;

    private byte[] body;
}