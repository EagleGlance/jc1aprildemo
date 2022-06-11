package reflection;

import com.noirix.domain.Cat;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.util.function.Predicate;

public class CustomReflectionUtil {

    public static void showFieldsInfo(Field[] declaredFields) {
        for (Field declaredField : declaredFields) {

            System.out.print(Modifier.toString(declaredField.getModifiers()) + " ");
            System.out.print(declaredField.getName() + " ");
            System.out.print(declaredField.getType() + " ");
            System.out.print(declaredField.getDeclaredAnnotations().length + " ");
            System.out.print(declaredField.getGenericType() + " ");
            System.out.println();
        }
    }

    public static void showMethodsInfo(Method[] declaredMethods) {
        for (Method declaredMethod : declaredMethods) {

            System.out.print(Modifier.toString(declaredMethod.getModifiers()) + " ");
            System.out.print(declaredMethod.getName() + " ");

            Parameter[] parameters = declaredMethod.getParameters();
            System.out.print("(");
            for (Parameter typeParameter : parameters) {
                System.out.print(typeParameter.getType() + " ");
                System.out.print(typeParameter.getName() + " ");
                System.out.print(",");
            }
            System.out.print(")");

            //System.out.print(declaredMethod.getDeclaredAnnotations().length + " ");
            System.out.println();
        }
    }

    public static void showConstructorsInfo(Constructor[] constructors) {
        for (Constructor<?> declaredConstructor : constructors) {
            System.out.println(Modifier.toString(declaredConstructor.getModifiers()));
            System.out.println(declaredConstructor.getParameterCount());
        }
    }

    public static Cat createCat(Constructor<?> declaredConstructor) {
        Cat reflectionCat = null;

        Parameter[] parameters = declaredConstructor.getParameters();
        Predicate<Parameter[]> constructorInvocationRule = (params) -> params.length > 2 && params[0].getType().equals(String.class);

        if (constructorInvocationRule.test(parameters)) {
            declaredConstructor.setAccessible(true);

            try {
                reflectionCat = (Cat) declaredConstructor.newInstance("Barsik", 7, "Blue");
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
        return reflectionCat;
    }
}
