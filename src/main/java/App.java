import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        HelloWorld tree = (HelloWorld) context.getBean("helloworld");
        System.out.println(tree.getMessage());

        HelloWorld leaf = (HelloWorld) context.getBean("helloworld");
        System.out.println(leaf.getMessage());

        Cat one = (Cat) context.getBean("Cat");
        System.out.println(one.getMeow());

        Cat two = (Cat) context.getBean("Cat");
        System.out.println(two.getMeow());


        if (tree == leaf) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        if (one == two) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}