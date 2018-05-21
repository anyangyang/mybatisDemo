package com.mybatisDemo.modal;

import lombok.Data;

import java.util.Date;

@Data
public class Entity {
    private Long id;
    protected String isDeleted;
    protected Date gmtCreate;
    protected Long creator;
    protected Date gmtModified;
    protected Long modifier;

}
