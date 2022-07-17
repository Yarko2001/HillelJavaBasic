package lesson19.task_3;

import lesson19.task_3.Bet;
import lesson19.task_3.Dao;
import lesson19.task_3.Inject;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<? extends Bet> betClass = Bet.class;

        Field[] fields = betClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Inject.class)) {
                System.out.println("Field is annotated by Inject: " + field);
            }
        }

        Method[] methods = betClass.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Inject.class)) {
                System.out.println("Method is annotated by Inject: " + method);
            }
        }
        if (betClass.isAnnotationPresent(Dao.class)) {
            System.out.println("Class is annotated by Dao");
        }
    }
}
