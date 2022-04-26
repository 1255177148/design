package com.zhan.design.util.advanced_observer;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Observable;

/**
 * @Author elvis
 * @Date 2022/4/26 17:26
 */
@Component
public class OtherObserved extends Observable {

    private final List<OtherObserver> observers;

    public OtherObserved(List<OtherObserver> observers) {
        this.observers = observers;
    }

    @PostConstruct
    private void register(){
        if (CollectionUtils.isEmpty(observers)){
            return;
        }
        observers.forEach(this::addObserver);
    }

    public void push(Object message){
        this.setChanged();
        this.notifyObservers(message);
    }
}
