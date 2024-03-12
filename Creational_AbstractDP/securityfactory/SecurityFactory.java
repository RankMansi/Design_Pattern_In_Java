package securityfactory;

public interface SecurityFactory {
    AuthenticationFactor createAuthenticationFactor();
    AuthorizationFactor createAuthorizationFactor();
}
