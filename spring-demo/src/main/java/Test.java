import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author jdzhao2
 * @version V1.0
 * @Description (这里用一句话描述这个类的作用)
 * @date 2021.12.22 16:37
 */
public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		
		context.register(Bean.class);
		context.refresh();
		System.out.println("spring-framework源码环境编译好了：" + context.getBean(Bean.class));
	}
	
}