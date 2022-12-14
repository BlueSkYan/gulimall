package xyz.blueskyan.common.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PurchaseDetailStatusEnum {
    CREATED(0, "新建"), ASSIGNED(1, "已分配"),
    BUYING(2, "正在采购"),FINISH(3, "已完成"),HASERROR(4, "采购失败");

    private final Integer code;
    private final String msg;
}
