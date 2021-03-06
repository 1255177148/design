package com.zhan.design.service.adapter;

public interface DualPin {

    /**
     * 两相插孔通电接口（火线和零线）
     * @param l
     * @param n
     */
    void electrify(int l, int n);
}
