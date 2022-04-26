package com.zhan.design.util.advanced_observer;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Observable;

/**
 * @Author elvis
 * @Date 2022/4/26 17:23
 */
@Component
public class SanObserver implements OtherObserver{

    @Async
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(Thread.currentThread().getName() + "---->san");
        System.out.println("三 收到通知,通知内容为:" + arg);
    }
}
