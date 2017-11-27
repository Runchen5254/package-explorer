import java.lang.reflect.*;

public class Reflection {

    public void reflection(String name) {

        try {
            Class meta = Class.forName(name);

            Field[] fields = meta.getDeclaredFields();
            Method[] methods = meta.getDeclaredMethods();
            Object[] metaInterfaces = meta.getInterfaces();

            System.out.println("\n**Class Details** ");
            System.out.println("Name: " + meta.getSimpleName());
            System.out.println("Superclass: " + loadSuperClassName(meta));

            System.out.print("Interfaces: ");
            if (metaInterfaces.length == 0)
                System.out.print("None\n");
            else
                for (Object i : metaInterfaces){
                    System.out.println(i.getClass().getSimpleName());
                }

            System.out.print("Field: ");
            if(fields.length == 0)
                System.out.print("None\n");
            else
                for (Field f : fields)
                    System.out.println("  "+ f.getName()+ "|Type: " + f.getType().getSimpleName());

            System.out.println("Methods:");
            if(methods.length == 0)
                System.out.print("None\n");
            else
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
