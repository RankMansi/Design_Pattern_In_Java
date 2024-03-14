package secure_logging_auditing;

// Implementation of SecureLogger for logging to a file
public class FileLogger implements SecureLogger {
    @Override
    public void log(String message) {
        // Implement file logging logic here
        System.out.println("Logged message to file: " + message);
    }
}