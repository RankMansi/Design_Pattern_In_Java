public class SecureLoginBuilder{
    private String username;
    private String password;
    private boolean authentication;

	public SecureLoginBuilder setUsername(String username) {
		this.username = username;
        return this;
	}

	public SecureLoginBuilder setPassword(String password) {
		this.password = password;
        return this;
	}

	public SecureLoginBuilder setAuthentication(boolean authentication) {
		this.authentication = authentication;
        return this;
	}

    public SecureLogin getSecureLogin(){
        return new SecureLogin(username, password, authentication);
    }
}