package com.zhongwei.lvzhixuanmanage.utils;

import com.alibaba.fastjson.JSONObject;
import com.zhongwei.lvzhixuanmanage.exception.BusinessException;
import com.zhongwei.lvzhixuanmanage.vo.ResultCode;

public class ResultMsgUtils {
    final static String KEY_CODE = "code"; //结果代码的key
    final static String KEY_MSG = "msg"; //结果消息的key
    final static String KEY_COUNT = "count";//总信息数
    final static String KEY_DATA = "data"; //结果数据的key


    private JSONObject json = new JSONObject();

    public ResultMsgUtils put(int code, String msg) {
        json.put(KEY_CODE, code);
        json.put(KEY_MSG, msg);
        return this;
    }

    public ResultMsgUtils put(int code, String msg, Object data) {
        json.put(KEY_CODE, code);
        json.put(KEY_MSG, msg);
        json.put(KEY_DATA,data);
        return this;
    }

    //成功
    public static ResultMsgUtils success() {
        return new ResultMsgUtils().put(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg());
    }

    //返回成功带数据
    public static ResultMsgUtils success(Object data) {
        return new ResultMsgUtils().put(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMsg(), data);
    }

    //失败
    public static ResultMsgUtils failure(ResultCode resultCode) {
        return new ResultMsgUtils().put(resultCode.getCode(), resultCode.getMsg());
    }

    //返回失败带数据
    public static JSONObject failure(ResultCode resultCode, Object data) {
        return new ResultMsgUtils().put(resultCode.getCode(), resultCode.getMsg(), data).getResultJson();
    }

    /**
     * 自定义异常返回的结果
     *
     * @param businessException 自定义异常处理类
     * @return 返回自定义异常
     */
    public static ResultMsgUtils defineError(BusinessException businessException) {
        return new ResultMsgUtils().put(businessException.getErrorCode(), businessException.getErrorMessage());
    }


    /**
     * 设置成功消息
     */
    public ResultMsgUtils setSuccess() {
        json.put(KEY_CODE, ResultCode.SUCCESS.getCode());
        json.put(KEY_MSG, ResultCode.SUCCESS.getMsg());
        return this;
    }

    /**
     * 设置失败消息
     */
    public ResultMsgUtils setFail() {
        json.put(KEY_CODE, ResultCode.FAIL.getCode());
        json.put(KEY_MSG, ResultCode.FAIL.getMsg());
        return this;
    }

    public void setIsUsedPlace() {
        json.put(KEY_CODE, ResultCode.IsUsedPlace.getCode());
        json.put(KEY_MSG, ResultCode.IsUsedPlace.getMsg());
    }


    public void setTypeNameExist() {
        json.put(KEY_CODE, ResultCode.TYPE_NAME_EXIST.getCode());
        json.put(KEY_MSG, ResultCode.TYPE_NAME_EXIST.getMsg());
    }

    public void setInfoNameExist() {
        json.put(KEY_CODE, ResultCode.INFO_NAME_EXIST.getCode());
        json.put(KEY_MSG, ResultCode.INFO_NAME_EXIST.getMsg());
    }

    public void setDataEmpty() {
        json.put(KEY_CODE, ResultCode.EMPTY.getCode());
        json.put(KEY_MSG, ResultCode.EMPTY.getMsg());
    }


    /**
     * 根据更新成功的数量是否设置成功消息
     *
     * @param success
     * @return
     */
    public ResultMsgUtils setMsgByUpdate(int success) {
        if (success > 0) {
            this.setSuccess();
        } else {
            this.setFail();
        }
        return this;
    }

    /**
     * 根据对象是否为null设置成功消息
     *
     * @param o
     * @return
     */
    public ResultMsgUtils setMsgByNull(Object o) {
        if (o == null) {
            this.setFail();
        } else {
            this.setSuccess();
        }
        return this;
    }

    /**
     * 用户已经失效
     */
    public void UserFailure() {
        json.put(KEY_CODE, ResultCode.USER_FAILURE.getCode());
        json.put(KEY_MSG, ResultCode.USER_FAILURE.getMsg());
    }

    /**
     * 设置消息代码
     *
     * @param resultCode
     */
    public ResultMsgUtils setResultCode(ResultCode resultCode) {
        json.put(KEY_CODE, resultCode.getCode());
        json.put(KEY_MSG, resultCode.getMsg());
        return this;
    }


    public void setResultJson(JSONObject json) {
        this.json = json;
    }


    /**
     * 获取结果json
     *
     * @return
     */
    public JSONObject getResultJson() {
        return json;
    }

    public String getJsonString() {
        return json.toJSONString();
    }

    public void setPage(long current, long total, long pages) {
    }


}
