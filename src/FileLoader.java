import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

public class FileLoader {

    public void loadPackage(String path) throws IOException {

        System.out.println("Gathering class files in " + path);

        FilenameFilter classFilter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                if(name.indexOf('$')== -1)  // Check if there is a '$' in name.
                    return name.toLowerCase().endsWith(".class");
                else
                    return false;
            }
        };

        File f = new File(path); // the directory, really!

        int counter = 0;
        for (File file : f.listFiles(classFilter)) {
            counter++;
            System.out.print( counter + ". " + file.getName().replace(".class", "") + "\n");
        }
    }
}