package com.app.demoapp;

@FunctionalInterface
public interface IFunction<T,R> {
    public R apply(T t);


    default String hello(){
       return "Hello there";
    }
//@Override
public boolean equals(Object ob2);
}
