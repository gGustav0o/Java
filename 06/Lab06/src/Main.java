import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    private static void createInstance(){
        SomeClass someClass = null;
        try {
            Class<?> clazz = Class.forName(SomeClass.class.getName());
            Class[] params = {int.class};
            someClass = (SomeClass) clazz.getConstructor(params).newInstance(5);

            Method method = someClass.getClass().getDeclaredMethod("someMethod");
            method.setAccessible(true);
            System.out.println(method.invoke(someClass));
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    private static void printClassInfo(SomeClass someClass){
        Class classInfo = someClass.getClass();
        System.out.println(
                  "Name: "         + classInfo.getName()         + "\n"
                + "Modifiers: "    + classInfo.getModifiers()    + "\n"
                + "Superclass:"    + classInfo.getSuperclass()   + "\n"
        );
        System.out.println();

        System.out.println("Interfaces");
        for (Class<?> classInterface : classInfo.getInterfaces()){
            System.out.println(classInterface);
        }
        System.out.println();

        System.out.println("Constructors");
        for(Constructor<?> classConstructor : classInfo.getDeclaredConstructors()){
            System.out.println(classConstructor);
        }
        System.out.println();

        System.out.println("Methods");
        for(Method classMethod : classInfo.getDeclaredMethods()){
            System.out.println(classMethod);
        }
        System.out.println();

        System.out.println("Fields");
        for(Field classField : classInfo.getDeclaredFields()){
            System.out.println(classField);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        createInstance();
    }
}