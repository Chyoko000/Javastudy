package com.Situ.Day5.inter;
//在Java中，可以使用abstract class来声明一个抽象类，
// 使用interface来声明一个接口。
public class DaYan implements  IFly{

    @Override
    public void fly() {
        System.out.println("DaYan.fly");
    }
}
