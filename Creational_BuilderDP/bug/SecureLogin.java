public class SecureLogin{
    private String username;
    private String password;
    private boolean authentication;

    public SecureLogin(String username, String password, boolean authentication){
        this.username=username;
        this.password=password;
        this.authentication = authentication;
    }

    public String toString(){
        return "SecureLogin [username = " + username + ", password = " + password + ", authentication = " + authentication + "]";
    }
}
