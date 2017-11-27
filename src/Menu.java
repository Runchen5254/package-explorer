import java.util.Scanner;

public class Menu {

    public Menu() {
    }

    public void printMainMenu() {
        System.out.print("\n-Welcome to PackageExplorer\n");
        System.out.print("--------------------------------------\n");
        System.out.print("  1. List all classes\n");
        System.out.print("  2. View a class\n");
        System.out.print("  3. Save all classes\n");
    }

    public void printOpt1() {
        System.out.print("-List of classes: \n");
    }

    public String getUserInput(){
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        return input;
    }

}
