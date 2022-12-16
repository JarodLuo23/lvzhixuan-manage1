package com.zhongwei.lvzhixuanmanage.exception;

import com.zhongwei.lvzhixuanmanage.vo.ResultCode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * 业务异常
 */
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class BusinessException extends RuntimeException{
    private Integer errorCode;
    private String errorMessage;

    public BusinessException(ResultCode resultCode){
        this.errorCode = resultCode.getCode();
        this.errorMessage = resultCode.getMsg();
    }
}
