class SecureAuthenticationFacade {
    private final SecureAuthentication secureAuthentication;

    public SecureAuthenticationFacade(SecureAuthentication secureAuthentication) {
        this.secureAuthentication = secureAuthentication;
    }

    public User login(String username, String password) throws AuthenticationException {
        return secureAuthentication.authenticate(username, password);
    }

    public String generateToken(User user) {
        return secureAuthentication.generateToken(user);
    }

    public boolean validateToken(String token) {
        return secureAuthentication.validateToken(token);
    }

    public User getUserFromToken(String token) {
        return secureAuthentication.getUserFromToken(token);
    }
}
