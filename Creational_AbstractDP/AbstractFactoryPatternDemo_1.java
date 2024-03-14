import securityfactory.*;

public class AbstractFactoryPatternDemo_1 {
    public static void main(String[] args) {
        // Using simple security factory
        SecurityFactory simpleFactory = new SimpleSecurityFactory();
        AuthenticationFactor authFactor = simpleFactory.createAuthenticationFactor();
        authFactor.authenticate();

        AuthorizationFactor authzFactor = simpleFactory.createAuthorizationFactor();
        authzFactor.authorize();

        // Using advanced security factory
        SecurityFactory advancedFactory = new AdvancedSecurityFactory();
        AuthenticationFactor authFactorAdvanced = advancedFactory.createAuthenticationFactor();
        authFactorAdvanced.authenticate();

        AuthorizationFactor authzFactorAdvanced = advancedFactory.createAuthorizationFactor();
        authzFactorAdvanced.authorize();
    }
}
