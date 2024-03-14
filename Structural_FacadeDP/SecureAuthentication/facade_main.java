public class facade_main {
    public static void main(String[] args) {
        // Create an instance of SecureAuthenticationFacade
        SecureAuthenticationFacade facade = new SecureAuthenticationFacade(secureAuthentication);

        // Usage example
        try {
            // Login
            User user = facade.login("johnDoe", "password123");
            System.out.println("Login successful for user: " + user.getUsername());

            // Generate token
            String token = facade.generateToken(user);
            System.out.println("Token generated: " + token);

            // Validate token
            boolean isValid = facade.validateToken(token);
            System.out.println("Token is valid: " + isValid);

            // Get user from token
            User currentUser = facade.getUserFromToken(token);
            System.out.println("User retrieved from token: " + currentUser.getUsername());
        } catch (AuthenticationException e) {
            System.out.println("Authentication failed: " + e.getMessage());
        }
    }
}