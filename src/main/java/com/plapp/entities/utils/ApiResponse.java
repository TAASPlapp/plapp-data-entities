package com.plapp.entities.utils;

public class ApiResponse<T> {
    private Boolean success;
    private String message;
    private T content;

    public ApiResponse(Boolean success, String message, T content) {
        this.success = success;
        this.message = message;
        this.content = extraObject;
    }

    public ApiResponse(Boolean success, String message) {
        this(success, message, null);
    }

    public ApiResponse(Boolean success) {
        this(success, null);
    }

    public ApiResponse(T extraObject) {
        this(true, null, extraObject);
    }

    public ApiResponse() {
        this(true);
    }


    public Boolean getSuccess() { return success; }
    public String getMessage() { return message; }
    public T getContent() { return extraObject; }
}
