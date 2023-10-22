package com.book.order.service.exception;

import com.book.common.enums.CodeMsgEnum;
import com.book.common.exception.BaseException;

public class OrderException extends BaseException {
    public OrderException() {};

    public OrderException(CodeMsgEnum codeMsgEnum) {
        super(codeMsgEnum);
    }
}
