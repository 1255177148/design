package com.zhan.design;

import com.zhan.design.service.adapter.DualPin;
import com.zhan.design.service.adapter.TriplePin;
import com.zhan.design.service.adapter.impl.Adapter;
import com.zhan.design.service.adapter.impl.TV;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author hezhan
 * @Date 2019/10/28 11:10
 * 适配器模式测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AdapterTest {

    /**
     * 适配器设计模式测试
     * 举例说明：
     * 1、实物（两孔插头电视机、两孔插座、三孔插座）
     * 2、电视机可以通电的两种路径，首先一个就是直接实现两孔插座类，调用两孔插座通电方法；其次就是用适配器
     * 设计模式，做一个适配器类实现三孔插座，并在内部实例化一个两孔插座，然后适配器重写三孔插座通电方法，
     * 内部调用两孔插座的通电方法，实现适配
     */
    @Test
    public void test(){
        int l = 1;
        int n = 2;
        int e = 3;
        DualPin dualPin = new TV();
        dualPin.electrify(l, n);
        TriplePin adapter = new Adapter(new TV());
        adapter.electrify(l, n, e);
    }
}
