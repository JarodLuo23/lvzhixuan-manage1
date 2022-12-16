package com.zhongwei.lvzhixuanmanage.vo;

public enum ResultCode {
    SUCCESS(0, "success"),
    FAIL(-1, "fail"),
    ERROR(100,"上传失败，请重试"),
    USER_UNLOGIN(10001, "用户未登录"),
    USER_FAILURE(10002,"用户失效"),
    USER_UNREGISTER(20003, "用户未注册"),

    ADMIN_UNKNOWN_USERNAME(10003,"账户不存在！！"),
    ADMIN_PASSWORD_INCORRECT(10004,"密码错误！！"),
    ADMIN_LOCKED(10005,"此管理员账户已被封！！"),
    ADMIN_NOT_AUTHENTICATED(10006,"身份未认证！！请先登录！！"),
    ADMIN_PERMISSION_EXIST(10007,"权限已存在！！"),
    ADMIN_ROLE_EXIST(10008,"身份已存在！！"),
    ADMIN_USERNAME_EXIST(10009,"用户已存在！！"),
    ADMIN_HAS_PERMISSION(10011,"此用户已拥有该权限！！"),

    UNAUTHORIZED(401,"此用户无权限访问！！"),

    API_UNKNOWN_TOKEN(20001, "未知token"),

    HTTP_MEDIA_TYPE_NOT_SUPPORT(3003,"请求媒体类型错误"),
    METHOD_NOT_ALLOWED(3004,"请求方法错误"),
    PARAMETER_ERROR(3005,"参数错误"),
    PARAMETER_NOT_NULL(3006,"请求参数不能为空"),
    NULL_POINT(3007,"空指针异常"),
    CONTENT_NOT_COMPLIANCE(3010,"文本内容不合规"),
    IMAGE_NOT_COMPLIANCE(3011,"图片内容不合规"),
    OPERATION_FAIL(3014,"操作失败"),
    NAME_EXIST(3016,"名称已存在"),
    ID_NOT_EXIST(3017,"需要进行操作的ID不存在"),
    DELETE_INCLUDE_CONTENT(3018,"删除存在子内容"),

    TYPE_NAME_EXIST(5000,"该预约类型已存在"),
    INFO_NAME_EXIST(5001,"该信息已存在"),
    EMPTY(5002,"数据为空"),
    ROTATION_UPPER_LIMIT(5003,"同时启用的轮播图最多9张"),
    ASSOCIATION_FORUM_IS_EXIST(5004,"贴吧已存在"),
    USER_HAS_EXECUTE(5005,"重复操作"),
    SYS_ERROR(5555,"系统异常"),

    IsUsedPlace(5050,"该场地已有人预定，请更换时间或更换场地");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
