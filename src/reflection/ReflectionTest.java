package reflection;

import com.noirix.domain.BooksFields;
import com.noirix.domain.Cat;
import com.noirix.domain.Gender;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionTest {

    private static final String CAT_COLOR_FIELD_NAME = "color";
    private static final String CAT_GENDER_FIELD_NAME = "gender";

    public static void main(String[] args) {
        Class<Cat> catClass = Cat.class;

        System.out.println(catClass.getClassLoader());
        System.out.println(catClass.getName());
        System.out.println(catClass.getCanonicalName());
        System.out.println(catClass.getSimpleName());
        System.out.println(catClass.getDeclaredFields().length);
        System.out.println(catClass.getFields().length);
        System.out.println(catClass.getAnnotations().length);

        Class<?>[] interfaces = catClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface);
        }
        Class<? super Cat> superclass = catClass.getSuperclass();
        System.out.println(superclass);
        System.out.println(BooksFields.class.getSuperclass());
        System.out.println(ReflectionTest.class.getSuperclass());

        Class<CustomAnnotation> customAnnotationClass = CustomAnnotation.class;

        Annotation[] annotations = catClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation.toString());
            Class<? extends Annotation> annotationType = annotation.annotationType();
            if (annotationType.equals(customAnnotationClass)) {
                System.out.println("Class " + Cat.class.getSimpleName() +
                        " has annotation " + annotation.annotationType().getSimpleName());
            }
        }

        /*Fields reflection*/
        Cat cat = new Cat();
        System.out.println("**********Cat before modification************");
        System.out.println(cat);
        System.out.println("Fields reflection test");
        Field[] declaredFields = catClass.getDeclaredFields();
        CustomReflectionUtil.showFieldsInfo(declaredFields);

        for (Field declaredField : declaredFields) {
            updateColorField(declaredField, cat);
            updateGenderField(declaredField, cat);
        }

        System.out.println("**********Cat after modification************");
        System.out.println(cat);


        /*Methods reflection*/
        System.out.println("Methods reflection test");
        Cat catForMethods = new Cat();
        Method[] declaredMethods = catClass.getDeclaredMethods();
        CustomReflectionUtil.showMethodsInfo(declaredMethods);

        for (Method declaredMethod : declaredMethods) {
            if (declaredMethod.getName().equals("getCatName")) {
                declaredMethod.setAccessible(true);
                try {
                    System.out.println(declaredMethod.invoke(catForMethods));
                } catch (IllegalAccessException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        System.out.println("Constructors reflection test");
        Constructor<?>[] declaredConstructors = catClass.getDeclaredConstructors();
        CustomReflectionUtil.showConstructorsInfo(declaredConstructors);
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(CustomReflectionUtil.createCat(declaredConstructor));
        }

        Package[] packages = Package.getPackages();
        for (Package aPackage : packages) {
            System.out.println(aPackage.getName());
        }
    }

    private static void updateColorField(Field field, Cat objectForModification) {
        if (field.getName().equals(CAT_COLOR_FIELD_NAME)) {
            field.setAccessible(true); //make field public if it's private
            try {
                field.set(objectForModification, "White");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void updateGenderField(Field field, Cat objectForModification) {
        if (field.getName().equals(CAT_GENDER_FIELD_NAME)) {
            field.setAccessible(true); //make field public if it's private
            try {
                field.set(objectForModification, Gender.MALE);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
