import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        Cat bean3 = (Cat) applicationContext.getBean("сat");
        Cat bean4 = (Cat) applicationContext.getBean("сat");

        System.out.println("Для пары HelloWorld - " + (bean1 == bean2));
        System.out.println("Для пары cat - " + (bean3 == bean4));
    }
}