package com.cqut.epidemic.dto;

import java.io.Serializable;

/**
 * @author 罗舒月
 * @Describe 用于封装服务器到客户端的Json返回值
 * @date 2020/4/26 8:35 下午
 */
public class JSONResult<T> implements Serializable {
    //Serializable将对象的状态保存在存储媒体中以便可以在以后重新创建出完全相同的副本
    public static final int SUCCESS=0;
    public static final int ERROR=1;
    public static final int OTHER=2;

    private int state;
    private String message = "";
    private T data;
    private String pass="";

    public JSONResult(){
        state = SUCCESS;
    }
    //为了方便，重载n个构造器
    public JSONResult(int state, String message, T data) {
        super();
        this.state = state;
        this.message = message;
        this.data = data;
    }
    public JSONResult(int state, String error){
        this(state,error,null);
    }
    public JSONResult(int state, T data){
        this(state,"",data);
    }
    public JSONResult(String error){
        this(ERROR,error,null);
    }

    public JSONResult(T data){
        this(SUCCESS,"",data);
    }
    public JSONResult(int state){
        this(state,"",null);
    }
    public JSONResult(Throwable e){
        this(ERROR,e.getMessage(),null);
    }
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public T getData() {
        return data;
    }
    public void setData(T data) {
        this.data = data;
    }
    public static int getSuccess() {
        return SUCCESS;
    }
    public static int getError() {
        return ERROR;
    }
    @Override
    public String toString() {
        return "JsonResult [state=" + state + ", message=" + message + ", pass=" + pass + ", data=" + data + "]";
    }
}