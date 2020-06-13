package com.zhan.design.service.decorator.impl;


import com.zhan.design.service.decorator.Showable;

/**
 * @Author hezhan
 * @Date 2019/11/4 10:15
 */
public class Girl implements Showable {
    @Override
    public void show() {
        System.out.print("素颜");
    }
}
