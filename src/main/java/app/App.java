package app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class App {

    public static void main(String args[]) {
        AbstractApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        HelloWorld bean = (HelloWorld) context.getBean("hello");
        bean.printMessage("Spring 4 - Hello World !!!!");
        context.close();
    }

}
