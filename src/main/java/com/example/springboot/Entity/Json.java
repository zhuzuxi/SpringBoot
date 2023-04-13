package com.example.springboot.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.xml.ws.soap.Addressing;

@Data
@AllArgsConstructor
public class Json {
    private String name;
    private Integer status;
    private String error;

    private String path;
}
