package hospital;

public class Patient extends User {
    @Override
    public void showDashboard() {
        System.out.println("Welcome Patient! - Showing Appointments & Medical Records.");
    }
}