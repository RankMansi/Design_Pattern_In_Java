interface SecureAuthentication {
    User authenticate(String username, String password) throws AuthenticationException;
    String generateToken(User user);
    boolean validateToken(String token);
    User getUserFromToken(String token);
}
