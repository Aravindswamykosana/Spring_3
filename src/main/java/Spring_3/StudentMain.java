package Spring_3;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import Spring_3.package1.Teacher;
import Spring_31.School;

public class StudentMain {
	public static void main(String[] args) {
//		Resource resource=new ClassPathResource("Annotationconfig.xml");
//		BeanFactory factory=new XmlBeanFactory(resource);
	
		ApplicationContext context=new AnnotationConfigApplicationContext(Annotationconfig.class);
		
	
		Student student=context.getBean(Student.class);
		System.out.println(student);
//		
		Teacher teacher=context.getBean(Teacher.class);
		System.out.println(teacher);
		
//		School school=context.getBean(School.class);
//		System.out.println(school);
	}
}
