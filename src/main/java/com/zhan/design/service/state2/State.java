package com.zhan.design.service.state2;

import com.zhan.design.util.state_patterns.MakeCoffee;

public interface State {

    /**
     * 1、拿杯子
     */
    void takeCup(MakeCoffee makeCoffee);

    /**
     * 2、往杯子里倒速溶咖啡
     */
    void addInstantCoffee(MakeCoffee makeCoffee);

    /**
     * 3、往杯子里加热水
     */
    void addWater(MakeCoffee makeCoffee);

    /**
     * 4、喝咖啡
     */
    void enjoyCoffee(MakeCoffee makeCoffee);
}
