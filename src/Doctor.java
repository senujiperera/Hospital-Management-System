public class Doctor extends Person{
    private String specialization;

    public Doctor(int id, String name, int age, String specialization){
        super(id, name, age);
        this.specialization = specialization;
    }

    public String getSpecialization(){ return specialization; }

    public void displayDoctorInfo(){
        System.out.println("Doctor ID: " + id + " | Name: " + name + " | Age: " + age + " | Specialization: " + specialization);
    }
}