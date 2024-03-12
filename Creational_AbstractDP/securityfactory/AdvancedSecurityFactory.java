package securityfactory;

public class AdvancedSecurityFactory implements SecurityFactory {
    public AuthenticationFactor createAuthenticationFactor() {
        return new TwoFactorAuthentication();
    }

    public AuthorizationFactor createAuthorizationFactor() {
        return new AttributeBasedAuthorization();
    }
}
