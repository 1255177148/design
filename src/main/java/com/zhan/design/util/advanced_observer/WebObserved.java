package com.zhan.design.util.advanced_observer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Observable;

/**
 * 定义一个被观察者类，这里使用Java和springboot提供的工具类
 * @Author elvis
 * @Date 2022/4/26 14:09
 */
@Component
@Slf4j
public class WebObserved extends Observable {

    private final List<WebObserver> observers;

    public WebObserved(List<WebObserver> observers) {
        this.observers = observers;
    }

    /**
     * 这里将实现指定接口类的所有注册的bean都注册进来，
     * 即意味着这个接口类的所有bean都会关注此事件，
     * 因此如果有不同的事件需要不同的观察者关注，则可以设置多个不同的接口，
     * 每个接口类关注一种或多种事件。另一个事件可以参看{@link OtherObserved}这个类的
     * {@link OtherObserved#register()}方法。
     * 注意，这里不能使用抽象类来关注指定事件，因为这里使用了动态代理，
     * 而动态代理不能代理抽象类，只能代理接口类
     */
    @PostConstruct
    private void register(){
        if (CollectionUtils.isEmpty(observers)){
            return;
        }
        observers.forEach(this::addObserver);
    }

    /**
     * 发布消息
     */
    public void push(Object message){
        // 在通知观察者之前，需要将观察者的状态改为true，否则无法通知
        this.setChanged();
        // 通知所有的注册观察的观察者
        this.notifyObservers(message);
    }
}
