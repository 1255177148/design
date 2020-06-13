# 设计模式
用来模拟一些设计模式

## 原型模式
如果需要产生同一个类的大量对象实例，这时如果用new出来一个实例，
则每次都会初始化，调用构造方法，浪费大量资源。
于是我们可以用原型模式，先造一个原型对象，然后之后就通过克隆
（浅克隆和深克隆）来创建之后的对象。一个很常见的
使用场景为：for循环内部创建对接来接收集合的对象属性。
## 单例模式
为了防止对象实例的大量创建，导致的系统冗余与混乱，
我们可以用单例模式封闭构造方法，然后内部先实例化一个实例，
只对外暴露一个获取此实例的方法，可以防止实例的大量创造。
## 适配器模式
如果在不改动原有接口或者类的前提下，要用此接口或者类实现其它新需求，或者为已有的两个互不关联的两个接口提供一个协同工作的方式，
则可以构建一个适配器类来实现此接口，同时内部应用另一个类的实例，来实现新需求。
## 策略模式
如果一个方法有多种功能和算法（例如计算器的计算方法，有加减乘除等等），
则可以将算法抽象出来，忽略具体实现，然后定义一些具体算法的实现类，每一个实现类实现一种单一算法。
这样就保证了高扩展性。
## 状态模式
一种最典型的例子就是在很多if-else if语句下，整体不利于代码的阅读和维护，
则可以将if里的条件整合为行为的状态，将if里的主体整合为行为，
具体实现思路为：一个状态接口类，定义会产生的行为，然后构建每种状态的实现类，具体实现某种行为逻辑，
然后构建一个场景类，用来确定状态来实现对应状态下的行为。
## 模板方法模式
当其他方法被继承或实现但唯独某个方法不允许被继承或实现时，可以用此模式，以前的方式是：构建一个父类，然后在定义的很多方法中，将不想被继承的方法用final修饰。
现在可以用接口类的方式写，在接口类中将方法用default修饰，则不会被其实现类实现。
##门面模式
将多个实例的多个方法的调用统一整合在一个类中，统一调度。
即将实例的方法封装在一个类中统一对外提供一个方法。
## 装饰模式
扩展一个类中的功能，装饰者和被装饰者一般都是同一个接口类的实现类，
装饰者内部引用接口类对象，然后在方法中通过内部引用的接口类对象调用被装饰者的方法，
并在此核心方法的基础上扩展内容。如果要装饰或者扩展的种类很多，则可以将装饰者类定义为父类，
然后继承的每个子类负责一种装饰或者扩展。
## 中介模式
eureka和消息队列其实都属于中介模式，就是将很多相依赖的类解耦，
将这种依赖抽象出来变为第三方，即由第三方来管理这些依赖，
类的内部只关心自己的功能，这就是高内聚低耦合，
主要就是将类解耦。详细的例子就是mq消息队列，如果没有mq，
双方就是面对面的通信，如果再加一人，或者再加多人，
就会很乱，这样把多方之间的依赖抽离出来，形成mq，
然后各方只需要与mq保持通信就可以了。
## 组合模式
组合多个对象形成树形结构，对象的行为可以从根节点不断递归，
也就是用户只需要调用根节点的方法，则此行为就会作用于所有的子节点。
## 迭代器模式
集合可以视为一个容器，如果想取出容器里的数据，则可以用迭代器来遍历取出，
但是每个容器如果都按照自己的方式自定义迭代器，则不利于对外使用，
所以可以定义一个迭代器接口，每个容器都实现此接口，
然后再在定义的迭代器方法内实现自己容器的遍历逻辑，
这样每个容器对外提供的遍历方法都是统一的，用户不关心内部具体实现，
只需要调用迭代器的方法即可遍历容器，目前Java内的每种集合，
Collection，List、Set、Map等，都有自己的迭代器Iterator。
## 备忘录模式
典型的应用场景就是文本文档的撤销操作，或者浏览器的回退功能。
此模式可以构建一个第三方历史记录类来封装历史信息，
不会与信息产生影响。
## 责任链模式
典型的应用场景就是公司审批流程，工作流，就是有明确的流程顺序和分工，
这是就可以抽象出一个责任链类，然后每一个分工或者流程都继承责任链，
这样一个流程就出现了。
## 观察者模式
典型的应用场景就是消息队列的订阅机制，当对象之前有一对多的关系，
且当对象改变时，所有依赖于它的对象都会收到通知并自动产生行为。
## 享元模式
顾名思义，享元就是共享，也就是当创建大量属性大多一致的相似对象时，可以用享元模式，
相同的对象只保留一份，将不能共享的属性或者状态外部化，举个例子，
围棋的黑白棋可以只保留两个对象，即黑棋对象和白棋对象，
黑白棋的位置归为外部属性，这样每次下棋的时候都是调用的同一黑白棋对象，
只不过是坐标的变化而已。
## 代理模式
代理模式现实生活中的例子可以参考明星的经纪人，经纪人全权代理明星无暇顾及的事务，
比如宣传推广、合同谈判之列。放到代码中就是给目标代理类增加额外功能逻辑来扩展代理类的功能。
代理可以分为动态代理和静态代理，动态代理Java中运用的比较多，可以参照spring的AOP即面向切面编程，
运用的就是动态代理；或者也可以参照springboot中在业务逻辑上加上@Transactional事务注解，
来为这段逻辑注册事务，运用的也是动态代理。


[![996.icu](https://img.shields.io/badge/link-996.icu-red.svg)](https://996.icu)
[![LICENSE](https://img.shields.io/badge/license-Anti%20996-blue.svg)](https://github.com/996icu/996.ICU/blob/master/LICENSE)
