package hospital;

public class Doctor extends User {
    @Override
    public void showDashboard() {
        System.out.println("Welcome Doctor! - Showing Schedule & Patients.");
    }
}