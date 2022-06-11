package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

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
}
