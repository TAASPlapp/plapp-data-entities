package com.plapp.entities.utils;

public class ApiResponse<T> {
    private Boolean success;
    private String message;
    private T extraObject;

    public ApiResponse(Boolean success, String message, T extraObject) {
        this.success = success;
        this.message = message;
        this.extraObject = extraObject;
    }

    public ApiResponse(Boolean success, String message) {
        this(success, message, null);
    }

    public ApiResponse(Boolean success) {
        this(success, null);
    }

    public ApiResponse() {
        this(true);
    }


    public Boolean getSuccess() { return success; }
    public String getMessage() { return message; }
    public T getExtraObject() { return extraObject; }
}
