package hospital;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        // Initialize ALL our custom Data Structures
        PatientBST patientRecords = new PatientBST();
        EmergencyQueue emergencyQueue = new EmergencyQueue();
        TreatmentStack treatmentHistory = new TreatmentStack();
        VisitLinkedList visitHistory = new VisitLinkedList();

        // data for BST
        patientRecords.insert(new PatientRecord(105, "Edward Elric", 21));
        patientRecords.insert(new PatientRecord(101, "Alphonse Elric", 20));
        patientRecords.insert(new PatientRecord(108, "Winry Rockbell", 20));

        // data for Queue
        emergencyQueue.enqueue(new EmergencyPatient("Tom Wilson", "High Fever"));
        emergencyQueue.enqueue(new EmergencyPatient("Sarah Jones", "Broken Arm"));

        // data for Stack
        treatmentHistory.push(new Treatment("Alice Brown", "Blood Test", "Dr. Adams"));
        treatmentHistory.push(new Treatment("Charlie Davis", "X-Ray", "Dr. Baker"));

        // data for Linked List
        visitHistory.addVisit(new PatientVisit("John Doe", "2023-10-01", "Routine Checkup"));
        visitHistory.addVisit(new PatientVisit("Jane Smith", "2023-10-15", "Sprained Ankle"));


        while (running) {
            System.out.println("\n===== MINI HOSPITAL SYSTEM =====");
            System.out.println("1. Patient Records (BST)");
            System.out.println("2. Emergency Queue (Queue)");
            System.out.println("3. Treatment History (Stack)");
            System.out.println("4. Patient Visit History (Linked List)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("\n--- Patient Records Menu ---");
                    System.out.println("A. View all records (Sorted by ID)");
                    System.out.println("B. Add new patient record");
                    System.out.println("C. Search for patient by ID");
                    System.out.print("Choice: ");
                    String bstChoice = scanner.nextLine().toUpperCase();

                    if (bstChoice.equals("A")) {
                        patientRecords.displayInOrder();
                    } else if (bstChoice.equals("B")) {
                        System.out.print("Enter Patient ID (Number): ");
                        int id = scanner.nextInt();
                        scanner.nextLine(); 
                        System.out.print("Enter Patient Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Patient Age: ");
                        int age = scanner.nextInt();
                        
                        patientRecords.insert(new PatientRecord(id, name, age));
                        System.out.println("Record added successfully!");
                    } else if (bstChoice.equals("C")) {
                        System.out.print("Enter Patient ID to search: ");
                        int searchId = scanner.nextInt();
                        PatientRecord found = patientRecords.search(searchId);
                        if (found != null) {
                            System.out.println("Record Found: " + found.toString());
                        } else {
                            System.out.println("No patient found with ID: " + searchId);
                        }
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Emergency Queue Menu ---");
                    System.out.println("A. View waiting patients");
                    System.out.println("B. Add patient to queue (Enqueue)");
                    System.out.println("C. Call next patient (Dequeue)");
                    System.out.print("Choice: ");
                    String qChoice = scanner.nextLine().toUpperCase();

                    if (qChoice.equals("A")) {
                        emergencyQueue.displayQueue();
                    } else if (qChoice.equals("B")) {
                        System.out.print("Enter Patient Name: ");
                        String pName = scanner.nextLine();
                        System.out.print("Enter Condition: ");
                        String cond = scanner.nextLine();
                        
                        emergencyQueue.enqueue(new EmergencyPatient(pName, cond));
                        System.out.println("Patient added to the waiting queue!");
                    } else if (qChoice.equals("C")) {
                        EmergencyPatient calledPatient = emergencyQueue.dequeue();
                        if (calledPatient != null) {
                            System.out.println("Now treating: " + calledPatient.toString());
                        }
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Treatment History Menu ---");
                    System.out.println("A. View all treatments (Most recent first)");
                    System.out.println("B. Add new treatment (Push)");
                    System.out.println("C. Undo last treatment (Pop)");
                    System.out.print("Choice: ");
                    String treatChoice = scanner.nextLine().toUpperCase();

                    if (treatChoice.equals("A")) {
                        treatmentHistory.displayStack();
                    } else if (treatChoice.equals("B")) {
                        System.out.print("Enter Patient Name: ");
                        String pName = scanner.nextLine();
                        System.out.print("Enter Treatment Description: ");
                        String desc = scanner.nextLine();
                        System.out.print("Enter Doctor Name: ");
                        String dName = scanner.nextLine();
                        
                        treatmentHistory.push(new Treatment(pName, desc, dName));
                        System.out.println("Treatment recorded successfully!");
                    } else if (treatChoice.equals("C")) {
                        Treatment undone = treatmentHistory.pop();
                        if (undone != null) {
                            System.out.println("Undid treatment: " + undone.toString());
                        }
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Visit History Menu ---");
                    System.out.println("A. View all visits");
                    System.out.println("B. Add new visit");
                    System.out.print("Choice: ");
                    String visitChoice = scanner.nextLine().toUpperCase();

                    if (visitChoice.equals("A")) {
                        visitHistory.displayHistory();
                    } else if (visitChoice.equals("B")) {
                        System.out.print("Enter Patient Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        System.out.print("Enter Reason: ");
                        String reason = scanner.nextLine();
                        
                        visitHistory.addVisit(new PatientVisit(name, date, reason));
                        System.out.println("Visit added successfully!");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;

                case 0:
                    System.out.println("Exiting the system. Goodbye!");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}