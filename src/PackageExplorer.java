import java.io.IOException;

public class PackageExplorer {

    public static void main(String[] args) throws IOException {

        //Create FileLoader
        FileLoader fl = new FileLoader();

        //Create menu
        Menu m1 = new Menu();
        switch (m1.getUserInput()){
            case "1":{
                if (args.length != 1)
                    fl.loadPackage("C:\\Users\\taoru\\Desktop\\SJSU\\CS-151\\HW5\\package-explorer\\src");  //Assumes current dir
                else
                    fl.loadPackage(args[0]);
            }break;

            case "2":{

            }break;

        }

    }
}
