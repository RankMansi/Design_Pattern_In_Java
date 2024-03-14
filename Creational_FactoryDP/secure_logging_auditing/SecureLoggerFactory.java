package secure_logging_auditing;

// Factory for creating instances of SecureLogger
public class SecureLoggerFactory {
    public SecureLogger getLogger(String loggerType) {
        switch (loggerType.toUpperCase()) {
            case "FILE":
                return new FileLogger();
            case "DATABASE":
                return new DatabaseLogger();
            default:
                throw new IllegalArgumentException("Unsupported logger type: " + loggerType);
        }
    }
}