package com.zhan.design;


import com.zhan.design.util.responsibility_patterns.Approver;
import com.zhan.design.util.responsibility_patterns.CEO;
import com.zhan.design.util.responsibility_patterns.Manager;
import com.zhan.design.util.responsibility_patterns.Staff;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author hezhan
 * @Date 2019/11/19 10:18
 * 责任链设计模式测试类--模拟公司流程审批，
 * 如果资金少于1000元，则员工审批，
 * 如果资金少于5000元，则经理审批，
 * 如果资金少于10000元，则CEO审批，否则驳回申请。
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ResponsibilityTest {

    @Test
    public void test(){
//        Approver approver = new Staff("小张");
//        approver.setNextApprover(new Manager("老李")).setNextApprover(new CEO("刘总"));//这一步可以用工厂模式创建一条责任链
        //下一步就是创建一条责任链或者流程
        Approver.Builder builder = new Approver.Builder();
        Approver approver = builder.add(new Staff("小张"))
                .add(new Manager("老李"))
                .add(new CEO("刘总")).build();
        //1000元直接找员工审批
        approver.approve(1000);
        //4000元要找经理审批
        approver.approve(4000);
        //9000元要找CEO审批
        approver.approve(9000);
        //超过10000元就驳回申请
        approver.approve(20000);
    }
}
