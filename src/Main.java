import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<Patient> patientList= new ArrayList<>();
        ArrayList<Doctor> doctorList=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        // Add data
        doctorList.add(new Doctor(1, "Dr.Hashini Fernando", 45, "Cardiologist"));
        doctorList.add(new Doctor(2, "Dr. Amal Silva", 50, "Neurologist"));

        patientList.add(new Patient(101, "Sanuka Perera", 30, "Chest Pain"));
        patientList.add(new Patient(102, "Senuji Perera", 25, "Migraine"));

        while (true) {
            System.out.println("\n===================================");
            System.out.println("     HOSPITAL MANAGEMENT SYSTEM       ");
            System.out.println("======================================");
            System.out.println("1. Add New Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Add New Doctor");
            System.out.println("4. View All Doctors");
            System.out.println("5. Search Patient by ID");
            System.out.println("6. Exit");
            System.out.print("Enter your option (1-6): ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                System.out.println("Invalid input!Please enter a number.");
                scanner.next();
                continue;
            }

            switch (choice) {
                case 1: // Add Patient
                    System.out.print("Enter Patient ID: ");
                    int pId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Patient Name: ");
                    String pName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int pAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Diagnosis/Disease: ");
                    String pDiag = scanner.nextLine();

                    patientList.add(new Patient(pId, pName, pAge, pDiag));
                    System.out.println("Patient added successfully!");
                    break;

                case 2: // View All Patients
                    System.out.println("\n--- Patient List ---");
                    if (patientList.isEmpty()) {
                        System.out.println("No patients registered.");
                    } else {
                        for (Patient p : patientList) {
                            p.displayPatientInfo();
                        }
                    }
                    break;

                case 3: // Add Doctor
                    System.out.print("Enter Doctor ID: ");
                    int dId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Doctor Name: ");
                    String dName = scanner.nextLine();
                    System.out.print("Enter Age: ");
                    int dAge = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter Specialization: ");
                    String dSpec = scanner.nextLine();

                    doctorList.add(new Doctor(dId, dName, dAge, dSpec));
                    System.out.println("Doctor added successfully!");
                    break;

                case 4: // View All Doctors
                    System.out.println("\n--- Doctor List ---");
                    if (doctorList.isEmpty()) {
                        System.out.println("No doctors registered.");
                    } else {
                        for (Doctor d : doctorList) {
                            d.displayDoctorInfo();
                        }
                    }
                    break;

                case 5: // Search Patient
                    System.out.print("Enter Patient ID to search: ");
                    int searchId=scanner.nextInt();
                    boolean found =false;

                    for (Patient p : patientList){
                        if (p.getId() == searchId){
                            System.out.println(" Patient Found:");
                            p.displayPatientInfo();
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Patient not found.");
                    }
                    break;

                case 6: // Exit
                    System.out.println("Exiting System... Thank you!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option! Choose between 1 and 6.");
            }
        }
    }
}