package hospital;

public class Hospital {
    public static void main(String[] args) {
        // 1. Singleton Test
        System.out.println("--- Singleton Test ---");
        Database db1 = Database.getInstance();
        Database db2 = Database.getInstance();
        System.out.println("Are both instances equal? " + (db1 == db2));

        // 2. Factory Test
        System.out.println("\n--- Factory Test ---");
        User patient = UserFactory.createUser("patient");
        patient.setName("Ahmed Mahmoud");
        System.out.println("User Name: " + patient.getName());
        patient.showDashboard();

        User doctor = UserFactory.createUser("doctor");
        doctor.setName("Dr. Mohamed Ali");
        System.out.println("User Name: " + doctor.getName());
        doctor.showDashboard();
    }
}