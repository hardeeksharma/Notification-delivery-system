package com.hardeek.sd.model.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

class ApiSuccess {

    private HttpStatus status;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timestamp;
    private String message;
    private Map<String,Object> data = new HashMap<String,Object>();

    private ApiSuccess() {
        timestamp = LocalDateTime.now();
    }

    ApiSuccess(HttpStatus status,String message) {
        this();
        this.status = status;
        this.message = message;
    }

    public Map<String, Object> getData() {
        return data;
    }

    public void setData(Map<String, Object> data) {
        this.data = data;
    }
}
