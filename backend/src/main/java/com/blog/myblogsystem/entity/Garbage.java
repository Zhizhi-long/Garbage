package com.blog.myblogsystem.entity;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@Data



public class Garbage {
    int GarbageID;
    String garbagename;
    String kind;
}
