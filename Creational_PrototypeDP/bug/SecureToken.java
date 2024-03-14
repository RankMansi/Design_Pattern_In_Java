import java.security.SecureRandom;
import java.util.Base64;

class SecureToken implements SecureTokenPrototype {
    private String token;

    public SecureToken() {
        generateToken();
    }

    private void generateToken() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] tokenBytes = new byte[16];
        secureRandom.nextBytes(tokenBytes);
        token = Base64.getEncoder().encodeToString(tokenBytes);
    }

    @Override
    public SecureTokenPrototype cloneShallow() throws CloneNotSupportedException {
        return (SecureTokenPrototype) super.clone();
    }

    @Override
    public SecureTokenPrototype cloneDeep() throws CloneNotSupportedException {
        SecureToken clonedToken = (SecureToken) super.clone();
        clonedToken.generateToken(); // Regenerate token for deep clone
        return clonedToken;
    }

    @Override
    public String getToken() {
        return token;
    }
}