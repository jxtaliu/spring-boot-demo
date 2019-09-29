package com.example.lambda.tester;

/**
 * Lamba本质上是匿名方法
 *
 * Lambda 表达式主要用来定义行内执行的方法类型接口，例如，一个简单方法接口。
 * 在上面例子中，我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。然后我们定义了sayMessage的执行。
 *
 * Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
 *
 * Lambda 表达式只能引用标记了 final 的外层局部变量，
 * 这就是说不能在 lambda 内部修改定义在域外的局部变量，否则会编译错误。
 *
 * lambda 表达式的局部变量可以不用声明为 final，但是必须不可被后面的代码修改（即隐性的具有 final 的语义）
 *
 * 在 Lambda 表达式当中不允许声明一个与局部变量同名的参数或者局部变量。
 *
 * @author : bruceliu(jxta.liu@gmail.com)
 * @version V1.0
 * @Project: spring-boot-demo
 * @Package com.example.lambda
 * @Description: TODO
 * @date Date : 2019年09月28日 09:51
 */
public class Java8LambdaTester {
    final static String hello = "Hello,";
    public static void main(String[] arg){
        Java8LambdaTester tester = new Java8LambdaTester();
        MathOperation addition = (int a, int b) -> a+b;
        MathOperation subtraction = (a, b) -> a-b;
        MathOperation multiplication = (int a, int b) -> {return a*b;};
        MathOperation division = (int a, int b) -> a/b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));


        GreetingService greetService1 = message -> System.out.println("Hello " + message);
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);
        GreetingService greetService3 = (message) -> System.out.println(hello + message);

        greetService1.sayHello("Bruce");
        greetService2.sayHello("Lee");
        greetService3.sayHello("Lee");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayHello(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}
