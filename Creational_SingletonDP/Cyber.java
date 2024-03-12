// --------------Usage:---------------

// Secure Session Management is a critical aspect of web applications and systems where user sessions need to be managed securely to maintain user identity and state.
// The SessionManager enum provides a singleton instance (INSTANCE) that manages the session ID generation.
// By using an enum, we ensure that only one instance of SessionManager exists throughout the application, providing a centralized mechanism for session management.

import java.util.UUID;

enum SessionManager {
    INSTANCE;

    private String sessionId;

    private SessionManager() {
        // Generate a unique session ID
        this.sessionId = UUID.randomUUID().toString();
    }

    public String getSessionId() {
        return sessionId;
    }
}

public class Cyber {
    public static void main(String[] args) {
        // Get the singleton instance of SessionManager
        SessionManager sessionManager1 = SessionManager.INSTANCE;

        // Display the session ID
        System.out.println("Session ID 1: " + sessionManager1.getSessionId());

        // Attempt to get another instance of SessionManager
        SessionManager sessionManager2 = SessionManager.INSTANCE;

        // Both instances should reference the same session ID
        System.out.println("Session ID 2: " + sessionManager2.getSessionId());
    }
}
