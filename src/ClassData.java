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

    public void setName(String name) { this.name = name; }
    public void setSuperClass(String superClass) { this.superClass = superClass; }
    public void setInterfaces(ArrayList<String> interfaces) { this.interfaces = interfaces; }
    public void setFields(ArrayList<String> fields) { this.fields = fields; }
    public void setMethods(ArrayList<String> methods) { this.methods = methods; }
    public void setProviders(ArrayList<String> providers) { this.providers = providers; }
    public void setClients(ArrayList<String> clients) { this.clients = clients; }
}
