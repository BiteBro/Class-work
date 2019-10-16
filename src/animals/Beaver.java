package animals;
import disease.Disease;
import staff.Doctor;
import staff.Nurse;
//бобер
public class Beaver{
  
    private String name;
    private float weight;
    private int age;
    private float height;
    private String disease;
    private Doctor doctor;
    private Nurse nurse;
    
    
    public Beaver(String name, float weight, int age, float height) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.height = height;               
    }
  
    public void patientInfo(){
        System.out.println("Beaver" + " Name: "+ getName() + ", Age: " + getAge() + ", Weight: " + getWeight() + ", Height: " + getHeight() + "." );
        System.out.println("Disease: " + disease + ", Doctor: " + doctor + ", Nurse: " + nurse);
        System.out.println();
    }
    
   
    
    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }

    public String getDisease() {
        return disease;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }
    
}
