package staff;

public class Nurse {
    private String name;

    public Nurse(String nurseName) {
        this.name = nurseName;
    }
    public String toString(){
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    
}
