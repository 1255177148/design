package com.zhan.design.service.state1.impl;

import com.zhan.design.service.state1.State;
import com.zhan.design.util.SpringUtils;
import com.zhan.design.util.state_patterns.Switcher;
import org.springframework.stereotype.Service;

/**
 * @Author hezhan
 * @Date 2019/10/30 13:52
 * 实现抽象状态下关灯状态的实现类
 */
@Service
public class OffState implements State {
    @Override
    public void turnOn(Switcher switcher) {
        //逻辑代码
        switcher.setState(SpringUtils.getBean("onState", State.class));
        System.out.println("开灯");
    }

    @Override
    public void turnOff(Switcher switcher) {
        System.out.println("已经是关灯状态了，无需再次关灯");
    }
}
