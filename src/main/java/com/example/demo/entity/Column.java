package com.example.demo.entity;

public @interface Column {
    boolean updatable();

    boolean insertable();

    int length();
}
