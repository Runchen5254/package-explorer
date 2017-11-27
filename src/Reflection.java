import java.lang.reflect.*;
import java.security.Provider;

public class Reflection {

    public void reflection(String name) {

        try {
            Class meta = Class.forName(name);

            Field[] fields = meta.getDeclaredFields();
            Method[] methods = meta.getDeclaredMethods();

            System.out.println("Class Details: ");
            System.out.println("Name: " + meta.getSimpleName());
            System.out.println("Superclass: " + loadSuperClassName(meta));
            System.out.println("Interface: " + meta.getInterfaces());

            System.out.println("Field:");
            for (Field f : fields)
                System.out.println("  "+ f.getName()+ "|Type: " + f.getType().getSimpleName());

            System.out.println("Methods:");
            for (Method m : methods)
                System.out.println("  " + m.getName() + " | " + "Type: " + m.getReturnType().getSimpleName());


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String loadSuperClassName(Class c) {
        String result = null;
        try {
            result = c.getSuperclass().getSimpleName();
        }
        catch (NullPointerException e){
            // error
        }

        return result;
    }
}
