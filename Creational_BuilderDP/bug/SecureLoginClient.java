public class SecureLoginClient{
    public static void main(String args[]){
        SecureLogin secureLogin = new SecureLoginBuilder().setUsername("User").setPassword("StrongPassword").setAuthentication(true).getSecureLogin();
        System.out.println("Constructed SecureLogin: " + secureLogin);
    }
}
