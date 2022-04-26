package com.zhan.design.util.advanced_observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.Observable;

/**
 * 观察者-明
 * @Author elvis
 * @Date 2022/4/26 15:29
 */
@Component
@Slf4j
public class MingObserver implements WebObserver {

    @Async
    @Override
    public void update(Observable o, Object arg) {
        System.out.println(Thread.currentThread().getName() + "---->ming");
        System.out.println("明 收到通知,通知内容为:" + o);
    }
}
