package xyz.blueskyan.common.exception;

import lombok.Getter;

/**
 * @author Shelumiel Yan
 */

@Getter
public enum BizCodeEnum {
    UNKNOW_EXCEPTION(10000,"系统未知异常"),
    VAILD_EXCEPTION(10001,"参数格式校验失败");

    private final int code;
    private final String msg;
    BizCodeEnum(int code, String msg) {
        this.code=code;
        this.msg=msg;
    }
}
