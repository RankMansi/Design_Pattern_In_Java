package secure_logging_auditing;

// Implementation of SecureLogger for logging to a database
public class DatabaseLogger implements SecureLogger {
    @Override
    public void log(String message) {
        // Implement database logging logic here
        System.out.println("Logged message to database: " + message);
    }
}