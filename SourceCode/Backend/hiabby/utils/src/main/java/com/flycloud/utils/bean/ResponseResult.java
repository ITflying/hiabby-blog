package com.flycloud.utils.bean;

import java.io.Serializable;

/**
 * @author
 * @date 2019/8/9 15:06
 **/
public class ResponseResult implements Serializable {
    public static final String RESULT_STATUS_SUCCESS = "success";
    public static final String RESULT_STATUS_FAIL = "failed";

    //运行异常
    public static final String RESULT_STATUS_CODE_RUNTIME_ERROR = "301";

    /**
     * 执行成功标识
     */
    private String status = RESULT_STATUS_SUCCESS;

    /**
     * 执行提示信息
     */
    private String msg = "";

    /**
     * 执行返回结果对象
     */
    private Object result;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setFailInfo(String msg, String status){
        this.msg = msg;
        this.status = status;
    }

    @Override
    public String toString() {
        return "ResponseResult{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
