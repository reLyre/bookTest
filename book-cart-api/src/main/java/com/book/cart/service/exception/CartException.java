package com.book.cart.service.exception;


import com.book.common.enums.CodeMsgEnum;
import com.book.common.exception.BaseException;

public class CartException extends BaseException {

    public CartException() {}
    public CartException(CodeMsgEnum codeMsgEnum) {
        super(codeMsgEnum);
    }
}
