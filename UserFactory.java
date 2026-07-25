package hospital;

public class UserFactory {
    public static User createUser(String role) {
        if (role == null) return null;
        switch (role.toLowerCase()) {
            case "patient": return new Patient();
            case "doctor":  return new Doctor();
            default: return null;
        }
    }
}