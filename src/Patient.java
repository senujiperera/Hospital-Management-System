public class Patient extends Person{
    private String diagnosis;

    public Patient(int id, String name, int age, String diagnosis){
        super(id, name, age);
        this.diagnosis = diagnosis;
    }

    public String getDiagnosis() { return diagnosis; }

    public void displayPatientInfo(){
        System.out.println("Patient ID: " + id + " | Name: " + name + " | Age: " + age + " | Diagnosis: " + diagnosis);
    }
}