import java.util.ArrayList;

public class ClassData {
    private String name;
    private String superClass;
    private ArrayList<String> interfaces;
    private ArrayList<String> fields;
    private ArrayList<String> methods;
    private ArrayList<String> providers;
    private ArrayList<String> clients;

    public ClassData(){
    }

    public String getName(){ return name; }

    public String getSuperClass(){ return superClass; }

    public ArrayList<String> getInterfaces(){ return interfaces; }

    public ArrayList<String> getFields(){ return fields; }

    public ArrayList<String> getMethods(){ return methods; }

    public ArrayList<String> getProviders(){ return providers; }

    public ArrayList<String> getClients(){ return clients; }
}
