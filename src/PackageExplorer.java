import java.io.IOException;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class PackageExplorer {

    //Return a file type to create an array of classes
    public static File[] loadClasses(File dir, String text) {
        return dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return !pathname.getName().toLowerCase().contains("$") && pathname.getName().toLowerCase().endsWith(text);
            }
        });
    }

    //Use ClassData.java here
    public static HashMap loadData(File[] classesArr){

        HashMap<String, ClassData> hashMap = new HashMap();
        int cnt = 1;
        try {
            for ( File entry : classesArr ) {
                Class c = Class.forName(entry.getName().replace(".class", ""));
                ClassData classData = new ClassData();

                classData.setName(c.getSimpleName());
                classData.setSuperClass(c.getSuperclass().getSimpleName());
                hashMap.put(Integer.toString(cnt), classData);
                cnt++;
            }
        }catch(Exception e){
            System.out.println(e);
        }
        return hashMap;
    }

    public static void main(String[] args) throws IOException {

        //Record dir path
        final File dir;
        if (args.length != 1)
            dir = new File("C:\\Users\\taoru\\Desktop\\SJSU\\CS-151\\HW5\\package-explorer\\src"); //Assumes current dir
        else
            dir = new File(args[0]);

        //Create FileLoader
        FileLoader fl = new FileLoader();

        //Create an array of files
        File[] classesArr = loadClasses(dir,".class");

        HashMap<String, ClassData> hashMap = loadData(classesArr);

        //Create menu
        Menu menu = new Menu();

        boolean flag = true;
        do {
            menu.printMainMenu();
            System.out.print("\n-Enter your choice (1-4) or q to quit: ");

            switch (menu.getUserInput()) {
                case "1": {
                    menu.printOpt1();
                    fl.loadPackage(dir.toString());
                }
                break;

                case "2": {
                    System.out.print("\n-Enter file number to view details or m for main menu: ");
                    Scanner sc = new Scanner(System.in);
                    String num = sc.next();
                    File temp = classesArr[Integer.valueOf(num)-1];

                    Reflection r = new Reflection();
                    r.reflection(temp.getName().replace(".class", ""));
                }
                break;

                case "m":{
                    menu.printMainMenu();
                }break;

                case "q":{
                    flag = false;
                }break;
            }
        }while(flag);

        System.out.print("\n-Goodbye!!");
    }
}
