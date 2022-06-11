package reflection;

import com.noirix.domain.Cat;

import java.lang.annotation.Annotation;

public class ReflectionTest {
    public static void main(String[] args) {
        Class<Cat> catClass = Cat.class;

        System.out.println(catClass.getClassLoader());
        System.out.println(catClass.getName());
        System.out.println(catClass.getCanonicalName());
        System.out.println(catClass.getSimpleName());
        System.out.println(catClass.getDeclaredFields().length);
        System.out.println(catClass.getFields().length);

        System.out.println(catClass.getAnnotations().length);

        Class<CustomAnnotation> customAnnotationClass = CustomAnnotation.class;

        Annotation[] annotations = catClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
            Class<? extends Annotation> annotationType = annotation.annotationType();
            if (annotationType.equals(customAnnotationClass)) {
                System.out.println("Class " + Cat.class.getSimpleName() + " has annotation " + annotation.annotationType().getSimpleName());
            }
        }
    }
}
