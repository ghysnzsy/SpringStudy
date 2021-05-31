package chap02;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main2 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        Greeter g = ctx.getBean("greeter", Greeter.class);
        String msg = g.greet("스프링");
        System.out.println(msg);

        Greeter g1 = ctx.getBean("greeter", Greeter.class);
        Greeter g2 = ctx.getBean("greeter", Greeter.class);
        System.out.println("(g1 == g2) = "+(g1 == g2));

        Greeter g3 = ctx.getBean("greeter1", Greeter.class);
        System.out.println("(g2 == g3) = "+(g2 == g3));
        String msg2 = g3.greet("스프링");
        System.out.println(msg2);


        ctx.close();
    }
}
