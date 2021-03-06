package com.zhan.design.service.decorator.impl;


import com.zhan.design.service.decorator.Showable;

/**
 * @Author hezhan
 * @Date 2019/11/4 13:32
 * 粉底装饰类
 */
public class Foundation extends Decorator {

    public Foundation(Showable showable) {
        super(showable);
    }

    /**
     * 粉底装饰一下
     */
    @Override
    public void show() {
        System.out.print("打粉底(");
        showable.show();
        System.out.print(")");
    }
}
