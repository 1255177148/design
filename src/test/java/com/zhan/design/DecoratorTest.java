package com.zhan.design;


import com.zhan.design.service.decorator.Showable;
import com.zhan.design.service.decorator.impl.Foundation;
import com.zhan.design.service.decorator.impl.Girl;
import com.zhan.design.service.decorator.impl.Lipstick;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author hezhan
 * @Date 2019/11/4 11:32
 * 装饰模式测试类
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DecoratorTest {

    @Test
    public void test(){
        //简单的装饰
//        new Decorator(new Girl()).show();
        //先擦粉底，然后再涂口红，层层装饰
        Showable showable = new Lipstick(new Foundation(new Girl()));
        showable.show();
    }
}
