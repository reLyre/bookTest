package com.book.user.service.exception;

import com.book.common.enums.CodeMsgEnum;
import com.book.common.exception.BaseException;

public class UserException extends BaseException {
    public UserException() {};

    public UserException(CodeMsgEnum codeMsgEnum) {
        super(codeMsgEnum);
    }
}
