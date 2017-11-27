import java.util.Scanner;

public class Menu {

    public Menu() {
        printMainMenu();
    }

    public void printMainMenu() {
        System.out.print("\nWelcome to PackageExplorer - Main Menu\n");
        System.out.print("--------------------------------------\n");
        System.out.print("  1. List all classes\n");
        System.out.print("  2. View a class\n");
        System.out.print("  3. Save all classes\n");
        System.out.print("  4. Load class info from xml(Extra Credit)\n");
    }

    public void printOpt1() {
        System.out.print("List of classes\n");
        System.out.print("---------------\n");
    }

    public String getUserInput(){
        System.out.print("Enter your choice (1-4) or q to quit: ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        return input;
    }

}
