package com.zhan.design.service.adapter.impl;


import com.zhan.design.service.adapter.DualPin;
import com.zhan.design.service.adapter.TriplePin;

/**
 * @Author hezhan
 * @Date 2019/10/28 11:08
 */
public class Adapter implements TriplePin {

    private DualPin dualPin;

    public Adapter(DualPin dualPin){
        this.dualPin = dualPin;
    }

    @Override
    public void electrify(int l, int n, int e) {
        dualPin.electrify(l, n);
    }
}
