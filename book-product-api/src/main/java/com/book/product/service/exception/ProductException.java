package com.book.product.service.exception;


import com.book.common.enums.CodeMsgEnum;
import com.book.common.exception.BaseException;

public class ProductException extends BaseException {

    public ProductException() {}
    public ProductException(CodeMsgEnum codeMsgEnum) {
        super(codeMsgEnum);
    }
}
