package securityfactory;

public class SimpleSecurityFactory implements SecurityFactory {
    public AuthenticationFactor createAuthenticationFactor() {
        return new UsernamePassword();
    }

    public AuthorizationFactor createAuthorizationFactor() {
        return new RoleBasedAuthorization();
    }
}
