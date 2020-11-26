package core.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import java.util.Collections;

@SpringBootApplication
@ComponentScan(basePackages = "core")
@ContextConfiguration()
public class Starter {
public static void main(String[] args) {
    SpringApplication app = new SpringApplication(Starter.class);
    app.setDefaultProperties(Collections.singletonMap("server.port", "8083"));
    app.run(args);

}
}
//    public static void main(String[] args) {
////        ApplicationContext context = new ClassPathXmlApplicationContext( "classpath*:/test/resources/META-INF/spring/springConfig.xml");
////        BeanConfig obj = (BeanConfig) context.getBean("beanConfig");
////        obj.getMessage();
//        SpringApplication.run(Starter.class, args);
//    }
//public static void main(String[] args) {
//    SpringApplication app = new SpringApplication(Starter.class);
//    app.setDefaultProperties(Collections
//            .singletonMap("server.port", "8083"));
//    app.run(args);
//}