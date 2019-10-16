package staff;

public class Doctor {
    
    private String doctor;
    private String name;
    
    public Doctor(String doctor, String name){
        this.doctor = doctor;
        this.name = name;
    }
    
    public String toString(){
        return doctor +", "+ name;
    }

    public String getDoctor() {
        return doctor;
    }

    public String getName() {
        return name;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
