package xyz.blueskyan.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PurchaseStatusEnum {
    CREATED(0, "新建"), ASSIGNED(1, "已分配"),
    RECEIVE(2, "已领取"),FINISH(3, "已完成"),HASERROR(4, "有异常");

    private final Integer code;
    private final String msg;
}
