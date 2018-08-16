package com.kanglian.healthcare.exception;

import com.easyway.business.framework.common.enums.BaseResultCodeEnum;
import com.easyway.business.framework.common.exception.BaseException;

/**
 * 系统异常
 * 
 * @author liuxl
 */
public class SystemException extends BaseException {

    /**
     * 
     */
    private static final long serialVersionUID = 3961857029730354375L;

    public SystemException() {
        super(BaseResultCodeEnum.SYSTEM_ERROR);
    }

    public SystemException(String message) {
        super(BaseResultCodeEnum.SYSTEM_ERROR, message);
    }

    public SystemException(String message, Throwable cause) {
        super(message, cause);
    }
}
