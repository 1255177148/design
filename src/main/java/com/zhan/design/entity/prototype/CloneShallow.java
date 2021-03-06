package com.zhan.design.entity.prototype;

/**
 * @Author hezhan
 * @Date 2019/10/24 11:30
 * 用于测试原型设计模式（作为引用对象，浅度克隆部分）
 */
public class CloneShallow {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
