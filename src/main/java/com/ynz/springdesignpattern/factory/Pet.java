package com.ynz.springdesignpattern.factory;

public interface Pet {
    void setName(String name);

    String getName();

    String getType();

    boolean isHungry();

    void feed();
}
