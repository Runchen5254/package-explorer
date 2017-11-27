import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Reflection <name of class>");
            //System.exit(-1);
        }
        try {
            Class meta = Class.forName(args[0]);

            Field[] fields = meta.getDeclaredFields();
            System.out.println("Found " + fields.length +
                    " fields in the class " + meta.getSimpleName() );
            for (Field f : fields) {
                System.out.println("Field: " + f.getName());
                System.out.println("Type: " + f.getType().getSimpleName());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
}
